package com.selenium.salesForce_Hackathon;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//TC-11 Create new view
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase11 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		waitExplicitly(5,driver.findElement(By.id("Account_Tab")));
		driver.findElement(By.id("Account_Tab")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(5000);
		waitExplicitly(5,driver.findElement(By.id("fname")));
		driver.findElement(By.id("fname")).sendKeys("VijiView");
		waitExplicitly(5,driver.findElement(By.id("devname")));
		driver.findElement(By.id("devname")).sendKeys("Viji1236");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='save']")).click();
		quitBrowser();
	}

}
