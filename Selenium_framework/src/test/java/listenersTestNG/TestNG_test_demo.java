package listenersTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenersTestNG.TestNGlistener.class)
public class TestNG_test_demo 
{
	public static void main(String[] args) 
	{
		
	}
	
	@Test
	public void test_1()
	{
		System.out.println("I am inside test_1");
	}
	
	@Test
	public void test_2()
	{
		System.out.println("I am inside test_2");
		//Assert.assertTrue(false);
		
		WebDriver driver = new  ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("Selenium");
		
		driver.close();
	}
	
	@Test
	public void test_3()
	{
		System.out.println("I am inside test_3");
		throw new SkipException("Tith test is skipd by Stas");
	}
}
