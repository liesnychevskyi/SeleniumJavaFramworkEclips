package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage_0 
{
	WebDriver driver = null; 
	By googlesearch_box = By.name("q");
	By googlesearch_button = By.id("gsr");

	public GoogleSearchPage_0(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void  setTextInserchBox(String text)
	{
		driver.findElement(googlesearch_box).sendKeys(text);
	}
//===========================================================================//	
	public void  clickSearchButton()
	{
		driver.findElement(googlesearch_button).sendKeys(Keys.RETURN);
	}
	
}