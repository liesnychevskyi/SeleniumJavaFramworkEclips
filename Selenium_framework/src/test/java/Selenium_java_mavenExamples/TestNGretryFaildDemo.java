package Selenium_java_mavenExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGretryFaildDemo 
{
	@Test
	public void test_1()
	{
		System.out.println("I inside test 1");
	}
	
	@Test
	public void test_2()
	{
		System.out.println("I inside test 2");
		int q = 1/0;
	}
	
	@Test(retryAnalyzer = listenersTestNG.RetryAnalyzer.class)
	public void test_3()
	{
		System.out.println("I inside test 3");
		Assert.assertTrue(0 > 1);
	}
}
