package com.selenium.salesForce_Hackathon;
//Forget Password -4B
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase4B extends SalesForceUtility{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowse();
		goToSalesForceUrl();

			WebElement ele = driver.findElement(By.id("username"));
			waitExplicitly(5, ele);
			ele.clear();
			ele.sendKeys("123");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("22131");
			driver.findElement(By.id("Login")).click();
			quitBrowser();
	}

}
