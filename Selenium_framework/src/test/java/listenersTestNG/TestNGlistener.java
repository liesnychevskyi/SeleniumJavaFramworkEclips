package listenersTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlistener implements ITestListener
{

	public static void main(String[] args) 
	{
		

	}

	public void onTestStart(ITestResult result) 
	{
		System.out.println("********************Test started : " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("********************Test is successeful : " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("********************Test is failure : " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("********************Test skipped : " + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("********************No Test Failed But Within Success Percentag  : " + result.getName());
		
	}

	public void onStart(ITestContext context) 
	{
		System.out.println("********************On start  : " + context.getName());
		
	}

	public void onFinish(ITestContext context) 
	{
		System.out.println("********************On finish  : " + context.getName());
		
	}

}
