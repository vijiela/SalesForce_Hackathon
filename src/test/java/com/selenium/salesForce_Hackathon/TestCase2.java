//Login to SalesForce-2
package com.selenium.salesForce_Hackathon;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase2 extends SalesForceUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		quitBrowser();
	}

}
