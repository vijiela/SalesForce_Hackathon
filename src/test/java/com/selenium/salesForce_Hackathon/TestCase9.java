package com.selenium.salesForce_Hackathon;
//TC-09 Select "Logout" option from user menu for <username> drop down
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase9 extends SalesForceUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		waitExplicitly(5, driver.findElement(By.id("userNavButton")));
		driver.findElement(By.id("userNavButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		quitBrowser();
	}

}
