package com.selenium.salesForce_Hackathon;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//TC-17 Test Opportunity Pipeline Report
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;


public class TestCase17 extends SalesForceUtility{
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Opportunities")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Opportunity Pipeline")).click();
		quitBrowser();
	}

}
