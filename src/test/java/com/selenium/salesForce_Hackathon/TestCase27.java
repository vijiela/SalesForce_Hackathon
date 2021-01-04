package com.selenium.salesForce_Hackathon;
//TC-27 Check recently created contact in the Contact Page
import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase27 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(5000);
		Select se = new Select(driver.findElement(By.id("hotlist_mode")));
		Thread.sleep(5000);
		se.selectByValue("2");
		
	}

}
