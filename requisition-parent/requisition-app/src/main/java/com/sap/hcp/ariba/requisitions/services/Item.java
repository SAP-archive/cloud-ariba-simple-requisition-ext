package com.sap.hcp.ariba.requisitions.services;

import com.google.gson.annotations.SerializedName;

/**
 * Class for requisition item
 *
 */
public class Item {

	@SerializedName("CommodityCode")
	private String commodityCode;

	@SerializedName("Currency")
	private String currency;

	@SerializedName("Description")
	private String description;

	@SerializedName("ManPartNumber")
	private String manPartNumber;

	@SerializedName("Price")
	private double price;

	@SerializedName("Quantity")
	private double quantity;

	@SerializedName("Supplier")
	private String supplier;

	@SerializedName("SupplierPartNumber")
	private String supplierPartNumber;

	@SerializedName("UnitOfMeasure")
	private String unitOfMeasure;

	/**
	 * Returns commodity code
	 *
	 * @return commodity code
	 */
	public String getCommodityCode() {
		return commodityCode;
	}

	/**
	 * Sets commodity code
	 *
	 * @param commodityCode
	 */
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	/**
	 * Returns currency
	 *
	 * @return currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets currency
	 *
	 * @param currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * Returns description
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets description
	 *
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns man part number
	 *
	 * @return man part number
	 */
	public String getManPartNumber() {
		return manPartNumber;
	}

	/**
	 * Sets man part number
	 *
	 * @param manPartNumber
	 */
	public void setManPartNumber(String manPartNumber) {
		this.manPartNumber = manPartNumber;
	}

	/**
	 * Returns price
	 *
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets price
	 *
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Returns quantity
	 *
	 * @return quantity
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * Sets quantity
	 *
	 * @param quantity
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	/**
	 * Returns supplier
	 *
	 * @return supplier
	 */
	public String getSupplier() {
		return supplier;
	}

	/**
	 * Sets supplier
	 *
	 * @param supplier
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	/**
	 * Returns supplier part number
	 *
	 * @return supplier part number
	 */
	public String getSupplierPartNumber() {
		return supplierPartNumber;
	}

	/**
	 * Sets supplier part number
	 *
	 * @param supplierPartNumber
	 */
	public void setSupplierPartNumber(String supplierPartNumber) {
		this.supplierPartNumber = supplierPartNumber;
	}

	/**
	 * Returns unit of measure
	 *
	 * @return unit of measure
	 */
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * Sets unit of measure
	 *
	 * @param unitOfMeasure
	 */
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

}
