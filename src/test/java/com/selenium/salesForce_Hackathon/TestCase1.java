//Login Error message-1
package com.selenium.salesForce_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase1 extends SalesForceUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		
		WebElement ele = driver.findElement(By.id("username"));
		waitExplicitly(5, ele);
		ele.clear();
		ele.sendKeys("vijiela@abc.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("Login")).click();
		quitBrowser();
	}

}
