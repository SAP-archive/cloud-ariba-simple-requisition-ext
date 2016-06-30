
package ariba.buyer.vrealm_3;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ariba.buyer.vrealm_3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "UniqueName");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemDescriptionPriceAmount_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "Amount");
    private final static QName _RequisitionRequisitionImportPullOperation_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "Operation");
    private final static QName _RequisitionRequisitionImportPullImportedHeaderExternalCommentStaging_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ImportedHeaderExternalCommentStaging");
    private final static QName _RequisitionRequisitionImportPullOriginatingSystemReferenceID_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "OriginatingSystemReferenceID");
    private final static QName _RequisitionRequisitionImportPullOriginatingSystem_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "OriginatingSystem");
    private final static QName _RequisitionRequisitionImportPullImportedHeaderCommentStaging_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ImportedHeaderCommentStaging");
    private final static QName _RequisitionRequisitionImportPullHoldTillDate_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "HoldTillDate");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemBuyerPartNumber_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "BuyerPartNumber");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemFacility_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "Facility");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemImportedLineExternalCommentStaging_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ImportedLineExternalCommentStaging");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemQuantity_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "Quantity");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemNumberInCollection_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "NumberInCollection");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemImportedAccountTypeStaging_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ImportedAccountTypeStaging");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemOriginatingSystemLineNumber_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "OriginatingSystemLineNumber");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemImportedLineCommentStaging_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ImportedLineCommentStaging");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemImportedNeedByStaging_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ImportedNeedByStaging");
    private final static QName _RequisitionRequisitionIdExportStatusString_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "StatusString");
    private final static QName _MoneyReferenceAmountInReportingCurrency_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "AmountInReportingCurrency");
    private final static QName _MoneyReferenceConversionDate_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ConversionDate");
    private final static QName _MoneyReferenceApproxAmountInBaseCurrency_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ApproxAmountInBaseCurrency");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemPercentage_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "Percentage");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemSupplierLocationContactID_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ContactID");
    private final static QName _RequisitionRequisitionImportPullDefaultLineItemNeedBy_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "NeedBy");
    private final static QName _RequisitionRequisitionImportPullDefaultLineItemDeliverTo_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "DeliverTo");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemDescriptionPriceBasisQuantity_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "PriceBasisQuantity");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemDescriptionDescription_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "Description");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemDescriptionConversionFactor_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ConversionFactor");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemDescriptionManPartNumber_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "ManPartNumber");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemDescriptionSupplierPartAuxiliaryID_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "SupplierPartAuxiliaryID");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemDescriptionPriceBasisQuantityDesc_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "PriceBasisQuantityDesc");
    private final static QName _RequisitionRequisitionImportPullLineItemsItemDescriptionSupplierPartNumber_QNAME = new QName("urn:Ariba:Buyer:vrealm_3", "SupplierPartNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ariba.buyer.vrealm_3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequisitionImportPullRequest }
     * 
     */
    public RequisitionImportPullRequest createRequisitionImportPullRequest() {
        return new RequisitionImportPullRequest();
    }

    /**
     * Create an instance of {@link RequisitionImportPullReply }
     * 
     */
    public RequisitionImportPullReply createRequisitionImportPullReply() {
        return new RequisitionImportPullReply();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionIdExport }
     * 
     */
    public RequisitionRequisitionIdExport createRequisitionRequisitionIdExport() {
        return new RequisitionRequisitionIdExport();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionIdExport.Custom }
     * 
     */
    public RequisitionRequisitionIdExport.Custom createRequisitionRequisitionIdExportCustom() {
        return new RequisitionRequisitionIdExport.Custom();
    }

    /**
     * Create an instance of {@link MoneyReference }
     * 
     */
    public MoneyReference createMoneyReference() {
        return new MoneyReference();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull }
     * 
     */
    public RequisitionRequisitionImportPull createRequisitionRequisitionImportPull() {
        return new RequisitionRequisitionImportPull();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.Custom }
     * 
     */
    public RequisitionRequisitionImportPull.Custom createRequisitionRequisitionImportPullCustom() {
        return new RequisitionRequisitionImportPull.Custom();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems createRequisitionRequisitionImportPullLineItems() {
        return new RequisitionRequisitionImportPull.LineItems();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item createRequisitionRequisitionImportPullLineItemsItem() {
        return new RequisitionRequisitionImportPull.LineItems.Item();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Custom }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Custom createRequisitionRequisitionImportPullLineItemsItemCustom() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Custom();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation createRequisitionRequisitionImportPullLineItemsItemSupplierLocation() {
        return new RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Description }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Description createRequisitionRequisitionImportPullLineItemsItemDescription() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Description();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Description.Price }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Description.Price createRequisitionRequisitionImportPullLineItemsItemDescriptionPrice() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Description.Price();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.DefaultLineItem }
     * 
     */
    public RequisitionRequisitionImportPull.DefaultLineItem createRequisitionRequisitionImportPullDefaultLineItem() {
        return new RequisitionRequisitionImportPull.DefaultLineItem();
    }

    /**
     * Create an instance of {@link Headers }
     * 
     */
    public Headers createHeaders() {
        return new Headers();
    }

    /**
     * Create an instance of {@link RequisitionImportPullRequest.RequisitionRequisitionImportPullItem }
     * 
     */
    public RequisitionImportPullRequest.RequisitionRequisitionImportPullItem createRequisitionImportPullRequestRequisitionRequisitionImportPullItem() {
        return new RequisitionImportPullRequest.RequisitionRequisitionImportPullItem();
    }

    /**
     * Create an instance of {@link RequisitionImportPullReply.RequisitionRequisitionIdExportItem }
     * 
     */
    public RequisitionImportPullReply.RequisitionRequisitionIdExportItem createRequisitionImportPullReplyRequisitionRequisitionIdExportItem() {
        return new RequisitionImportPullReply.RequisitionRequisitionIdExportItem();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionIdExport.Custom.CustomBoolean }
     * 
     */
    public RequisitionRequisitionIdExport.Custom.CustomBoolean createRequisitionRequisitionIdExportCustomCustomBoolean() {
        return new RequisitionRequisitionIdExport.Custom.CustomBoolean();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionIdExport.Custom.CustomDate }
     * 
     */
    public RequisitionRequisitionIdExport.Custom.CustomDate createRequisitionRequisitionIdExportCustomCustomDate() {
        return new RequisitionRequisitionIdExport.Custom.CustomDate();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionIdExport.Custom.CustomInteger }
     * 
     */
    public RequisitionRequisitionIdExport.Custom.CustomInteger createRequisitionRequisitionIdExportCustomCustomInteger() {
        return new RequisitionRequisitionIdExport.Custom.CustomInteger();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionIdExport.Custom.CustomMoney }
     * 
     */
    public RequisitionRequisitionIdExport.Custom.CustomMoney createRequisitionRequisitionIdExportCustomCustomMoney() {
        return new RequisitionRequisitionIdExport.Custom.CustomMoney();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionIdExport.Custom.CustomString }
     * 
     */
    public RequisitionRequisitionIdExport.Custom.CustomString createRequisitionRequisitionIdExportCustomCustomString() {
        return new RequisitionRequisitionIdExport.Custom.CustomString();
    }

    /**
     * Create an instance of {@link MoneyReference.Currency }
     * 
     */
    public MoneyReference.Currency createMoneyReferenceCurrency() {
        return new MoneyReference.Currency();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.BusinessUnit }
     * 
     */
    public RequisitionRequisitionImportPull.BusinessUnit createRequisitionRequisitionImportPullBusinessUnit() {
        return new RequisitionRequisitionImportPull.BusinessUnit();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.Preparer }
     * 
     */
    public RequisitionRequisitionImportPull.Preparer createRequisitionRequisitionImportPullPreparer() {
        return new RequisitionRequisitionImportPull.Preparer();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.Requester }
     * 
     */
    public RequisitionRequisitionImportPull.Requester createRequisitionRequisitionImportPullRequester() {
        return new RequisitionRequisitionImportPull.Requester();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.Custom.CustomBoolean }
     * 
     */
    public RequisitionRequisitionImportPull.Custom.CustomBoolean createRequisitionRequisitionImportPullCustomCustomBoolean() {
        return new RequisitionRequisitionImportPull.Custom.CustomBoolean();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.Custom.CustomDate }
     * 
     */
    public RequisitionRequisitionImportPull.Custom.CustomDate createRequisitionRequisitionImportPullCustomCustomDate() {
        return new RequisitionRequisitionImportPull.Custom.CustomDate();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.Custom.CustomInteger }
     * 
     */
    public RequisitionRequisitionImportPull.Custom.CustomInteger createRequisitionRequisitionImportPullCustomCustomInteger() {
        return new RequisitionRequisitionImportPull.Custom.CustomInteger();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.Custom.CustomMoney }
     * 
     */
    public RequisitionRequisitionImportPull.Custom.CustomMoney createRequisitionRequisitionImportPullCustomCustomMoney() {
        return new RequisitionRequisitionImportPull.Custom.CustomMoney();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.Custom.CustomString }
     * 
     */
    public RequisitionRequisitionImportPull.Custom.CustomString createRequisitionRequisitionImportPullCustomCustomString() {
        return new RequisitionRequisitionImportPull.Custom.CustomString();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.BillingAddress }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.BillingAddress createRequisitionRequisitionImportPullLineItemsItemBillingAddress() {
        return new RequisitionRequisitionImportPull.LineItems.Item.BillingAddress();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.CommodityCode }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.CommodityCode createRequisitionRequisitionImportPullLineItemsItemCommodityCode() {
        return new RequisitionRequisitionImportPull.LineItems.Item.CommodityCode();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ShipTo }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.ShipTo createRequisitionRequisitionImportPullLineItemsItemShipTo() {
        return new RequisitionRequisitionImportPull.LineItems.Item.ShipTo();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Supplier }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Supplier createRequisitionRequisitionImportPullLineItemsItemSupplier() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Supplier();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomBoolean }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomBoolean createRequisitionRequisitionImportPullLineItemsItemCustomCustomBoolean() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomBoolean();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomDate }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomDate createRequisitionRequisitionImportPullLineItemsItemCustomCustomDate() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomDate();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomInteger }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomInteger createRequisitionRequisitionImportPullLineItemsItemCustomCustomInteger() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomInteger();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomMoney }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomMoney createRequisitionRequisitionImportPullLineItemsItemCustomCustomMoney() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomMoney();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomString }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomString createRequisitionRequisitionImportPullLineItemsItemCustomCustomString() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomString();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation.SetId }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation.SetId createRequisitionRequisitionImportPullLineItemsItemSupplierLocationSetId() {
        return new RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation.SetId();
    }

    

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Account }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Account createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemAccount() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Account();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Department }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Department createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemDepartment() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Department();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.GLBusinessUnit }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.GLBusinessUnit createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemGLBusinessUnit() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.GLBusinessUnit();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Location }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Location createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemLocation() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Location();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.ProcurementUnit }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.ProcurementUnit createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemProcurementUnit() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.ProcurementUnit();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Product }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Product createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemProduct() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Product();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.StatisticsCode }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.StatisticsCode createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemStatisticsCode() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.StatisticsCode();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomBoolean }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomBoolean createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemCustomCustomBoolean() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomBoolean();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomDate }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomDate createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemCustomCustomDate() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomDate();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomInteger }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomInteger createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemCustomCustomInteger() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomInteger();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomMoney }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomMoney createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemCustomCustomMoney() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomMoney();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomString }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomString createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemCustomCustomString() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Custom.CustomString();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Amount.Currency }
     * 
     */
