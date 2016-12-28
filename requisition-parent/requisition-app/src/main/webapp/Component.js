sap.ui.define(['sap/ui/core/UIComponent'],
	function (UIComponent) {
		"use strict";

		return UIComponent.extend("sap.ui.ariba.p2p.requisitions.wizard.Component", {
			
			metadata: {
				rootView: "sap.ui.ariba.p2p.requisitions.wizard.Requisition",
				dependencies: {
					libs: [
						"sap.m",
						"sap.ui.layout"
					]
				},
				config: {
					sample: {
						stretch : true,
						files: [
							"Requisition.view.xml",
							"Requisition.controller.js"
						],
						"contentDensities": {
							"compact": true,
							"cozy": true
						}
					}
				}
			}
		})
	});
