package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import configurations.propertiesFile;

public class ExcelDataProvider 
{
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
//=====================================================================================//
	public static void main(String[] args) 
	{
		String excelPath = "C:\\Users\\liesn\\eclipse-workspace\\Selenium_framework\\excel\\Selenium_test_data.xlsx";
		testData(excelPath, "Selenium_data");
	}
//======================================================================================//
	WebDriver driver = null;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}	
//======================================================================================//
	@Test(dataProvider = "test_1_data")
	public void test_1(String username, String password) throws InterruptedException
	{
		System.out.println(username +" | "+ password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		//driver.close();
		//driver.quit();
	}
//=======================================================================================//
	@DataProvider(name = "test_1_data")
	public static Object[] []getData()
	{
		String excelPath = "C:\\Users\\liesn\\eclipse-workspace\\Selenium_framework\\excel\\Selenium_test_data.xlsx";
		Object data[][] = testData(excelPath, "Selenium_data");
		return data;
	}
//=======================================================================================//	
	public static Object[] [] testData(String excelPath, String sheetName)
	{
		ExcelUtilil excel = new ExcelUtilil(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int columnCount = excel.getColumnCount();
		
		Object data[][] = new Object[rowCount-1][columnCount];
		
		for(int i = 1; i < rowCount; i++)
		{
			for(int j = 0; j < columnCount; j++)
			{
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData + " | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;	
	}
}
//================================================================================================//

