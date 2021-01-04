package com.selenium.salesForce_Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceUtility {

	public static WebDriver driver;

	public static void launchBrowse() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	public static void goToSalesForceUrl() {
		driver.get("https://login.salesforce.com/");
	}

	public static void waitExplicitly(int iSeconds, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, iSeconds);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static void loginToSalesForcePortal() {

		WebElement ele = driver.findElement(By.id("username"));
		waitExplicitly(5, ele);
		ele.clear();
		ele.sendKeys("vijiela@abc.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("tekarch@123");
		driver.findElement(By.id("Login")).click();
		

	}

}
