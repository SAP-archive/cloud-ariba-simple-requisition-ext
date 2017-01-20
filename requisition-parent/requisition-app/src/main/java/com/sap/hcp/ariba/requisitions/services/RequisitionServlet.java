package com.sap.hcp.ariba.requisitions.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.SOAPException;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sap.hcp.ariba.requisitions.config.DestinationProperties;

import ariba.buyer.requisition.Requisition;
import ariba.buyer.requisition.RequisitionItem;
import ariba.buyer.requisition.RequisitionSOAPClient;

public class RequisitionServlet extends HttpServlet {

	private static final long serialVersionUID = 7560329682426231472L;

	private static final String DEBUG_SUCCESSFULLY_SUBMITTED_A_REQUISITION_FOR_HEADER_MESSAGE = "Successfully submitted a requisition for header";
	private static final String DEBUG_STARTING_REQUISITION_SUBMISSION_MESSAGE = "Starting requisition submission: {}";

	private static final String ERROR_REQUEST_READER_PARAMETER_MUST_BE_SPECIFIED_MESSAGE = "Parameter 'requestJson' must be specified.";
	private static final String ERROR_IN_PROCESSING_THE_REQUEST_SEE_THE_LOGS_FOR_MORE_DETAILS_MESSAGE = "Error in processing the request. See the logs for more details.";

	private static final String TWO_STRINGS_FORMAT = "{0}{1}";
	private static final Long ORIGINATING_SYSTEM_LINE_NUMBER = 1l;
	private static final Long NUMBER_IN_COLLECTION = 1l;
	private static final String REQUISITION_IMPORT_PULL_PATH = "/RequisitionImportPull";

	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
	private static final Logger logger = LoggerFactory.getLogger(RequisitionServlet.class);

	private DestinationProperties destProperties;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			destProperties = new DestinationProperties();
			String requestJson = IOUtils.toString(req.getInputStream(), Charset.defaultCharset());
			submitRequisiton(requestJson);
			resp.setStatus(HttpServletResponse.SC_OK);
		} catch (SOAPException e) {
			resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
					ERROR_IN_PROCESSING_THE_REQUEST_SEE_THE_LOGS_FOR_MORE_DETAILS_MESSAGE);
		}

	}

	/**
	 * Submits a requisition
	 * 
	 * @param requestJson
	 *            - the request as String in JSON format, which is going to be
	 *            submitted
	 * @throws SOAPException
	 *             if there is problem with connection or request/response
	 *             message
	 * @throws MalformedURLException
	 *             if no protocol is specified or an unknown protocol is found.
	 * @throws IllegalArgumentException
	 *             if parameter 'requestJson' is null
	 */
	private void submitRequisiton(String requestJson) throws SOAPException, MalformedURLException {
		if (requestJson == null) {
			logger.error(ERROR_REQUEST_READER_PARAMETER_MUST_BE_SPECIFIED_MESSAGE);
			throw new IllegalArgumentException(ERROR_REQUEST_READER_PARAMETER_MUST_BE_SPECIFIED_MESSAGE);
		}
		logger.debug(DEBUG_STARTING_REQUISITION_SUBMISSION_MESSAGE, requestJson);

		RequisitionHeader requisitionHeader = gson.fromJson(requestJson, RequisitionHeader.class);

		Requisition requisition = createRequisition(requisitionHeader);

		URL submitRequisitionEndpointUrl = new URL(
				MessageFormat.format(TWO_STRINGS_FORMAT, destProperties.getUrl(), REQUISITION_IMPORT_PULL_PATH));

		RequisitionSOAPClient.submit(submitRequisitionEndpointUrl, requisition, destProperties.getUser(),
				destProperties.getPassword());

		logger.debug(DEBUG_SUCCESSFULLY_SUBMITTED_A_REQUISITION_FOR_HEADER_MESSAGE);
	}

	private Requisition createRequisition(RequisitionHeader header) {

		Date needByDate = header.getNeedBy();
		String headerComment = header.getComment();
		String headerName = header.getName();
		String billingAddress = destProperties.getBillingAddress();
		String requester = (header.getRequester() != null) ? header.getRequester() : destProperties.getRequester();
		String preparer = (header.getPreparer() != null) ? header.getPreparer() : destProperties.getPreparer();
		String commonCommodityCodeDomain = destProperties.getCommonCommodityCodeDomain();
		String commonCommodityCodeName = destProperties.getCommonCommodityCodeName();
		Item[] items = header.getRequisitionItems();

		Requisition reqParameter = new Requisition().needByDate(needByDate).shipTo(destProperties.getShipTo())
				.businessUnit(destProperties.getBusinessUnit()).deliverTo(destProperties.getDeliverTo())
				.headerComment(headerComment).headerName(headerName)
				.originatingSystem(destProperties.getOriginatingSystem())
				.originatingSystemId(destProperties.getOriginatingSystemId())
				.passwordAdapter(destProperties.getPasswordAdapter()).preparer(preparer).requester(requester)
				.headerUniqueName(destProperties.getHeaderUniqueName())
				.namespaceXMLNSvariant(destProperties.getNamespaceXmlnsVariant());

		List<RequisitionItem> prepareItems = createRequisitionItems(items, needByDate, reqParameter.getShipTo(),
				reqParameter.getDeliverTo(), billingAddress, commonCommodityCodeDomain, commonCommodityCodeName);

		reqParameter.items(prepareItems);

		return reqParameter;
	}

	private List<RequisitionItem> createRequisitionItems(Item[] items, Date needByDate, String shipTo, String deliverTo,
			String billingAddress, String commonCommodityCodeDomain, String commonCommodityCodeName) {
		List<RequisitionItem> requisitionItems = new ArrayList<>();

		for (Item item : items) {
			String commodityCode = item.getCommodityCode();
			String currency = item.getCurrency();
			String description = item.getDescription();
			String manPartNumber = item.getManPartNumber();
			Double quantity = item.getQuantity();
			String supplier = item.getSupplier();
			String supplierPartNumber = item.getSupplierPartNumber();
			String unitOfMeasure = item.getUnitOfMeasure();
			String itemComment = item.getDescription();
			Double itemPrice = item.getPrice();

			RequisitionItem requisitionItem = new RequisitionItem().needByDate(needByDate).shipTo(shipTo)
					.deliverTo(deliverTo).commodityCode(commodityCode).billingAddress(billingAddress)
					.manPartNumber(manPartNumber).description(description).currency(currency)
					.supplierPartNumber(supplierPartNumber).unitOfMeasure(unitOfMeasure).itemComment(itemComment)
					.supplierName(supplier).quantity(quantity).itemPrice(itemPrice)
					.numberInCollection(NUMBER_IN_COLLECTION)
					.originatingSystemLineNumber(ORIGINATING_SYSTEM_LINE_NUMBER)
					.commonCommodityCodeDomain(commonCommodityCodeDomain)
					.commonCommodityCodeName(commonCommodityCodeName);
			requisitionItems.add(requisitionItem);
		}

		return requisitionItems;
	}

}
