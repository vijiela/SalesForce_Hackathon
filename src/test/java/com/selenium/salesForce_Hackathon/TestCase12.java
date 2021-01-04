package com.selenium.salesForce_Hackathon;
//TC-12 Edit view
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase12 extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		waitExplicitly(5, driver.findElement(By.id("Account_Tab")));
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(5000);
		Select se = new Select(driver.findElement(By.id("fcf")));
		se.selectByIndex(3);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("fname")).sendKeys("QA87374");
		Select Se1 = new Select(driver.findElement(By.id("fcol1")));
		Se1.selectByIndex(10);
		Select se2 = new Select(driver.findElement(By.id("fop1")));
		se2.selectByValue("e");

		driver.findElement(By.id("fval1")).sendKeys("Currentdate");

		Select se3 = new Select(driver.findElement(By.id("colselector_select_0")));
		se3.selectByValue("ACCOUNT.ACCOUNT_NUMBER");
		driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
		driver.findElement(By.xpath("(//input[@name='save'])[3]")).click();

	}

}
