package com.itlearn.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;

public class firstestcasefw  extends BaseTest {
	@Test
	public static void LoginTest()
	{
	
	 driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id(loc.getProperty("login_id"))).sendKeys("rcvtutorials@gmail.com");
	    driver.findElement(By.id(loc.getProperty("nextbtn"))).click();
	   // Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys("rcvtv");
	}

}
