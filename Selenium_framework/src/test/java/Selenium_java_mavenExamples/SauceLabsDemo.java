package Selenium_java_mavenExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceLabsDemo 
{
	 public static final String USERNAME = "liesnychevskyi";
	 public static final String KEY = "04f275d2-6cd9-4eb7-af26-59563e819636";
	 public static final String URL = "https://" + USERNAME + ":" + KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	 
	 public static void main(String[] args) throws Exception
	 {
		 DesiredCapabilities caps = DesiredCapabilities.chrome();
		 caps.setCapability("platform", "Windows 10");
		 caps.setCapability("version", "latest");
		 caps.setCapability("name", "GoogleTest");
		 caps.setCapability("", "GoogleTest");
		 
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),caps);
		 //WebDriver driver = new ChromeDriver();
		 
		    driver.get("https://google.com");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Money");
			//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//center/input[@value='Google Search']")).click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@value='חיפוש ב-Google']")));
			driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@value='חיפוש ב-Google']")).sendKeys(Keys.RETURN);
			System.out.println(driver.getTitle());
			driver.quit();
			System.out.println("Test comleted !!!");
			
	 }
	
}
