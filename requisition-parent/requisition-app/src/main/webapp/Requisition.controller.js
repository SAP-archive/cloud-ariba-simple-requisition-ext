sap.ui.define([
   	'jquery.sap.global',
	'sap/ui/core/mvc/Controller',
	'sap/ui/model/json/JSONModel',
	'sap/m/MessageBox'
], function(jQuery, Controller, JSONModel, MessageBox) {
	"use strict";

	var WizardController = Controller.extend("sap.ui.ariba.p2p.requisitions.wizard.Requisition", {
		
		serviceUrl: "/requisition-app/api/requisition",
		
		onInit: function() {
			this._oSubmitButton = this.getView().byId("submitButton");
			this._oCancelButton = this.getView().byId("cancelButton");
			this.sPath = jQuery.sap.getModulePath("sap.ui.ariba.p2p.requisitions.wizard", "/data.json");
			this._initializeApplicationModel();
		},
		
		_initializeApplicationModel: function(){
			var date = new Date();
		    var curr_date = date.getDate();
			var curr_month = date.getMonth() + 1; //Months are zero based
			var curr_year = date.getFullYear();
			var formatedDate = curr_date + "-" + curr_month + "-" + curr_year;

			var oModel = new JSONModel({
				"RequisitionHeader": {
					  "Name": "HCP XML Req Import",
					  "Comment": "This requisition is imported by HCP on date " + formatedDate,
					  "NeedBy": date,
					  "Requester": "hcpuser"
					}
			});
			oModel.loadData(this.sPath, undefined, false, "GET", true);
			this.getView().setModel(oModel);
			this._oSubmitButton.setVisible(false);
			this._oCancelButton.setVisible(false);
		},
						
		onCancel: function(){
			this._onMessageBoxOpen("Are you sure you want to cancel your submission?", "warning", this._initializeApplicationModel);
		},
		
		onSubmit: function(evt){
			this._onMessageBoxOpen("Are you sure you want to submit the requistion request?", "confirm", function(){
				
				sap.ui.core.BusyIndicator.show(0);
				
				var oRequisitionHeader = this.getView().getModel().getProperty("/RequisitionHeader");
				jQuery.post(this.serviceUrl, JSON.stringify(oRequisitionHeader), "json")
				.done(function(data){
					MessageBox.information("Requistion request submitted successfully.");
				}).fail(function(err){
					MessageBox.error("Requistion request was not submitted successfully.");
				}).always(jQuery.proxy(function(){
					this._initializeApplicationModel.apply(this);
					sap.ui.core.BusyIndicator.hide();
				}, this));
			});
		},
				
		_onMessageBoxOpen : function (sMessage, sMessageBoxType, yesHanlderFn) {
			var that = this;
			MessageBox[sMessageBoxType](sMessage, {
				actions: [MessageBox.Action.YES, MessageBox.Action.NO],
				onClose: function (oAction) {
					if (oAction === MessageBox.Action.YES) {
						yesHanlderFn.apply(that);
					}
				},
			});
		},
		
		onPressTile: function(evt){
			var oTile = evt.getSource();
			var ctx = oTile.getBindingContext();
			ctx.getModel().setProperty(ctx.getPath()+ "/number", parseInt(ctx.getObject().number) + 1);
			if(!this._oSubmitButton.getVisible())
				this._oSubmitButton.setVisible(true);
			
			var tiles =  this.getView().getModel().getProperty("/Tiles");
			if(tiles){
				//construct RequisitionItem entities out of the view model's tiles 
				var items = [];
				for(var i=0; i < tiles.length; i++){
					if(tiles[i].number > 0){
						var oItem = {
								"CommodityCode": tiles[i].CommodityCode,
								"Currency": tiles[i].Currency,
								"Description": tiles[i].title,
								"ManPartNumber": tiles[i].info,
								"Price": tiles[i].Price,
								"Quantity": tiles[i].number,
								"Supplier": tiles[i].Supplier,
								"SupplierPartNumber": tiles[i].SupplierPartNumber,
								"UnitOfMeasure": tiles[i].numberUnit
							};
						items.push(oItem);
					}
				}
				if(items.length>0){
					this._oCancelButton.setVisible(true);
					this._oSubmitButton.setVisible(true);
				} else {
					this._oCancelButton.setVisible(false);
					this._oSubmitButton.setVisible(false);
				}
				this.getView().getModel().getProperty("/RequisitionHeader")["RequisitionItems"] = items;				
			}
		}
		
	});

	return WizardController;
});