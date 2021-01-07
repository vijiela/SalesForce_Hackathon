package com.selenium.salesForce_Hackathon;

//TC-07-Select "My settings" option from user menu for <username> drop down
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase7 extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		waitExplicitly(5, driver.findElement(By.id("userNavButton")));
		driver.findElement(By.id("userNavButton")).click();
		waitExplicitly(5, driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")));
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		waitExplicitly(5, driver.findElement(By.id("PersonalInfo")));
		driver.findElement(By.id("PersonalInfo")).click();
		waitExplicitly(5, driver.findElement(By.xpath("//div[@class='setupLeaf'][8]")));
		driver.findElement(By.xpath("//div[@class='setupLeaf'][8]")).click();
		waitExplicitly(5, driver.findElement(By.xpath("//div[@class='pShowMore']")));
		driver.findElement(By.xpath("//div[@class='pShowMore']")).click();
		driver.findElement(By.id("DisplayAndLayout_font")).click();
		driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']")).click();
		waitExplicitly(5, driver.findElement(By.id("p4")));
		Select se = new Select(driver.findElement(By.id("p4")));
		se.selectByValue("02u4x000001YXaW");
		Select se1 = new Select(driver.findElement(By.id("duel_select_0")));
		Thread.sleep(5000);
		se1.selectByValue("report");

		driver.findElement(By.xpath("//img[@alt='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("save")).click();
		// Email
		driver.findElement(By.xpath("//div[@id='EmailSetup']//a")).click();
		driver.findElement(By.xpath("//a[@id='EmailSettings_font']")).click();
		driver.findElement(By.name("save")).click();

		// calendar
		driver.findElement(By.id("CalendarAndReminders_font")).click();
		driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
		driver.findElement(By.id("testbtn")).click();
		quitBrowser();

	}

}
