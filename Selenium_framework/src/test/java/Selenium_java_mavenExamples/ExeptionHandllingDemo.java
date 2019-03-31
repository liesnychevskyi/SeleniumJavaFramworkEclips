package Selenium_java_mavenExamples;

public class ExeptionHandllingDemo 
{

	public static void main(String[] args)
	{
		try 
		{
			demo_1();
		} catch 
		(Exception e) 
		
		{
			e.printStackTrace();
		}
		
		try
		{
		System.out.println("Hello World.... !!!");
		int i = 1/0;
		System.out.println("Competed");
		}
		catch (Exception exp )
		{
			System.out.println("I am inside catch block");
			System.out.println("Massage is : " + exp.getMessage());
			System.out.println("Cause is : " + exp.getCause());
			exp.printStackTrace();
			exp.printStackTrace();
			exp.printStackTrace();
		}
		finally 
		{
			System.out.println("We inside Finally block");
		}

	}
//=============================================================//	
	public static void demo() throws Exception
	{
		System.out.println("Hello World.... !!!");
		int i = 1/0;
		System.out.println("Competed");
		
	}
	
	public static void demo_1() throws Exception
	{
		System.out.println("Hello World.... !!!");
		throw new ArithmeticException("No valid operation");
		//int i = 1/0;
		//System.out.println("Competed");
		
	}


}
