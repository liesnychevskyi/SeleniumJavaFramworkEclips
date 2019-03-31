package tes_link_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import tes_link_test.GoogleSearchTestExamlpe;

public class propertiesFile
{
//-----------------------------------------------------------------||	
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
//-----------------------------------------------------------------||	
	public static void getProperties() //object properties
	{
		try
		{
			InputStream input = new FileInputStream(projectPath + "\\src\\test\\java\\tes_link_test\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			GoogleSearchTestExamlpe.browserName = browser;
		}

		catch (Exception e) 
		{
			e.getCause();
			e.getMessage();
			e.getStackTrace();
		}
	}
//-----------------------------------------------------------------||
	public static void setProperties()
	{

		try
		{
			OutputStream output = new FileOutputStream(projectPath + "\\src\\test\\java\\tes_link_test\\config.properties");
			prop.setProperty("result", "pass");
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
//------------------------------------------------------------------||
