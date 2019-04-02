package Selenium_java_mavenExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class Browser_Stack_test 
{

		public static final String USERNAME = "liesnychevskyist1";
		  public static final String AUTOMATE_KEY = "MFpJpSZjR87ppKihxNow";
		  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		  public static void main(String[] args) throws Exception
		  {

		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", "10");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "74.0 beta");
		    caps.setCapability("project", "Test_project");
		    caps.setCapability("build", "1.0");
		    caps.setCapability("name", "GoogleTest");
		    caps.setCapability("browserstack.local", "false");
		    caps.setCapability("browserstack.selenium_version", "3.14.0");

		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.get("http://www.google.com");
		    WebElement element = driver.findElement(By.name("q"));

		    element.sendKeys("BrowserStack");
		    element.submit();

		    System.out.println(driver.getTitle());
		    driver.quit();

		  }

	}


