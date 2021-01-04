package com.selenium.salesForce_Hackathon;

//TC-06 Select "My Profile" option from user menu for <username> drop down
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase6 extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.id("userNavButton")).click();
		waitExplicitly(5, driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")));
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(5000);
		waitExplicitly(10, driver.findElement(By.xpath("//img[@alt='Edit Profile']")));

		driver.findElement(By.xpath("//img[@alt='Edit Profile']")).click();
		Thread.sleep(5000);
		System.out.println("Edit clicked");
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		driver.findElement(By.linkText("About")).click();

		Thread.sleep(5000);
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Naga");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.switchTo().defaultContent();
	}

}
