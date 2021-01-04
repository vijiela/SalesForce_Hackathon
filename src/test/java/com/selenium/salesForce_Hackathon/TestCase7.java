package com.selenium.salesForce_Hackathon;
//TC-07-Select "My settings" option from user menu for <username> drop down
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase7 extends SalesForceUtility {

	public static void main(String[] args) {
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
        waitExplicitly(5,driver.findElement(By.xpath("//div[@class='setupLeaf'][8]")));
        driver.findElement(By.xpath("//div[@class='setupLeaf'][8]")).click();
        waitExplicitly(5,driver.findElement(By.xpath("//div[@class='pShowMore']")));
        driver.findElement(By.xpath("//div[@class='pShowMore']")).click();

      
        

	}

}
