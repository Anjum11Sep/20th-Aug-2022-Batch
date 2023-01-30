package myListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTesting1 
{
  @Test
  public void A() 
  {
	  Reporter.log("TC A is running", true);
  }
  
  @Test
  public void B() 
  {
	  Assert.fail();
	  Reporter.log("TC B is running", true);
  }
  
  @Test(dependsOnMethods = "B")
  public void C() 
  {
	  Reporter.log("TC C is running", true);
  }
  
}
