package com.selenium.salesForce_Hackathon;
//TC-18 Test Stuck Opportunities Report
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase18 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Opportunities")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Stuck Opportunities")).click();

	}

}
