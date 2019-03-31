package Selenium_java_mavenExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Fluen_Wait_demo 
{
	WebDriver driver;
	public  String browserName = null;
	Wait<WebDriver> wait;
	WebElement element;
//===========================================================================================||
	// Waiting 30 seconds for an element to be present on the page, checking
	// for its presence once every 5 seconds.
	
	  
	
//===========================================================================================||	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//============================================================================================||
		        
	}
//--------------------------------------------------------------------------------------------||	
	@Test
	public void googleSearchTest() 
	{
				
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Love");
		//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@value='חיפוש ב-Google']")).sendKeys(Keys.RETURN);
		
		
		   wait  = new FluentWait<WebDriver>(driver) // Instance of class
			       .withTimeout(30, TimeUnit.SECONDS)                   
			       .pollingEvery(2, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   element = wait.until(new Function<WebDriver, WebElement>() 
			   {
			     public WebElement apply(WebDriver driver) 
			     {
			       WebElement loginButton = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@value='חיפוש ב-Google']"));
			       if(loginButton.isEnabled())
			       {
			    	   System.out.println("Element found");
			       }
			       return loginButton;
			     }
			   });
			   
			   element.click();
	}
	
//---------------------------------------------------------------------------------------------||	
	@AfterTest
	public void tearDown() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}	  
}
