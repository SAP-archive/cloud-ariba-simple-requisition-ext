package ariba.buyer.vrealm_3;

import java.util.Date;
import java.util.GregorianCalendar;

public class PrepareItemParameter {
	public Date needByDate;
	public String shipTo;
	public String deliverTo;
	public String commodityCode;
	public String billingAddress;
	public String manPartNumber;
	public String description;
	public String currency;
	public String partNumber;
	public String uom;
	public String itemComment;
	public String supplierName;
	public String supplierContact;
	public String supplierSetId;
	public String supplierLocation;
	public double quantity;

	public PrepareItemParameter(Date needByDate, String shipTo, String deliverTo,
			String commodityCode, String billingAddress, String manPartNumber, String description,
			String currency, String partNumber, String uom, String itemComment, String supplierName,
			String supplierContact, String supplierSetId, String supplierLocation, double quantity) {
		this.needByDate = needByDate;
		this.shipTo = shipTo;
		this.deliverTo = deliverTo;
		this.commodityCode = commodityCode;
		this.billingAddress = billingAddress;
		this.manPartNumber = manPartNumber;
		this.description = description;
		this.currency = currency;
		this.partNumber = partNumber;
		this.uom = uom;
		this.itemComment = itemComment;
		this.supplierName = supplierName;
		this.supplierContact = supplierContact;
		this.supplierSetId = supplierSetId;
		this.supplierLocation = supplierLocation;
		this.quantity = quantity;
	}
}