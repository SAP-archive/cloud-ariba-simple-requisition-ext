[![Not Maintained](https://img.shields.io/badge/Maintenance%20Level-Not%20Maintained-yellow.svg)](https://gist.github.com/cheerfulstoic/d107229326a01ff0f333a1d3476e068d)

# Ariba Simple Requisition

[![REUSE status](https://api.reuse.software/badge/github.com/SAP-samples/cloud-ariba-simple-requisition-ext)](https://api.reuse.software/info/github.com/SAP-samples/cloud-ariba-simple-requisition-ext)

## Introduction

This is an SAP HANA Cloud Platform Web application that demonstrates the consumption of Ariba P2P API for purchasing requisitions.

## Prerequisites

1.    Eclipse installed with SAP HANA Cloud Platform Tools plugins.
2.    JDK 1.7 set as an Installed JRE in Eclipse: *Preferences > Java > Installed JREs*.
3.    Java Web Tomcat 7 or Java Web Tomcat 8 set as a runtime environment in Eclipse: *Preferences > Server > Runtime Environments*.
4.    [Destinations configured for connecting to the Ariba API](#configure-the-destinations).

## Build and Deploy the Application

1. Clone the Git repository.
2. Import the project as a Maven project into your Eclipse workspace. 
>*Note*: Make sure you use JDK 1.7 for this project. You can configure this in the project build path.
3. Run the *requisition-parent* project with Maven goal `clean install`. 
4. If you are deploying the application locally, see [Creating and Deleting Destinations Locally](https://help.hana.ondemand.com/help/frameset.htm?7fa92ffa007346f58491999361928303.html).<br>
If you are deploying it on the Cloud, see [Creating and Deleting Destinations on the Cloud](https://help.hana.ondemand.com/help/frameset.htm?94dddf7d9e56401ba1719b7e836d8ee9.html).
5. Deploy the application. 
>*Note*: Make sure you select the Java Web Tomcat 7 or Java Web Tomcat 8 as a runtime environment.
6. To access the application, follow the steps described in the [Access the application](#access-the-application) section.

## Configure the Destination

You need to configure an HTTP Connectivity Destination for the Ariba P2P API before running the project.
>*Note*: To learn more about how to configure the destination, see [SAP HANA Cloud Platform Destinations Documentation] (https://help.hana.ondemand.com/help/frameset.htm?e4f1d97cbb571014a247d10f9f9a685d.html).

The HTTP API Destination looks like this:

	Name=ariba-p2p-api
	Description=Ariba P2P SOAP WS API Destination
	Type=HTTP
	URL=https\://<Ariba instance>/Buyer/soap/<Ariba realm>
	User=<endpoint-user>
	Password=<endpoint-password>
	Authentication=BasicAuthentication
	ProxyType=Internet
	deliverTo=<deliver to name>
	headerUniqueName=<header>
	shipTo=<shipping address>
	billingAddress=<billing address>
	originatingSystem=<originating system>
	passwordAdapter=PasswordAdapter1
	preparer=<preparer user>
	requester=<requester user>
	originatingSystemId=<system id>
	businessUnit=<business unit>
	CommonCommodityCodeDomain=<common commodity code domain>
	CommonCommodityCodeName=<common commodity code name>
	requisitionComment=<comment for requisition>
	requisitionName=<requisition name>
	namespaceXMLNSvariant=<namespace XMLNS variant>

## Access the application

If you deploy the application on the cloud, this is the URL pattern that you use to access it: `http://<application><account>.<domain>/requisition-app/`

If you run the application locally, then use this URL pattern: `http://<host>:<port>/requisition-app/`.

You should see a kiosk-like user interface with a list of products presented as tiles. 

To choose the amount of a given product item that you want to order, select or touch (depending on the device) the respective tile.

* SAP HANA Cloud Platform Documentation - https://help.hana.ondemand.com/

## License

License

Copyright © 2016-2020 SAP SE or an SAP affiliate company. All rights reserved. This project is licensed under the Apache Software License, version 2.0 except as noted otherwise in the [LICENSE file](LICENSES/Apache-2.0.txt).
