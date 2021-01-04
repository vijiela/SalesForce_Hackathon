package com.selenium.salesForce_Hackathon;
//TC-24 Check "New" button on Leads Home
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase24 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		driver.findElement(By.id("name_lastlea2")).sendKeys("ABCD");
		driver.findElement(By.id("lea3")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@name='save']")).click();

	}

}
