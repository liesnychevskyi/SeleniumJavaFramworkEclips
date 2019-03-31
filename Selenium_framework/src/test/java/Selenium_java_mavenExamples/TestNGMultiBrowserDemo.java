package Selenium_java_mavenExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo 
{
	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("Browser name is : " + browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("---------------| Started Chrome Browser |-------------");
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			System.out.println("---------------| Started Firefox Browser |-------------");
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			System.out.println("---------------| Started Edge Browser |-------------");
		}
	}
	
	@Test
	public void test_1() throws Exception
	{
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Test comleted successfully");
	}

}
