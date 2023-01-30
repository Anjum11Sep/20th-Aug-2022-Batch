package testNGxmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStox1 {
  @Test(groups = "Sanity")
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  
  @Test(groups = "Reg")
  public void e() 
  {
	  Reporter.log("TC e is running", true);
  }
  
  @Test(groups = "Reg")
  public void d() 
  {
	  Reporter.log("TC d is running", true);
  }
  
  @Test(groups = "Sanity")
  public void c() 
  {
	  Reporter.log("TC c is running", true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("TC b is running", true);
  }
}