//    public RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Amount.Currency createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemAmountCurrency() {
//        return new RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Amount.Currency();
//    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Description.CommonCommodityCode }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Description.CommonCommodityCode createRequisitionRequisitionImportPullLineItemsItemDescriptionCommonCommodityCode() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Description.CommonCommodityCode();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Description.UnitOfMeasure }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Description.UnitOfMeasure createRequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasure() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Description.UnitOfMeasure();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Description.PriceBasisQuantityUOM }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Description.PriceBasisQuantityUOM createRequisitionRequisitionImportPullLineItemsItemDescriptionPriceBasisQuantityUOM() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Description.PriceBasisQuantityUOM();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.LineItems.Item.Description.Price.Currency }
     * 
     */
    public RequisitionRequisitionImportPull.LineItems.Item.Description.Price.Currency createRequisitionRequisitionImportPullLineItemsItemDescriptionPriceCurrency() {
        return new RequisitionRequisitionImportPull.LineItems.Item.Description.Price.Currency();
    }

    /**
     * Create an instance of {@link RequisitionRequisitionImportPull.DefaultLineItem.ShipTo }
     * 
     */
    public RequisitionRequisitionImportPull.DefaultLineItem.ShipTo createRequisitionRequisitionImportPullDefaultLineItemShipTo() {
        return new RequisitionRequisitionImportPull.DefaultLineItem.ShipTo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.UnitOfMeasure.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.Description.UnitOfMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Product.class)
