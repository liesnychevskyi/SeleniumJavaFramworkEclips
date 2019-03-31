package tes_link_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tes_link_test.propertiesFile;
import tes_link_test.GoogleSearchPage;

//============================||How to run this test 
// 1. open *config.properties file, it set by default (chrome) 
// 2. uncomment preferred file 
// 3. open GoogleSearchTestExample right click run as TestNg

// I was thinking about (if) statement changing but i need more time.
// Maybe SWITCH we cat use. 
//================================================================||

public class GoogleSearchTestExamlpe 
{
	GoogleSearchPage searPageObj = null;
	private static  WebDriver driver = null;
	public static String browserName = null;
	
//-----------------------------------------------------------------||	
	@BeforeTest
	public void setUp() throws InterruptedException
	{
		propertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}

		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}

		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}

		else if(browserName.equalsIgnoreCase("internet explorer"))
		{
			driver = new InternetExplorerDriver();
		}

		else if(browserName.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}

		driver.manage().window().maximize();
	}
//----------------------------------------------------------------------||	
	@Test
	public void google_search_test()
	{
		driver.get("https://google.com");  // navigate to https://www.google.com 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // do not use any Thread.Sleep
		searPageObj = new GoogleSearchPage(driver);
		//searPageObj.checkOnGooglePage(); // make sure page is open
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		searPageObj.setTextInserchBox("hotelbeds"); // type hotelbeds into search text-box
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		searPageObj.clickItemFromAutocomplete();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		searPageObj.AllLinksCapture();
	}
		//String content = driver.findElement(By.tagName("body")).getText();
		//System.out.println(content);
		//String str = driver.getPageSource();
		//System.out.println(str);
		
//-----------------------------------------------------------------------//	
	@AfterTest
	public void tearDown()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
	}

//-----------------------------------------------------------------------||


}