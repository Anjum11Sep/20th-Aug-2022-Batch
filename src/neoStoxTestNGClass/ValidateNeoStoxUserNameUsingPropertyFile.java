package neoStoxTestNGClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOMClassUsingUtility.NeoStoxDashboardPage1;
import neoStoxPOMClassUsingUtility.NeoStoxHomePage1;
import neoStoxPOMClassUsingUtility.NeoStoxPasswordPage1;
import neoStoxPOMClassUsingUtility.NeoStoxSignInPage1;
import neoStoxUtility.Utility;

 //@Listeners(neoStoxTestNGClass.Listener.class)
public class ValidateNeoStoxUserNameUsingPropertyFile extends Base
{
	
	NeoStoxHomePage1 home;
	NeoStoxSignInPage1 signIn;
	NeoStoxPasswordPage1 password1;
	NeoStoxDashboardPage1 dashboard1;
	// String s="TCID-1544";   //filename
	
	@BeforeClass
	public void LaunchBrowser() throws IOException
	{
		LaunchNeoStoxBrowser();
		
		 home=new NeoStoxHomePage1(driver);
		 signIn=new NeoStoxSignInPage1(driver);
		 password1=new NeoStoxPasswordPage1(driver);
		 dashboard1=new NeoStoxDashboardPage1(driver);		  
	}
		
	@BeforeMethod
	public void signIntoNeostox() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		home.clickOnSignInButton();
	    Utility.implicitWait(1000, driver);
	
	    signIn.EnterMobileNumber(Utility.readDataFromPropertyFile("MobNum"));
	    
	    signIn.ClickOnSignInButton();	
		Utility.implicitWait(1000, driver);
		
	   password1.EnterPassword(Utility.readDataFromPropertyFile("pass"));
		Thread.sleep(500);
		password1.ClickOnSubmitButton();
	//	Utility.implicitWait(1000, driver);
		Thread.sleep(500);
		dashboard1.HandlePopup(driver);
		
	}
	
  @Test
  public void ValidateUserName() throws IOException 
  {
	 // Assert.fail();
	  Assert.assertEquals(dashboard1.getActualUserName(),Utility.readDataFromPropertyFile("UserName"),"Actual and Expected usernames are not matching, TC is failed");
	  
	  Utility.takesScreenshot(driver, Utility.readDataFromPropertyFile("TCID1"));
  }
  
  @Test
  public void ValidateACBalance() throws IOException
  {
	  Assert.assertNotNull(dashboard1.getAcBalance(), "Account balance is null , TC is failed");
	  
	  Utility.takesScreenshot(driver,Utility.readDataFromPropertyFile("TCID2"));
  }
  
  @AfterMethod
  public void LogoutFromNeostox() throws InterruptedException
  { 
	  dashboard1.ClickOnLogoutButton();	  
  }
  
  @AfterClass
  
  public void closeBrowser() throws InterruptedException
  {
	  driver.close();
	  Reporter.log("closing the application", true);
	  Thread.sleep(1000);
	  

  }
}
