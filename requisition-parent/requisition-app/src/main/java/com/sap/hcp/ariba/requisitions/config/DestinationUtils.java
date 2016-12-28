package com.sap.hcp.ariba.requisitions.config;

import java.text.MessageFormat;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.core.connectivity.api.configuration.ConnectivityConfiguration;
import com.sap.core.connectivity.api.configuration.DestinationConfiguration;

/**
 * Destination utils class.
 */
public class DestinationUtils {

	private static final String ERROR_PROPERTY_NOT_FOUND = "Property [ {0} ] not found in destination [ {1} ]. Hint: Make sure to have the property configured in the destination.";
	private static final String ERROR_DESTINATION_NOT_FOUND = "Destination [ {0} ] not found. Hint: Make sure to have the destination configured.";
	private static final String ERROR_COULD_NOT_LOOKUP_CONNECTIVITY_CONFIGURATION = "Could not lookup Connectivity Configuration. See logs for details.";

	private static final String CONNECTIVITY_CONFIGURATION = "java:comp/env/connectivityConfiguration";
	private static final String API_DESTINATION = "ariba-p2p-api";

	private static final Logger logger = LoggerFactory.getLogger(DestinationUtils.class);

	private Map<String, String> destinationProperties;

	/**
	 * Constructor used to initialize the Connectivity Configuration.
	 * 
	 * @throws RuntimeException
	 *             if connectivity configuration initialization is failed
	 */
	public DestinationUtils() {
		init();
	}

	/**
	 * Returns destination property value by specified destination property key
	 * 
	 * @param propertyKey
	 *            - the key of the searched destination property
	 * @return the value of the destination with the specified destination key.
	 * @throws IllegalArgumentException
	 *             thrown if destination property with the specified key is not
	 *             found
	 */
	public String getDestinationPropertyValue(String propertyKey) {

		String propertyValue = destinationProperties.get(propertyKey);

		if (propertyValue == null) {
			String errorMessage = MessageFormat.format(ERROR_PROPERTY_NOT_FOUND, propertyKey, API_DESTINATION);
			logger.error(errorMessage);
			throw new IllegalArgumentException(errorMessage);
		}

		return propertyValue;
	}

	private void init() {

		try {
			Context ctx = new InitialContext();
			ConnectivityConfiguration configuration = (ConnectivityConfiguration) ctx
					.lookup(CONNECTIVITY_CONFIGURATION);
			destinationProperties = getDestinationProperties(API_DESTINATION, configuration);

		} catch (NamingException e) {
			logger.error(ERROR_COULD_NOT_LOOKUP_CONNECTIVITY_CONFIGURATION, e);
			throw new RuntimeException(ERROR_COULD_NOT_LOOKUP_CONNECTIVITY_CONFIGURATION);
		}
	}

	private Map<String, String> getDestinationProperties(String destinationName,
			ConnectivityConfiguration connectivityConfiguration) {
		DestinationConfiguration destConfiguration = connectivityConfiguration.getConfiguration(destinationName);
		if (destConfiguration == null) {
			String errorMessage = MessageFormat.format(ERROR_DESTINATION_NOT_FOUND, destinationName);
			logger.error(errorMessage);
			throw new IllegalArgumentException(errorMessage);
		}

		return destConfiguration.getAllProperties();
	}
}
