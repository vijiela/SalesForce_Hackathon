package com.selenium.salesForce_Hackathon;
import org.openqa.selenium.By;

//TC-35 Verify the tab customization
import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase35 extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.xpath("//a[@href='/home/showAllTabs.jsp']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("customize")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//option[@value='Chatter']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("leftArrowIcon")).click();
		driver.findElement(By.name("save")).click();
		

	}

}
