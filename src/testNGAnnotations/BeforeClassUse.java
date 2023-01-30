package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeClassUse {
	
  @Test  //method Testcase
  public void TC1()
  {
	  Reporter.log("TC1 is running", true);
  }
  
  @BeforeMethod
  
  public void beforeMethod()
  {
	  Reporter.log("beforeMethod is running", true);
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("afterMethod is running", true);
  }
  
  @Test
  
  public void TC2()
  {
	  Reporter.log("TC2 is running", true);
  }
  
  @BeforeClass
  
  public void beforeClass()        //executes after test method
  {
	  Reporter.log("beforeClass is running", true);
  }
  
  @BeforeTest
  
  public void beforeTest()         //executes before class method
  {
	  Reporter.log("beforeTest is running", true);
  }
  @BeforeSuite
  
  public void beforeSuite()         //executes before test method   ,higher class,uppermost
  {
	  Reporter.log("beforeSuite is running", true);
  }
}
