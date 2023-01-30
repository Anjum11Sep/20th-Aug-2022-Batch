package neoStoxPOMClassesUsingDDF;

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
import org.testng.annotations.Test;

public class NeostoxTestNGClassUsingGeneralMethods 
{
	WebDriver driver;
	NeoStoxHomePage1 home;
	NeoStoxSignInPage1 signIn;
	NeoStoxPasswordPage1 password1;
	NeoStoxDashboardPage1 dashboard;
	 File myfile;
	 Sheet mySheet;
	 String s="TCID-1234";   //filename
	
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");
		
		//created object of chromedriver

		 driver = new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.get("https://neostox.com/");
		
		Reporter.log("Launching neostox application", true);
		
		 home=new NeoStoxHomePage1(driver);
		 signIn=new NeoStoxSignInPage1(driver);
		 password1=new NeoStoxPasswordPage1(driver);
		 dashboard=new NeoStoxDashboardPage1(driver);
		 
		  
	}
	
	
	@BeforeMethod
	public void signIntoNeostox() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		home.clickOnSignInButton();
		Reporter.log("Clicking on sign In button", true);
		
		GeneralMethods.implicitWait(1000, driver);
		
		signIn.EnterMobileNumber(GeneralMethods.readDataFromExcel(0, 0));
		Reporter.log("Entering mobile number", true);
		
		signIn.ClickOnSignInButton();
		Reporter.log("Clicking on sign In button", true);
		
		GeneralMethods.implicitWait(1000, driver);
		
		password1.EnterPassword(GeneralMethods.readDataFromExcel(0, 1));
		Reporter.log("Entering password", true);
		
		Thread.sleep(1000);
		password1.ClickOnSubmitButton();
		Reporter.log("Clicking on submit button", true);
		
		GeneralMethods.implicitWait(1000, driver);
		
		dashboard.HandlePopup();
		Reporter.log("Handling popup", true);
		
		GeneralMethods.implicitWait(5000, driver);
	}
	
  @Test
  public void ValidateUserName() throws IOException 
  {
	 // Assert.fail();
	  Assert.assertEquals(dashboard.getActualUserName(),GeneralMethods.readDataFromExcel(0, 2) ,"Actual and Expected usernames are not matching, TC is failed");
	  
	  GeneralMethods.takesScreenshot(driver,s);
	  
	  Reporter.log("Validating user names", true);
  }
  
  
  @AfterMethod
  public void LogoutFromNeostox() throws InterruptedException
  {
	  GeneralMethods.implicitWait(1000, driver);
	  
	  dashboard.ClickOnLogoutButton();
	  Reporter.log("Clicking on Logout button", true);
	  
	  GeneralMethods.implicitWait(1000, driver);
  }
  
  @AfterClass
  
  public void closeBrowser()
  {
	  driver.close();
	  Reporter.log("Closing the browser", true);

  }
}
