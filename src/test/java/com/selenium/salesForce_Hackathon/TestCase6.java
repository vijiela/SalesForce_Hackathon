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
	//	Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.switchTo().defaultContent();
		System.out.println("Switch default");
		waitExplicitly(5, driver.findElement(By.xpath("//span[text()='Post']")));
		driver.findElement(By.xpath("//span[text()='Post']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Post']")).getText());
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.className("cke_wysiwyg_frame cke_reset")));
		Thread.sleep(3000);
		System.out.println("Post text");
		waitExplicitly(5, driver.findElement(By.className("cke_wysiwyg_frame cke_reset")));
		driver.findElement(By.xpath("//table[@class='outerNoSidebar']//td")).getText();
		driver.findElement(By.xpath("//table[@class='outerNoSidebar']//td")).sendKeys("Hi Salesforce techies");
		Thread.sleep(5000);
		driver.findElement(By.id("publishersharebutton")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='File']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("chatterUploadFileAction")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("chatterFile")).click();
		quitBrowser();

	}

}
