package neoStoxTestNGClass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.Base;
import neoStoxUtility.Utility;

public class Listener extends Base implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		try
		{
		Reporter.log("TC "+result.getName()+" is failed", true);
		Utility.takesScreenshot(driver, result.getName());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String tcName = result.getName();
		Reporter.log("TC "+tcName+" is passed successfully", true);	
	}
	

}
