package com.selenium.salesForce_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase16 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		
		driver.findElement(By.linkText("Opportunities")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("opp3")).sendKeys("Opp1");
		Thread.sleep(2000);
		waitExplicitly(5, driver.findElement(By.cssSelector("a#opp4_lkwgt>img")));

		/*driver.findElement(By.cssSelector("a#opp4_lkwgt>img")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//th/a[contains(text(),'QA')]")).click();*/
		driver.findElement(By.id("opp9")).click();
		driver.findElement(By.xpath("(//td[text()='27'])[2]")).click();
		Select se = new Select(driver.findElement(By.id("opp11")));
		se.selectByValue("Qualification");
		//driver.findElement(By.id("opp12")).sendKeys("8");
		Select se2 = new Select(driver.findElement(By.id("opp6")));
		se2.selectByValue("Phone Inquiry");
		driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();
		quitBrowser();

	}

}
