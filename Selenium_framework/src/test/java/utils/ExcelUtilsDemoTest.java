package utils;

public class ExcelUtilsDemoTest 
{

	public static void main(String[] args)
	{
		String projectPath = System.getProperty("user.dir");
		ExcelUtilil excel = new ExcelUtilil(projectPath + "\\excel\\Selenium_test_data.xlsx", "Selenium_data");
		
		excel.getCellDataNumber(1, 1);
		excel.getCellDataString(0, 0);
		excel.getRowCount();

	}

}
