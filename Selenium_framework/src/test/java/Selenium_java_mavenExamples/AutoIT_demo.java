package Selenium_java_mavenExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT_demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("uploaded_file")).click();
		
		try 
		{
			Runtime.getRuntime().exec("D:\\UploadScript.exe");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		Thread.sleep(10000);
		//driver.close();
		driver.quit();

	}

}
