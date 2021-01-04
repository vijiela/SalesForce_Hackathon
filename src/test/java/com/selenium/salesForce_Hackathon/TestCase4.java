package com.selenium.salesForce_Hackathon;

//Forget Password-4A
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase4 extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		Thread.sleep(3000);
		driver.findElement(By.id("forgot_password_link")).click();
		driver.findElement(By.id("un")).sendKeys("vijiela@abc.com");
		driver.findElement(By.id("continue")).click();
	}

}
