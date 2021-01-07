package com.selenium.salesForce_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
//TC-31 Check the Cancel button works fine in Create New View
import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase31 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.linkText("Create New View")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fname")).sendKeys("ABCD");
		Thread.sleep(5000);
		driver.findElement(By.id("devname")).sendKeys("EFGH");                                                                                                                                                                                                                                                                           
		driver.findElement(By.xpath("//input[@name='cancel']")).click();
		quitBrowser();

	}

}
