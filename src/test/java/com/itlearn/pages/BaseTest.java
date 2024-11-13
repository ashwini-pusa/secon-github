package com.itlearn.pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop=new Properties() ;
	public static Properties loc=new Properties() ;
	public static FileReader fr;
	public static FileReader fr1;
	
	
	@BeforeTest
	public void setup() throws IOException
	{
		if(driver==null)
		{
			FileReader fr= new FileReader("C:\\Users\\Ravikanth\\eclipse-workspace\\Java workspace\\IT360Framework\\src\\main\\resources\\configfiles\\confi.properties");
			FileReader fr1= new FileReader("C:\\Users\\Ravikanth\\eclipse-workspace\\Java workspace\\IT360Framework\\src\\main\\resources\\configfiles\\locator.properties");
		    prop.load(fr);
		    loc.load(fr1);
		    System.out.println(loc.getProperty("signin_link"));
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver();
		    driver.get(prop.getProperty("testurl"));
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		    WebDriver driver=new FirefoxDriver();
		    driver.get(prop.getProperty("testurl"));
		}
	}
	@AfterTest
  public void teardown()
  {
	  driver.close();
  }
}
