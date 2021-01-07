package com.selenium.salesForce_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase36 extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.linkText("Home")).click();

		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("//a[@href='/00U/c?md3=6&md0=2021']")).click();
		driver.findElement(By.id("p:f:j_id25:j_id61:28:j_id64")).click();
		driver.findElement(By.cssSelector("div#ep>div:nth-of-type(2)>div:nth-of-type(4)>table>tbody>tr:nth-of-type(2)>td:nth-of-type(2)>div>a>img")).click();
		driver.switchTo().activeElement();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@href='javascript:pickValue(4);']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Other']")).click();
		waitExplicitly(5, driver.findElement(By.className("listItem4")));
		driver.findElement(By.className("listItem4")).click();
		driver.switchTo().defaultContent();
		Select se = new Select(driver.findElement(By.id("EndDateTime_time")));
		se.selectByValue("9:00 PM");
		driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();

	}

}
