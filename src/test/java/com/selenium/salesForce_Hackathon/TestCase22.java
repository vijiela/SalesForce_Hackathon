package com.selenium.salesForce_Hackathon;

//TC-22defaultView Functionality of the Go Button
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase22 extends SalesForceUtility{

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
		driver.findElement(By.id("userNavButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(5000);
		loginToSalesForcePortal();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		waitExplicitly(5,driver.findElement(By.id("fcf")));
		driver.findElement(By.xpath("//input[@name='go']")).click();
		
		//driver.findElement(By.id("fcf")).click();
	}

}
