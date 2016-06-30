package com.sap.hcp.ariba.requisitions.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.naming.ConfigurationException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.cxf.helpers.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sap.core.connectivity.api.configuration.ConnectivityConfiguration;
import com.sap.core.connectivity.api.configuration.DestinationConfiguration;

import ariba.buyer.vrealm_3.PrepareItemParameter;
import ariba.buyer.vrealm_3.PrepareRequisitionParameter;
import ariba.buyer.vrealm_3.RequisitionImportPullPortType_RequisitionImportPullPortType_Client;

public class RequisitionServlet extends HttpServlet {
	
	private static final Logger logger = LoggerFactory.getLogger(RequisitionServlet.class);
	
	private ConnectivityConfiguration configuration;
	
	private static final String CONNECTIVITY_CONFIGURATION = "java:comp/env/connectivityConfiguration";
	
	private static final String API_DESTINATION = "ariba-p2p-api";
	
	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
	
	@Override
	public void init() throws UnavailableException {
		// Look up the connectivity configuration API
		try {
			Context ctx = new InitialContext();
			configuration = (ConnectivityConfiguration) ctx.lookup(CONNECTIVITY_CONFIGURATION);
		} catch (NamingException e) {
			logger.error("Could not lookup Connectivity Configuration [ {} ] ", CONNECTIVITY_CONFIGURATION, e);
			throw new UnavailableException("Could not lookup Connectivity Configuration. See logs for details.");
		}

		if (configuration == null) {
			throw new UnavailableException("Looking up Conenctivity Configuration returned null.");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String json = IOUtils.readStringFromStream(req.getInputStream());
		if (submitRequisition(json)) {
			resp.setStatus(HttpServletResponse.SC_OK);
		} else {
			resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error in processing the request. See the logs for more details.");
		}
	}

	/**
	 * Submits a requisition
	 *  
	 * @param json
	 *            the request in JSON format, which is going to be submitted
	 * @return true if the requisition was successfully submitted or false if an exception occurred while submitting
	 */

	public boolean submitRequisition(String json) {
		
		if (json == null) {
			throw new IllegalArgumentException("A json parameter must be specified.");
		}
		
		logger.info("Starting requisition submission...");
		logger.info(json);

		RequisitionHeader header = gson.fromJson(json, RequisitionHeader.class);
		
		Map<String, String> configurationParameters = null;
		try {
			configurationParameters = getDestinationProperties(API_DESTINATION);
		} catch (ConfigurationException e) {
			throw new IllegalArgumentException("Conenctivity Configuration initialization failed.", e);
		}
		
		Date needByDate = header.NeedBy;
		String headerComment = header.Comment;
		String headerName = header.Name;
		String billingAddress = configurationParameters.get("billingAddress");
		String requester = (header.Requester != null) ? header.Requester : "unknown";
		String preparer = (header.Requester != null) ? header.Requester : configurationParameters.get("preparer");

		RequisitionItem[] items = header.RequisitionItems;

		PrepareRequisitionParameter reqParameter = new PrepareRequisitionParameter(
				needByDate, configurationParameters.get("shipTo"), 
				configurationParameters.get("businessUnit"),
				configurationParameters.get("deliverTo"),
				headerComment, headerName,
				configurationParameters.get("originatingSystem"),
				configurationParameters.get("originatingSystemId"),
				configurationParameters.get("passwordAdapter"),
				preparer,
				requester,
				configurationParameters.get("headerUniqueName"));
		
		List<PrepareItemParameter> prepareItems = new ArrayList<>();
		for (RequisitionItem item : items) {
			String commodityCode = configurationParameters.get("commodityCode");
			String currency = configurationParameters.get("currency");
			String description = item.Description;
			String manPartNumber = item.ManPartNumber;
			Double quantity = item.Quantity;
			String supplier = item.Supplier;
			String supplierPartNumber = item.SupplierPartNumber;
			String unitOfMeasure = item.UnitOfMeasure;
			String itemComment = item.Description;
			String supplierContact = null;//"483-HQ";
			String supplierSetId = null;//"SHARE";
			String supplierLocation = null;//"did491-hq";

			PrepareItemParameter itemParameter = new PrepareItemParameter(needByDate, reqParameter.shipTo,
					reqParameter.deliverTo, commodityCode, billingAddress, manPartNumber, description, currency,
					supplierPartNumber, unitOfMeasure, itemComment, supplier, supplierContact, supplierSetId,
					supplierLocation, quantity);
			prepareItems.add(itemParameter);
		}

		reqParameter.items = prepareItems;
		try {
			URL wsdlURL = new URL(configurationParameters.get("URL"));
			StringBuilder authorization = new StringBuilder();
			authorization.append("Basic ")
				.append(configurationParameters.get("User"))
				.append(":")
				.append(configurationParameters.get("Password"));
			RequisitionImportPullPortType_RequisitionImportPullPortType_Client
				.submitRequisition(wsdlURL, reqParameter,
					authorization.toString());
		} catch (MalformedURLException | DatatypeConfigurationException e) {
			logger.error("Exception occurred while trying to submit the requisiton", e);
			return false;
		}

		logger.info("Successfully submitted a requisition for header");
		return true;
	}
	
	
	/**
	 * Returns a map containing the destination properties for the given destination
	 */
	private Map<String, String> getDestinationProperties(String destinationName) throws ConfigurationException {
		
		if (configuration == null) {
			try {
				init();
			} catch (UnavailableException e) {
				throw new IllegalArgumentException("Connectivity Configuration initialization failed.", e);
			}
		}
		
		DestinationConfiguration destConfiguration = configuration.getConfiguration(destinationName);
		if (destConfiguration == null) {
			throw new ConfigurationException(
					String.format("Destination [ %s ] not found. Hint: Make sure to have the destination configured.", destinationName));
		}
		logger.debug("Getting destination properties for destination [ {} ]", destinationName);
		return destConfiguration.getAllProperties();
	}
	
}
