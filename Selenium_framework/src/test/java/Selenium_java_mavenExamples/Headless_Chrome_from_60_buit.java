package Selenium_java_mavenExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Chrome_from_60_buit 
{
	public static void main(String[] args)
	{
		test();
	}
	
public static void test()
{
	//String projectPath = System.getProperty("user.dir");
	//System.out.println("Project path : " + projectPath);
	//System.setProperty("webdriver.opera.driver", "C:\\Users\\liesn\\eclipse-workspace\\Selenium_framework\\Drivers\\operadriver.exe");
//-----------------------------------------------------------------------//
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--headless");
	option.addArguments("window-size=1366,768");
	WebDriver driver = new ChromeDriver(option);
//-----------------------------------------------------------------------//	
	driver.get("https://google.com");
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Love");
	driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@value='חיפוש ב-Google']")).sendKeys(Keys.RETURN);
	
	driver.close();
	driver.quit();
	System.out.println("Completed test");
	}

}
