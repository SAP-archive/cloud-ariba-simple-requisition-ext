package com.sap.hcp.ariba.requisitions.services;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * Class for requisition header
 *
 */
public class RequisitionHeader {

	@SerializedName("Name")
	public String name;

	@SerializedName("Comment")
	public String comment;

	@SerializedName("NeedBy")
	public Date needBy;

	@SerializedName("Requester")
	public String requester;

	@SerializedName("Preparer")
	public String preparer;

	@SerializedName("RequisitionItems")
	public Item[] requisitionItems;

	/**
	 * Returns name
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns comment
	 *
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets comment
	 *
	 * @param comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * Returns need by
	 *
	 * @return need by
	 */
	public Date getNeedBy() {
		return needBy;
	}

	/**
	 * Sets need by
	 *
	 * @param needBy
	 */
	public void setNeedBy(Date needBy) {
		this.needBy = needBy;
	}

	/**
	 * Returns requester
	 *
	 * @return requester
	 */
	public String getRequester() {
		return requester;
	}

	/**
	 * Sets requester
	 *
	 * @param requester
	 */
	public void setRequester(String requester) {
		this.requester = requester;
	}

	/**
	 * Returns preparer
	 *
	 * @return preparer
	 */
	public String getPreparer() {
		return preparer;
	}

	/**
	 * Sets preparer
	 *
	 * @param preparer
	 */
	public void setPreparer(String preparer) {
		this.preparer = preparer;
	}

	/**
	 * Returns requisition items
	 *
	 * @return requisition items
	 */
	public Item[] getRequisitionItems() {
		return requisitionItems;
	}

	/**
	 * Sets requisition items
	 *
	 * @param requisitionItems
	 */
	public void setRequisitionItems(Item[] requisitionItems) {
		this.requisitionItems = requisitionItems;
	}

}
