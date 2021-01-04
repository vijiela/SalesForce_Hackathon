package com.selenium.salesForce_Hackathon;
//TC-34 Verify the edited lastname is updated at various places
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase34 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@href='/_ui/core/userprofile/UserProfilePage'])[3]")).click();
		

		waitExplicitly(10, driver.findElement(By.xpath("//img[@alt='Edit Profile']")));

		driver.findElement(By.xpath("//img[@alt='Edit Profile']")).click();
		Thread.sleep(5000);
		System.out.println("Edit clicked");
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		driver.findElement(By.linkText("About")).click();

		Thread.sleep(5000);
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Ela");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.switchTo().defaultContent();
	}

}
