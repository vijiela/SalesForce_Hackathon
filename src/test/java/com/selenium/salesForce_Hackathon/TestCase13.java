package com.selenium.salesForce_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

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
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Merge Accounts")).click();
		waitExplicitly(5, driver.findElement(By.id("srch")));
		driver.findElement(By.id("srch")).sendKeys("Auto");
		Thread.sleep(6000);
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@name='srchbutton'])[2]")));
		driver.findElement(By.xpath("(//input[@name='srchbutton'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("cid0")).click();
		driver.findElement(By.id("cid1")).click();
		driver.findElement(By.id("cid2")).click();
	
		driver.findElement(By.xpath(("(//input[@name='goNext'])[2]"))).click();		
		quitBrowser();
	}

}
