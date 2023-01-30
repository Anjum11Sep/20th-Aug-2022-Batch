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

public class NeostoxTestNGClass 
{
	WebDriver driver;
	NeoStoxHomePage1 home;
	NeoStoxSignInPage1 signIn;
	NeoStoxPasswordPage1 password1;
	NeoStoxDashboardPage1 dashboard;
	 File myfile;
	 Sheet mySheet;
	
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
		 
		  myfile=new File("C:\\Users\\Anjum\\ExcelJar_files\\Anjum.xlsx");
			
		 mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
	}
	
	
	@BeforeMethod
	public void signIntoNeostox() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		home.clickOnSignInButton();
		Reporter.log("Clicking on sign In button", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		signIn.EnterMobileNumber(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering mobile number", true);
		
		signIn.ClickOnSignInButton();
		Reporter.log("Clicking on sign In button", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		password1.EnterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering password", true);
		
		Thread.sleep(1000);
		password1.ClickOnSubmitButton();
		Reporter.log("Clicking on submit button", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		dashboard.HandlePopup();
		Reporter.log("Handling popup", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
  @Test
  public void ValidateUserName() 
  {
	 String ExpectedUserName = mySheet.getRow(0).getCell(2).getStringCellValue();
	  String ActualUserName = dashboard.getActualUserName();
	  
	  Assert.assertEquals(ActualUserName, ExpectedUserName ,"Actual and Expected usernames are not matching, TC is failed");
	  
	  Reporter.log("Validating user names", true);
  }
  
  
  @AfterMethod
  public void LogoutFromNeostox() throws InterruptedException
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  dashboard.ClickOnLogoutButton();
	  Reporter.log("Clicking on Logout button", true);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  
  @AfterClass
  
  public void closeBrowser()
  {
	  driver.close();
	  Reporter.log("Closing the browser", true);

  }
}
