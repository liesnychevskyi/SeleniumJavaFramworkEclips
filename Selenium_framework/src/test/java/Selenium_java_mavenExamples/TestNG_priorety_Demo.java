package Selenium_java_mavenExamples;

import org.testng.annotations.Test;

public class TestNG_priorety_Demo
{

	public static void main(String[] args) 
	{
		

	}
	
	@Test(priority = 1)
	public void test_1()
	{
		System.out.println("I am inside Test_1");
	}
	
	@Test(priority = -1)
	public void test_2()
	{
		System.out.println("I am inside Test_2");
	}
	
	@Test(priority = 0)
	public void test_3()
	{
		System.out.println("I am inside Test_3");
	}

}
