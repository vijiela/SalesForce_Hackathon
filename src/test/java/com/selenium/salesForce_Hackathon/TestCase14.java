package com.selenium.salesForce_Hackathon;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//TC-14 Create account report
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase14 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		waitExplicitly(5, driver.findElement(By.id("Account_Tab")));
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Accounts with last activity > 30 days")).click();
		Thread.sleep(5000);
		waitExplicitly(6, driver.findElement(By.id("ext-comp-1042")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
	//	Thread.sleep(5000);
		Thread.sleep(5000);	driver.findElement(By.xpath("//span[text()='3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ext-gen49")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//div[text()='Help for this Page']")));
		driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys("Report2021");
		Thread.sleep(5000);
		driver.findElement(By.id("saveReportDlg_DeveloperName")).clear();
		driver.findElement(By.id("saveReportDlg_DeveloperName")).sendKeys("Report2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save and Run Report']")).click();
		quitBrowser();
		
	}

}
