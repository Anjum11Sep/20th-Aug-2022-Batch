package myListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.Base;
import neoStoxUtility.Utility;

public class Listener implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		Reporter.log("TC "+result.getName()+" is failed, please try again", true);		
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String tcName = result.getName();
		Reporter.log("TC "+tcName+" is passed successfully", true);	
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC "+result.getName()+" is skipped, please have a look", true);
		
	}
	

}
