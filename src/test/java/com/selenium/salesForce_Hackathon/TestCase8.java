package com.selenium.salesForce_Hackathon;

//TC-08 Select "Developers Console" option from user menu for <username> drop down
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase8 extends SalesForceUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		waitExplicitly(5, driver.findElement(By.id("userNavButton")));
		driver.findElement(By.id("userNavButton")).click();
		waitExplicitly(5, driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")).click();
		quitBrowser();
	}

}
