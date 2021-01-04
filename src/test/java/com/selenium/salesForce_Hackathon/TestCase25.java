package com.selenium.salesForce_Hackathon;

import org.openqa.selenium.By;

//TC-25 Create new contact
import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase25 extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("name_lastcon2")).sendKeys("Naga");
		Thread.sleep(5000);
		driver.findElement(By.id("con4")).sendKeys("Automation");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='save']")).click();

	}

}
