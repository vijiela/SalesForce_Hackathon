package com.selenium.salesForce_Hackathon;

//Check Remember Me-3
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase3 extends SalesForceUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();

		WebElement ele = driver.findElement(By.id("username"));
		waitExplicitly(5, ele);
		ele.clear();
		ele.sendKeys("vijiela@abc.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("tekarch@123");
		driver.findElement(By.xpath("//input[@name='rememberUn']")).click();
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		quitBrowser();

	}

}
