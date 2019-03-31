package configurations;

import java.awt.PageAttributes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Tests.GoogleSearchTest_0;

public class propertiesFile
{
    static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) 
	{
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() //object properties
	{
		try
		{
		    InputStream input = new FileInputStream(projectPath + "\\src\\test\\java\\configurations\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			GoogleSearchTest_0.browserName = browser;
		}
		
		catch (Exception e) 
		{
			e.getCause();
			e.getMessage();
			e.getStackTrace();
		}
	}
	
	public static void setProperties()
	{
		
	try
	{
		OutputStream output = new FileOutputStream(projectPath + "\\src\\test\\java\\configurations\\config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(output, "--- Storing browser ---");
	}
	catch(Exception e)
	{
		e.getCause();
		e.getMessage();
		e.getStackTrace();
	}
	
	}

}
