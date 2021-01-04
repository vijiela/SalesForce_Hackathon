package com.selenium.salesForce_Hackathon;
import org.openqa.selenium.By;

//TC-20 check leads tab link 
import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase20 extends SalesForceUtility {

	public static void main(String[] args) {
	
		launchBrowse();
		goToSalesForceUrl();
		loginToSalesForcePortal();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	}

}
