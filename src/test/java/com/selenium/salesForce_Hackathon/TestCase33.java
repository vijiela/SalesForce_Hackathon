package com.selenium.salesForce_Hackathon;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//TC-33 Verify if the firstname and lastname of the loggedin user is displayed
import org.openqa.selenium.By;

import com.selenium.salesForce_Utility.SalesForceUtility;

public class TestCase33 extends SalesForceUtility{

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
		driver.findElement(By.xpath("(//a[@href='/_ui/core/userprofile/UserProfilePage'])[3]")).click();
		quitBrowser();
		

	}

}
