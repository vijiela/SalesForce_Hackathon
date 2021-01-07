package com.selenium.salesForce_Hackathon;
//Select user menu for <username> drop down
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase5 extends SalesForceUtility{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.id("userNavButton")).click();
		quitBrowser();
	}

}
