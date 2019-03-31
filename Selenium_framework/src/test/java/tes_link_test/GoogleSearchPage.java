package tes_link_test;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//----------------------------------------------------------------|| Locators
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class GoogleSearchPage 
{
	WebDriver driver = null; 
	WebDriverWait wait = null;
	//----------------------------------------------------------------|| Locators
	By googlesearch_box = By.name("q");
	By googlesearch_button = By.name("btnK");
	By item = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li[1]/div[1]/div/span");
	//-----------------------------------------------------------------|| Constructor
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	//-----------------------------------------------------------------|| Methods	
	public void  setTextInserchBox(String text)
	{
		driver.findElement(googlesearch_box).sendKeys(text);
	}

	public void  clickItemFromAutocomplete()
	{
		driver.findElement(item).click();
		//driver.findElement(googlesearch_button).sendKeys(Keys.RETURN);
	}

	public void  checkOnGooglePage()
	{
		WebElement element = driver.findElement(By.name("btnK"));
		String strng = element.getText();
		System.out.println(strng);
		Assert.assertEquals(strng, "Google Search");
	}

	//====================================================================||
	public void AllLinksCapture()
	{
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 1; i<=links.size(); i=i+1)

		{
			{
				System.out.println(links.get(i).getText());
			}
		}
	}
}

	//--------------------------------------------------------------------||

