package Selenium_java_mavenExamples;

import org.testng.annotations.Test;

public class TestNGdependencyDemo 
{
	@Test(dependsOnMethods= {"test_2"}, priority=1)
	public void test_1()
	{
		System.out.println("I inside test_1");
	}
	
	@Test(priority=2)
	public void test_2()
	{
		System.out.println("I inside test_2");
	}
	
	@Test(priority=2)
	public void test_3()
	{
		System.out.println("I inside test_3");
	}
}
