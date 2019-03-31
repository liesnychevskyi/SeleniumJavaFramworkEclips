package Selenium_java_mavenExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparametersDemo
{
	@Test
	@Parameters({"MyName"})
	//public void test(@Optioinal String name) -- if you do not set value in XML file it will be run
	public void test(String name)
	{
		System.out.println("Name is : " + name);
	}

}
