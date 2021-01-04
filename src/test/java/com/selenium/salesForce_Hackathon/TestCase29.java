package com.selenium.salesForce_Hackathon;
//TC-29 View a contact in the contact Page
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase29 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("weeerf")).click();

	}

}
