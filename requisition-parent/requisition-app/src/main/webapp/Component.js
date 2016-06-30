sap.ui.define(['sap/ui/core/UIComponent'],
	function (UIComponent) {
		"use strict";

		return UIComponent.extend("sap.ui.ariba.p2p.requisitions.wizard.Component", {
			
			metadata: {
				rootView: "sap.ui.ariba.p2p.requisitions.wizard.V",
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
							"V.view.xml",
							"C.controller.js"
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
