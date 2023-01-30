package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NeostoxTesting {
	
  @Test    //method Testcase
  public void ValidateUserID()
  {
	  Reporter.log("Validate user ID is running", true);
  }
  
  @Test         //method Testcase
  public void ValidateAccBalance()
  {
	  Reporter.log("ValidateAccBalance is running ", true);
  }
  
  
  @BeforeMethod
  public void LoginNeostox()
  {
	  Reporter.log("Logged in to Neostox", true);
  }
  
  @AfterMethod
  public void LogoutNeostox()
  {
	  Reporter.log("Logged out", true);
  }
  
  @BeforeClass
  public void LaunchURL()
  {
	  Reporter.log("Launch the Neostox URL", true);
  }
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("closing the browser", true);
  }
  
}
