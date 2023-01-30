package testNGxmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStox2 {
  @Test(groups = "Sanity")
  public void f() 
  {
	  Reporter.log("TC f is running", true);
  }
  
  @Test
  public void i() 
  {
	  Reporter.log("TC i is running", true);
  }
  
  @Test(groups = "Reg")
  public void g() 
  {
	  Reporter.log("TC g is running", true);
  }
  
  @Test
  public void j() 
  {
	  Reporter.log("TC j is running", true);
  }
  
  @Test(groups = "Reg")
  public void h() 
  {
	  Reporter.log("TC h is running", true);
  }
}
