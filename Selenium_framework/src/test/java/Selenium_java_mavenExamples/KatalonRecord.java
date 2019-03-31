package Selenium_java_mavenExamples;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class KatalonRecord 
{
      private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception 
	  {
		  driver = new ChromeDriver();
	    //driver = new FirefoxDriver();
	    baseUrl = "https://www.katalon.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void test1() throws Exception 
	  {
	    driver.get("https://www.crexi.com/");
	    driver.findElement(By.linkText("Log In")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Min 6 characters'])[1]/following::input[1]")).clear();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Min 6 characters'])[1]/following::input[1]")).sendKeys("7753191ilove7753191");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Other'])[1]/following::div[5]")).clear();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Other'])[1]/following::div[5]")).sendKeys("liesnichevskyi.s@gmail.com");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Privacy Policy'])[2]/following::span[1]")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception
	  {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) 
	    {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by)
	  {
	    try 
	    {
	      driver.findElement(by);
	      return true;
	    } 
	    catch (NoSuchElementException e)
	    {
	      return false;
	    }
	  }

	  private boolean isAlertPresent()
	  {
	    try 
	    {
	      driver.switchTo().alert();
	      return true;
	    } 
	    
	    catch (NoAlertPresentException e)
	    {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() 
	  {
	    try 
	    {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) 
	      {
	        alert.accept();
	      } else 
	      {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally 
	    {
	      acceptNextAlert = true;
	    }
	  }
	}


