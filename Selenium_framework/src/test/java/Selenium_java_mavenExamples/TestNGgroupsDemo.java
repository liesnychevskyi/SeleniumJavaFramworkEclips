package Selenium_java_mavenExamples;

import org.testng.annotations.Test;

@Test(groups= {"AllclassTests"})
public class TestNGgroupsDemo 
{
	@Test(groups= {"sanity"})
	public void test_1()
	{
		System.out.println("Test_1");
	}
	
	@Test(groups= {"sanity", "smoke"})
	public void test_2()
	{
		System.out.println("Test_2");
	}
	
	@Test(groups= {"sanity", "regression"})
	public void test_3()
	{
		System.out.println("Test_3");
	}
	
	@Test(groups= {"regression"})
	public void test_4()
	{
		System.out.println("Test_4");
	}
}
