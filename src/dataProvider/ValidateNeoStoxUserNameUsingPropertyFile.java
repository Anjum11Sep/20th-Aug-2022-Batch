package dataProvider;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOMClassUsingUtility.NeoStoxDashboardPage1;
import neoStoxPOMClassUsingUtility.NeoStoxHomePage1;
import neoStoxPOMClassUsingUtility.NeoStoxPasswordPage1;
import neoStoxPOMClassUsingUtility.NeoStoxSignInPage1;
import neoStoxUtility.Utility;

@Listeners(neoStoxTestNGClass.Listener.class)
public class ValidateNeoStoxUserNameUsingPropertyFile extends Base
{
	
	NeoStoxHomePage1 home;
	NeoStoxSignInPage1 signIn;
	NeoStoxPasswordPage1 password1;
	NeoStoxDashboardPage1 dashboard1;
	// String s="TCID-1544";   //filename
	
	@BeforeMethod
	public void LaunchNeoStoxApp() throws IOException
	{
		LaunchNeoStoxBrowser();
		
		 home=new NeoStoxHomePage1(driver);
		 signIn=new NeoStoxSignInPage1(driver);
		 password1=new NeoStoxPasswordPage1(driver);
		 dashboard1=new NeoStoxDashboardPage1(driver);		  
	}
	
  @Test(dataProvider = "LoginDetailsForValidateUserName")
  public void ValidateUserName(String MobNum,String Password, String userName) throws IOException, InterruptedException 
  {
	     home.clickOnSignInButton();
	     Utility.implicitWait(1000, driver);
	
	    signIn.EnterMobileNumber(MobNum);
	    
	    signIn.ClickOnSignInButton();	
		Utility.implicitWait(1000, driver);
		
	    password1.EnterPassword(Password);
		Thread.sleep(500);
		password1.ClickOnSubmitButton();
		
		Utility.implicitWait(1000, driver);
		dashboard1.HandlePopup(driver);
	 // Assert.fail();
	  Assert.assertEquals(dashboard1.getActualUserName(),userName,"Actual and Expected usernames are not matching, TC is failed");
	  
	  dashboard1.ClickOnLogoutButton();	 
	  
  }
  
  @Test(dataProvider = "LoginDetailsForValidateAccountBalance")
  public void ValidateACBalance(String MobNum,String Password) throws IOException, InterruptedException
  {
	  home.clickOnSignInButton();
	     Utility.implicitWait(1000, driver);
	
	    signIn.EnterMobileNumber(MobNum);
	    
	    signIn.ClickOnSignInButton();	
		Utility.implicitWait(1000, driver);
		
	    password1.EnterPassword(Password);
		Thread.sleep(500);
		password1.ClickOnSubmitButton();
		
		Utility.implicitWait(1000, driver);
		dashboard1.HandlePopup(driver);
		
	  Assert.assertNotNull(dashboard1.getAcBalance(), "Account balance is null , TC is failed");
	  
	  dashboard1.ClickOnLogoutButton();
  }
  
  @AfterMethod
  public void closeBrowser() throws InterruptedException
  {
	  driver.close();
	  Reporter.log("closing the application", true);
	  Thread.sleep(1000);
  }
  
  @DataProvider(name="LoginDetailsForValidateUserName") 
  public String[][] getLoginDetails1()
  {
	  String UserData[][]= {{"7264862687","1234","Hi anjum shaikh"},{"9421357890","9839","Hi Yogendra Joshi"},{"8805568380","2303","Hi Pooja Talekar"}};
	  return UserData;
	  
  }
  
  @DataProvider(name="LoginDetailsForValidateAccountBalance")
  public String[][] getLoginDetails2()
  {  
	  String UserData[][]= {{"7264862687","1234"},{"9421357890","9839"},{"8805568380","2303"}};
	  return UserData;
	  
  }
  
}
