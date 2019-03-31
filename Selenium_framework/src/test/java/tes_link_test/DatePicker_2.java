package tes_link_test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_2 
{

	protected String str;
	public static void main(String[] args)
	{
		String month = "Mar 2019";
		String expected_date = "2";   // set your date 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.expedia.ca/");
		driver.findElement(By.id("some locator")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//System.out.println(text);
//--------------------------------------------------------------------------------------||		
		while(true)	
		{
			String text = driver.findElement(By.xpath("//caption")).getText();
			
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("some locator")).click();
			}
		}
//-------------------------------------------------------------------------------------||		
		List <WebElement> allDates = driver.findElements(By.xpath("some locator"));
		
		for(WebElement ele: allDates)
		{
			//System.out.println(ele.getText());
			String date_text = ele.getText();
			String date[] = date_text.split("/n");
			if(date[1].equals(expected_date))
			{
				ele.click();
				break;
			}
		}
//-----------------------------------------------------------------------------------------||		
	}

}
