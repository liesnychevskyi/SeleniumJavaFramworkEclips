package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilil 
{
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) 
	{
		//getRowCount();
		getCellDataString(0, 0);
		getCellDataNumber(1, 1);
	}

	public ExcelUtilil(String excelPath, String sheetName)  //Constructor
	{
		try
		{
			//projectPath = System.getProperty("user.dir");


			workbook = new XSSFWorkbook(excelPath);
			//workbook = new XSSFWorkbook(projectPath + "\\excel\\Selenium_test_data.xlsx");

			sheet = workbook.getSheet(sheetName);
			//sheet = workbook.getSheet("Selenium_data");
		}
		catch(Exception exp)
		{
			exp.getCause();
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
	}
	//--------------------------------------------------------------------------//

	public static int getColumnCount()
	{
		int columnCount = 0;
		try
		{
			columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Column count is : " + columnCount);
		}
		catch(Exception exp)
		{
			exp.getCause();
			//System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		return columnCount;
	}

	//===============================================================================//
	public static int getRowCount()
	{
		int rowCount = 0;
		try
		{
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row count is : " + rowCount);
		}
		catch(Exception exp)
		{
			exp.getCause();
			//System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		return rowCount;
	}

	//===============================================================================//	

	public static String getCellDataString(int rowNumber, int columnMumber)
	{
		String cellData = null;
		try
		{
			//projectPath = System.getProperty("user.dir");

			//workbook = new XSSFWorkbook(projectPath + "\\excel\\Selenium_test_data.xlsx");

			//sheet = workbook.getSheet("Selenium_data");

			cellData = sheet.getRow(rowNumber).getCell(columnMumber).getStringCellValue();
			//System.out.println(cellData);
		}
		catch(Exception exp)
		{
			exp.getCause();
			//System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		return cellData;
	}

	//===================================================================================//

	public static double getCellDataNumber(int rowNumber, int columnNumber)
	{
		double cellData = 0;
		try
		{
			//projectPath = System.getProperty("user.dir");

			//workbook = new XSSFWorkbook(projectPath + "\\excel\\Selenium_test_data.xlsx");

			//sheet = workbook.getSheet("Selenium_data");

			cellData = sheet.getRow(rowNumber).getCell(columnNumber).getNumericCellValue();

			//System.out.println(rowData);

		}
		catch(Exception exp)
		{
			exp.getCause();
			//System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		return cellData;
	}
}
