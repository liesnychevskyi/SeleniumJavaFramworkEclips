package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPage;

public class GoogleSearchTest 
{
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException
{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		// creates a toggle for the given test, adds all log events under:
		ExtentTest test_1 = extent.createTest("Google search test", "Sample description");
		
		test_1.log(Status.INFO, "Browser is starting");
		driver = new EdgeDriver();
		test_1.pass("Driver is running...");
		
		test_1.log(Status.INFO, "Browser navigated to GOOGLE.COM");
		driver.get("https://google.com");
		test_1.pass("Driver navigated to GOOLE.COM");
		
		test_1.log(Status.INFO, "Window maximizing");
		driver.manage().window().maximize();
		test_1.pass("Window maximazed");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//driver.findElement(By.id("gsr")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER); //-- press ENTER button on keyboard
		
		test_1.log(Status.INFO, "Typing searching request");
		GoogleSearchPage.textbox_search(driver).sendKeys("Selenium");
		test_1.pass("Request printed");
		
		//GoogleSearchPage.button_search(driver).click();
		test_1.log(Status.INFO, "Clicking on SEARCH buttton");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		test_1.pass("Pressed");
		
		test_1.log(Status.INFO, "Wating 3000 msec");
		Thread.sleep(3000);
		test_1.pass("Weited 3000 msec");
		
		test_1.log(Status.INFO, "Driver is clossing");
		driver.close();
		test_1.pass("Driver closed");
		
		test_1.log(Status.INFO, "Driver is quiteing");
		driver.quit();
		test_1.pass("Driver quited");
		
		test_1.log(Status.INFO, "Text is printing");
		System.out.println("Test coopmleted !!!");
		test_1.pass("Text printed");
		
		// calling flush writes everything to the log file
		extent.flush();
	}
}
