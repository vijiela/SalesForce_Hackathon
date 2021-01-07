package com.selenium.salesForce_Hackathon;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//TC-18 Test Stuck Opportunities Report
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase18 extends SalesForceUtility{

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
		driver.findElement(By.linkText("Stuck Opportunities")).click();
		quitBrowser();

	}

}
