package Selenium_java_mavenExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo
{

	public static void main(String[] args)
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		textBox.sendKeys("Automation step by step");
		
		WebElement searchButton = driver.findElement(By.id("gsr"));
		searchButton.click();
		
		driver.close();
		driver.quit();
	}

}