//    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemProductUniqueName(String value) {
//        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Product.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation.SetId.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemSupplierLocationSetIdUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation.SetId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.DefaultLineItem.ShipTo.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullDefaultLineItemShipToUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.DefaultLineItem.ShipTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "Amount", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.Price.class)
    public JAXBElement<BigDecimal> createRequisitionRequisitionImportPullLineItemsItemDescriptionPriceAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RequisitionRequisitionImportPullLineItemsItemDescriptionPriceAmount_QNAME, BigDecimal.class, RequisitionRequisitionImportPull.LineItems.Item.Description.Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "Operation", scope = RequisitionRequisitionImportPull.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullOperation(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullOperation_QNAME, String.class, RequisitionRequisitionImportPull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ImportedHeaderExternalCommentStaging", scope = RequisitionRequisitionImportPull.class)
    public JAXBElement<Boolean> createRequisitionRequisitionImportPullImportedHeaderExternalCommentStaging(Boolean value) {
        return new JAXBElement<Boolean>(_RequisitionRequisitionImportPullImportedHeaderExternalCommentStaging_QNAME, Boolean.class, RequisitionRequisitionImportPull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "OriginatingSystemReferenceID", scope = RequisitionRequisitionImportPull.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullOriginatingSystemReferenceID(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullOriginatingSystemReferenceID_QNAME, String.class, RequisitionRequisitionImportPull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "OriginatingSystem", scope = RequisitionRequisitionImportPull.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullOriginatingSystem(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullOriginatingSystem_QNAME, String.class, RequisitionRequisitionImportPull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ImportedHeaderCommentStaging", scope = RequisitionRequisitionImportPull.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullImportedHeaderCommentStaging(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullImportedHeaderCommentStaging_QNAME, String.class, RequisitionRequisitionImportPull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "HoldTillDate", scope = RequisitionRequisitionImportPull.class)
    public JAXBElement<XMLGregorianCalendar> createRequisitionRequisitionImportPullHoldTillDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RequisitionRequisitionImportPullHoldTillDate_QNAME, XMLGregorianCalendar.class, RequisitionRequisitionImportPull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = MoneyReference.Currency.class)
    public JAXBElement<String> createMoneyReferenceCurrencyUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, MoneyReference.Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "Amount", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Amount.class)
//    public JAXBElement<BigDecimal> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemAmountAmount(BigDecimal value) {
//        return new JAXBElement<BigDecimal>(_RequisitionRequisitionImportPullLineItemsItemDescriptionPriceAmount_QNAME, BigDecimal.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Amount.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Account.class)
//    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemAccountUniqueName(String value) {
//        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Account.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.ProcurementUnit.class)
//    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemProcurementUnitUniqueName(String value) {
//        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.ProcurementUnit.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.BusinessUnit.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullBusinessUnitUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.BusinessUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "BuyerPartNumber", scope = RequisitionRequisitionImportPull.LineItems.Item.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemBuyerPartNumber(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemBuyerPartNumber_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "Facility", scope = RequisitionRequisitionImportPull.LineItems.Item.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemFacility(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemFacility_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ImportedLineExternalCommentStaging", scope = RequisitionRequisitionImportPull.LineItems.Item.class)
    public JAXBElement<Boolean> createRequisitionRequisitionImportPullLineItemsItemImportedLineExternalCommentStaging(Boolean value) {
        return new JAXBElement<Boolean>(_RequisitionRequisitionImportPullLineItemsItemImportedLineExternalCommentStaging_QNAME, Boolean.class, RequisitionRequisitionImportPull.LineItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "Quantity", scope = RequisitionRequisitionImportPull.LineItems.Item.class)
    public JAXBElement<BigDecimal> createRequisitionRequisitionImportPullLineItemsItemQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RequisitionRequisitionImportPullLineItemsItemQuantity_QNAME, BigDecimal.class, RequisitionRequisitionImportPull.LineItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "NumberInCollection", scope = RequisitionRequisitionImportPull.LineItems.Item.class)
    public JAXBElement<BigInteger> createRequisitionRequisitionImportPullLineItemsItemNumberInCollection(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequisitionRequisitionImportPullLineItemsItemNumberInCollection_QNAME, BigInteger.class, RequisitionRequisitionImportPull.LineItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ImportedAccountTypeStaging", scope = RequisitionRequisitionImportPull.LineItems.Item.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedAccountTypeStaging(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemImportedAccountTypeStaging_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "OriginatingSystemLineNumber", scope = RequisitionRequisitionImportPull.LineItems.Item.class)
    public JAXBElement<BigInteger> createRequisitionRequisitionImportPullLineItemsItemOriginatingSystemLineNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequisitionRequisitionImportPullLineItemsItemOriginatingSystemLineNumber_QNAME, BigInteger.class, RequisitionRequisitionImportPull.LineItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ImportedLineCommentStaging", scope = RequisitionRequisitionImportPull.LineItems.Item.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedLineCommentStaging(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemImportedLineCommentStaging_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ImportedNeedByStaging", scope = RequisitionRequisitionImportPull.LineItems.Item.class)
    public JAXBElement<XMLGregorianCalendar> createRequisitionRequisitionImportPullLineItemsItemImportedNeedByStaging(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RequisitionRequisitionImportPullLineItemsItemImportedNeedByStaging_QNAME, XMLGregorianCalendar.class, RequisitionRequisitionImportPull.LineItems.Item.class, value);
    }

    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Department.class)
//    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemDepartmentUniqueName(String value) {
//        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Department.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.GLBusinessUnit.class)
//    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemGLBusinessUnitUniqueName(String value) {
//        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.GLBusinessUnit.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "StatusString", scope = RequisitionRequisitionIdExport.class)
    public JAXBElement<String> createRequisitionRequisitionIdExportStatusString(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionIdExportStatusString_QNAME, String.class, RequisitionRequisitionIdExport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionIdExport.class)
    public JAXBElement<String> createRequisitionRequisitionIdExportUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionIdExport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "OriginatingSystemReferenceID", scope = RequisitionRequisitionIdExport.class)
    public JAXBElement<String> createRequisitionRequisitionIdExportOriginatingSystemReferenceID(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullOriginatingSystemReferenceID_QNAME, String.class, RequisitionRequisitionIdExport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "OriginatingSystem", scope = RequisitionRequisitionIdExport.class)
    public JAXBElement<String> createRequisitionRequisitionIdExportOriginatingSystem(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullOriginatingSystem_QNAME, String.class, RequisitionRequisitionIdExport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.StatisticsCode.class)
