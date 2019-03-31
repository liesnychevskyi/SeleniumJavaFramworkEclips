package tes_link_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker 
{

	public static void main(String[] args)
	{
		String month = "March 2019";
		String date = "02";   // set your date 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://xxx");
		driver.findElement(By.xpath("some locator")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		while(true)
		{
			String text = driver.findElement(By.xpath("some locator")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("some locator")).click();
			}
		}

		driver.findElement(By.xpath("some locator"+date+")]")).click();
	}
}
