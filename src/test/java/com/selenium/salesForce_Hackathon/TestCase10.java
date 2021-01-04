package com.selenium.salesForce_Hackathon;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

//TC-10 Create an Account
import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase10 extends SalesForceUtility{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		waitExplicitly(5,driver.findElement(By.id("Account_Tab")));
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(5000);
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@class='btn'])[3]")));
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(5000);
		waitExplicitly(5,driver.findElement(By.id("acc2")));
		driver.findElement(By.id("acc2")).sendKeys("QA");
		Select se = new Select(driver.findElement(By.id("acc6")));
		
		Thread.sleep(3000);
		se.selectByValue("Technology Partner");
		Thread.sleep(3000);
		Select se1 = new Select(driver.findElement(By.id("00N4x00000DejRg")));
		se1.selectByValue("High");
		driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();
		
	}

}
