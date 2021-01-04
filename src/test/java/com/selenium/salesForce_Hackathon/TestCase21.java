package com.selenium.salesForce_Hackathon;
//TC-21 Validate 'View' drop down list contents
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase21 extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		//Select se = new Select(driver.findElement(By.id("fcf")));
		driver.findElement(By.id("fcf")).click();
		
	}

}
