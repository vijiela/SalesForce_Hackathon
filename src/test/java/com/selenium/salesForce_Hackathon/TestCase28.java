package com.selenium.salesForce_Hackathon;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//TC-28 Check 'My contacts' view in the Contact Page
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase28 extends SalesForceUtility{

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
				Select se = new Select(driver.findElement(By.id("00B4x000007c0sJ_listSelect")));
				//Thread.sleep(5000);
				se.selectByValue("00B4x000007c0sJ");
				quitBrowser();
	}

}
