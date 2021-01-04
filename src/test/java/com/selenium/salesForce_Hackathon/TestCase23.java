package com.selenium.salesForce_Hackathon;
//TC-23 List item "Todays Leads" work
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase23 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		waitExplicitly(5,driver.findElement(By.id("fcf")));
		Select se = new Select(driver.findElement(By.id("fcf")));
		
		se.selectByVisibleText("Today's Leads");
		Thread.sleep(5000);

	}

}
