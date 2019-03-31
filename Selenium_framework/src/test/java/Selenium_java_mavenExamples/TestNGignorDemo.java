package Selenium_java_mavenExamples;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestNGignorDemo 
{
	@Ignore
	@Test
	public void test_1()
	{
		System.out.println("It is test 1");
	}
	
	@Test
	public void test_2()
	{
		System.out.println("It is test 2");
	}
	
	@Test
	public void test_3()
	{
		System.out.println("It is test 3");
	}

}
