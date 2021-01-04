package com.selenium.salesForce_Hackathon;

import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase13 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		waitExplicitly(5, driver.findElement(By.id("Account_Tab")));
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Merge Accounts")).click();
		driver.findElement(By.id("srch")).sendKeys("Automation");
		Thread.sleep(5000);
		waitExplicitly(5, driver.findElement(By.xpath("(//input[@name='srchbutton'])[2]")));
		driver.findElement(By.xpath("(//input[@name='srchbutton'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("cid0")).click();
		driver.findElement(By.id("cid1")).click();
		driver.findElement(By.id("cid2")).click();
	
		driver.findElement(By.xpath(("(//input[@name='goNext'])[2]"))).click();		
	}

}
