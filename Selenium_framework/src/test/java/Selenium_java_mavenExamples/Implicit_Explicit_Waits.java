package Selenium_java_mavenExamples;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Implicit_Explicit_Waits 
{
	WebDriver driver;
	public static String browserName = null;

	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
//--------------------------------------------------------------------------------------------||	
	@Test
	public void googleSearchTest() 
	{
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Love");
		//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//center/input[@value='Google Search']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@value='חיפוש ב-Google']")));
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@value='חיפוש ב-Google']")).sendKeys(Keys.RETURN);
		
	}
//---------------------------------------------------------------------------------------------||	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}	  
}
	


