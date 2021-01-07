package com.selenium.salesForce_Hackathon;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

//TC-20 check leads tab link 
import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase20 extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
	
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		quitBrowser();
	}

}
