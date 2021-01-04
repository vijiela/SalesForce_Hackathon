package com.selenium.salesForce_Hackathon;
//TC-26 Create new view in the Contact Page
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase26 extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New View")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fname")).sendKeys("Viji1234");
		Thread.sleep(5000);
		driver.findElement(By.id("devname")).sendKeys("Viji123457878                                                                                                                                                                                                                                                                                                                          ");
		driver.findElement(By.xpath("//input[@name='save']")).click();
		
	}

}
