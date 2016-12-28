package com.sap.hcp.ariba.requisitions.config;

/**
 * Used to returns properties from destination
 *
 */
public class DestinationProperties {

	private static final String COMMON_COMMODITY_CODE_DOMAIN = "CommonCommodityCodeDomain";
	private static final String COMMON_COMMODITY_CODE_NAME = "CommonCommodityCodeName";
	private static final String NAMESPACE_XMLNS_VARIANT = "namespaceXMLNSvariant";
	private static final String REQUISITION_NAME = "requisitionName";
	private static final String REQUISITION_COMMENT = "requisitionComment";
	private static final String URL = "URL";
	private static final String PASSWORD = "Password";
	private static final String USER = "User";
	private static final String CURRENCY = "currency";
	private static final String COMMODITY_CODE = "commodityCode";
	private static final String HEADER_UNIQUE_NAME = "headerUniqueName";
	private static final String PASSWORD_ADAPTER = "passwordAdapter";
	private static final String ORIGINATING_SYSTEM_ID = "originatingSystemId";
	private static final String ORIGINATING_SYSTEM = "originatingSystem";
	private static final String DELIVER_TO = "deliverTo";
	private static final String BUSINESS_UNIT = "businessUnit";
	private static final String SHIP_TO = "shipTo";
	private static final String REQUESTER = "requester";
	private static final String PREPARER = "preparer";
	private static final String BILLING_ADDRESS = "billingAddress";
	private static final String PART_NUMBER_ITEM1 = "partNumberItem1";
	private static final String PART_NUMBER_ITEM2 = "partNumberItem2";
	private static final String PART_NUMBER_ITEM3 = "partNumberItem3";

	private static DestinationUtils connectivityConfiguration;

	/**
	 * Constructor for DestinationProperties
	 */
	public DestinationProperties() {
		if (connectivityConfiguration == null) {
			connectivityConfiguration = new DestinationUtils();
		}
	}

	/**
	 * Returns common commodity code domain property from destination
	 *
	 * @return common commodity code domain property from destination
	 */
	public String getCommonCommodityCodeDomain() {
		return getProperty(COMMON_COMMODITY_CODE_DOMAIN);
	}

	/**
	 * Returns common commodity code name property from destination
	 *
	 * @return common commodity code name property from destination
	 */
	public String getCommonCommodityCodeName() {
		return getProperty(COMMON_COMMODITY_CODE_NAME);
	}

	/**
	 * Returns namespace XMLNS variant property from destination
	 *
	 * @return namespace XMLNS variant property from destination
	 */
	public String getNamespaceXmlnsVariant() {
		return getProperty(NAMESPACE_XMLNS_VARIANT);
	}

	/**
	 * Returns requisition name property from destination
	 *
	 * @return requisition name property from destination
	 */
	public String getRequisitionName() {
		return getProperty(REQUISITION_NAME);
	}

	/**
	 * Returns requisition comment property from destination
	 *
	 * @return requisition comment property from destination
	 */
	public String getRequisitionComment() {
		return getProperty(REQUISITION_COMMENT);
	}

	/**
	 * Returns URL property from destination
	 *
	 * @return URL property from destination
	 */
	public String getUrl() {
		return getProperty(URL);
	}

	/**
	 * Returns password property from destination
	 *
	 * @return password property from destination
	 */
	public String getPassword() {
		return getProperty(PASSWORD);
	}

	/**
	 * Returns user property from destination
	 *
	 * @return user property from destination
	 */
	public String getUser() {
		return getProperty(USER);
	}

	/**
	 * Returns currency property from destination
	 *
	 * @return currency property from destination
	 */
	public String getCurrency() {
		return getProperty(CURRENCY);
	}

	/**
	 * Returns commodity code property from destination
	 *
	 * @return commodity code property from destination
	 */
	public String getCommodityCode() {
		return getProperty(COMMODITY_CODE);
	}

	/**
	 * Returns header unique name property from destination
	 *
	 * @return header unique name property from destination
	 */
	public String getHeaderUniqueName() {
		return getProperty(HEADER_UNIQUE_NAME);
	}

	/**
	 * Returns password adapter property from destination
	 *
	 * @return password adapter property from destination
	 */
	public String getPasswordAdapter() {
		return getProperty(PASSWORD_ADAPTER);
	}

	/**
	 * Returns originating system id property from destination
	 *
	 * @return originating system id property from destination
	 */
	public String getOriginatingSystemId() {
		return getProperty(ORIGINATING_SYSTEM_ID);
	}

	/**
	 * Returns originating system property from destination
	 *
	 * @return originating system property from destination
	 */
	public String getOriginatingSystem() {
		return getProperty(ORIGINATING_SYSTEM);
	}

	/**
	 * Returns deliver to property from destination
	 *
	 * @return deliver to property from destination
	 */
	public String getDeliverTo() {
		return getProperty(DELIVER_TO);
	}

	/**
	 * Returns business unit property from destination
	 *
	 * @return business unit property from destination
	 */
	public String getBusinessUnit() {
		return getProperty(BUSINESS_UNIT);
	}

	/**
	 * Returns ship to property from destination
	 *
	 * @return ship to property from destination
	 */
	public String getShipTo() {
		return getProperty(SHIP_TO);
	}

	/**
	 * Returns requester property from destination
	 *
	 * @return requester property from destination
	 */
	public String getRequester() {
		return getProperty(REQUESTER);
	}

	/**
	 * Returns preparer property from destination
	 *
	 * @return preparer property from destination
	 */
	public String getPreparer() {
		return getProperty(PREPARER);
	}

	/**
	 * Returns billing address property from destination
	 *
	 * @return billing address property from destination
	 */
	public String getBillingAddress() {
		return getProperty(BILLING_ADDRESS);
	}

	/**
	 * Returns part number item 1 property from destination
	 *
	 * @return part number item 1 property from destination
	 */
	public String getPartNumberItem1() {
		return getProperty(PART_NUMBER_ITEM1);
	}

	/**
	 * Returns part number item 2 property from destination
	 *
	 * @return part number item 2 property from destination
	 */
	public String getPartNumberItem2() {
		return getProperty(PART_NUMBER_ITEM2);
	}

	/**
	 * Returns part number item 3 property from destination
	 *
	 * @return part number item 3 property from destination
	 */
	public String getPartNumberItem3() {
		return getProperty(PART_NUMBER_ITEM3);
	}

	private String getProperty(String propertyName) {
		return connectivityConfiguration.getDestinationPropertyValue(propertyName);
	}
}