//    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemStatisticsCodeUniqueName(String value) {
//        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.StatisticsCode.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "AmountInReportingCurrency", scope = MoneyReference.class)
    public JAXBElement<BigDecimal> createMoneyReferenceAmountInReportingCurrency(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MoneyReferenceAmountInReportingCurrency_QNAME, BigDecimal.class, MoneyReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "Amount", scope = MoneyReference.class)
    public JAXBElement<BigDecimal> createMoneyReferenceAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RequisitionRequisitionImportPullLineItemsItemDescriptionPriceAmount_QNAME, BigDecimal.class, MoneyReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ConversionDate", scope = MoneyReference.class)
    public JAXBElement<XMLGregorianCalendar> createMoneyReferenceConversionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MoneyReferenceConversionDate_QNAME, XMLGregorianCalendar.class, MoneyReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ApproxAmountInBaseCurrency", scope = MoneyReference.class)
    public JAXBElement<BigDecimal> createMoneyReferenceApproxAmountInBaseCurrency(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MoneyReferenceApproxAmountInBaseCurrency_QNAME, BigDecimal.class, MoneyReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Amount.Currency.class)
//    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemAmountCurrencyUniqueName(String value) {
//        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Amount.Currency.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.PriceBasisQuantityUOM.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemDescriptionPriceBasisQuantityUOMUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.Description.PriceBasisQuantityUOM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.Price.Currency.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemDescriptionPriceCurrencyUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.Description.Price.Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "Quantity", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.class)
//    public JAXBElement<BigDecimal> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemQuantity(BigDecimal value) {
//        return new JAXBElement<BigDecimal>(_RequisitionRequisitionImportPullLineItemsItemQuantity_QNAME, BigDecimal.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "Percentage", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.class)
//    public JAXBElement<BigDecimal> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemPercentage(BigDecimal value) {
//        return new JAXBElement<BigDecimal>(_RequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemPercentage_QNAME, BigDecimal.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.class, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemSupplierLocationUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ContactID", scope = RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemSupplierLocationContactID(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemSupplierLocationContactID_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.SupplierLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.BillingAddress.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemBillingAddressUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.BillingAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "NeedBy", scope = RequisitionRequisitionImportPull.DefaultLineItem.class)
    public JAXBElement<XMLGregorianCalendar> createRequisitionRequisitionImportPullDefaultLineItemNeedBy(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RequisitionRequisitionImportPullDefaultLineItemNeedBy_QNAME, XMLGregorianCalendar.class, RequisitionRequisitionImportPull.DefaultLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "DeliverTo", scope = RequisitionRequisitionImportPull.DefaultLineItem.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullDefaultLineItemDeliverTo(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullDefaultLineItemDeliverTo_QNAME, String.class, RequisitionRequisitionImportPull.DefaultLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "PriceBasisQuantity", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.class)
    public JAXBElement<BigDecimal> createRequisitionRequisitionImportPullLineItemsItemDescriptionPriceBasisQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RequisitionRequisitionImportPullLineItemsItemDescriptionPriceBasisQuantity_QNAME, BigDecimal.class, RequisitionRequisitionImportPull.LineItems.Item.Description.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "Description", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemDescriptionDescription(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionDescription_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.Description.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ConversionFactor", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.class)
    public JAXBElement<BigDecimal> createRequisitionRequisitionImportPullLineItemsItemDescriptionConversionFactor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RequisitionRequisitionImportPullLineItemsItemDescriptionConversionFactor_QNAME, BigDecimal.class, RequisitionRequisitionImportPull.LineItems.Item.Description.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "ManPartNumber", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemDescriptionManPartNumber(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionManPartNumber_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.Description.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "SupplierPartAuxiliaryID", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemDescriptionSupplierPartAuxiliaryID(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionSupplierPartAuxiliaryID_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.Description.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "PriceBasisQuantityDesc", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemDescriptionPriceBasisQuantityDesc(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionPriceBasisQuantityDesc_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.Description.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "SupplierPartNumber", scope = RequisitionRequisitionImportPull.LineItems.Item.Description.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemDescriptionSupplierPartNumber(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionSupplierPartNumber_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.Description.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.ShipTo.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemShipToUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.ShipTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.Supplier.class)
    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemSupplierUniqueName(String value) {
        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.Supplier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vrealm_3", name = "UniqueName", scope = RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Location.class)
//    public JAXBElement<String> createRequisitionRequisitionImportPullLineItemsItemImportedAccountingsStagingSplitAccountingsItemLocationUniqueName(String value) {
//        return new JAXBElement<String>(_RequisitionRequisitionImportPullLineItemsItemDescriptionUnitOfMeasureUniqueName_QNAME, String.class, RequisitionRequisitionImportPull.LineItems.Item.ImportedAccountingsStaging.SplitAccountings.Item.Location.class, value);
//    }

}
