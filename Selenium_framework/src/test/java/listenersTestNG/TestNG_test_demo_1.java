package listenersTestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenersTestNG.TestNGlistener.class)
public class TestNG_test_demo_1 
{
	public static void main(String[] args) 
	{
		
	}
	
	@Test
	public void test_4()
	{
		System.out.println("I am inside test_4");
	}
	
	@Test
	public void test_5()
	{
		System.out.println("I am inside test_5");
	}
	
	@Test
	public void test_6()
	{
		System.out.println("I am inside test_6");
		throw new SkipException("Tith test is skipd by Stas__________");
	}
}
