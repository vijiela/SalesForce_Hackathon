package com.selenium.salesForce_Hackathon;
//TC-15 opportunities drop down
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase15 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Opportunities")).click();
		Thread.sleep(5000);
		Select se = new Select(driver.findElement(By.id("fcf")));
		driver.findElement(By.id("fcf")).click();

	}

}
