package com.selenium.salesForce_Hackathon;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//TC-19 Test Quarterly Summary Report
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase19 extends SalesForceUtility{

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
		Select se = new Select(driver.findElement(By.id("quarter_q")));
		se.selectByValue("curnext1");
		Thread.sleep(5000);
		Select se1 = new Select(driver.findElement(By.id("open")));
		se1.selectByValue("open");
		driver.findElement(By.xpath("//input[@title='Run Report']")).click();
		quitBrowser();
	}

}
