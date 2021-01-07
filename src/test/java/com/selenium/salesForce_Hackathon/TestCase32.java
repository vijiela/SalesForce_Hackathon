package com.selenium.salesForce_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase32 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
		Thread.sleep(5000);
		
		waitExplicitly(5, driver.findElement(By.cssSelector("a#con4_lkwgt>img")));
		driver.findElement(By.cssSelector("a#con4_lkwgt>img")).click();
		driver.switchTo().activeElement();
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@title='Search']")));
		Thread.sleep(5000);
		System.out.println("in Frame");
		
		driver.findElement(By.xpath("(//th[contains(text(),'Automation')])[1]")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@name='save_new']")).click();
		quitBrowser();



	}

}
