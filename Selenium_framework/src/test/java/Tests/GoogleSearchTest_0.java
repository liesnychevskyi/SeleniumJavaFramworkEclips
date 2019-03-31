package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPage_0;
import configurations.propertiesFile;

public class GoogleSearchTest_0
{
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	private static  WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest
	public void setUp()
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
		htmlReporter = new ExtentHtmlReporter("GoogleReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		driver.manage().window().maximize();
	}
//--------------------------------------------------------------------------------------------||	
	@Test
	public void googleSearchTest() throws IOException
	{
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("Google search test", "Sample description");
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
       
		GoogleSearchPage_0 searPageObj = new GoogleSearchPage_0(driver);
		driver.get("https://google.com");
		searPageObj.setTextInserchBox("Selenium");
		searPageObj.clickSearchButton();
	}
//---------------------------------------------------------------------------------------------||	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
		// calling flush writes everything to the log file
        extent.flush();
	}	
}
//-----------------------------------------------------------------------------------------------||
//http://extentreports.com/docs/versions/3/java/ -- reports site