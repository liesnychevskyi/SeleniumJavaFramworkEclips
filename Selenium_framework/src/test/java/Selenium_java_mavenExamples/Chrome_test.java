package Selenium_java_mavenExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Chrome_test 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path : " + projectPath);
		
		//System.setProperty("webdriver.opera.driver", "C:\\Users\\liesn\\eclipse-workspace\\Selenium_framework\\Drivers\\operadriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//WebDriver driver = new OperaDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		//Thread.sleep(3000);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		textBox.sendKeys("Automation step by step");
		
		WebElement searchButton = driver.findElement(By.id("gsr"));
		searchButton.click();
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("Count of Input elements : " + count);
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
