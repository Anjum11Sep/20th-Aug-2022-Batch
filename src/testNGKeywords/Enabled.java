package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test      //executes test 5 times  ,also run in alphabetical order
	  public void c()
	  {
		  Reporter.log("Test A is running", true);
	  }
	  
	  @Test(enabled = false)          //by setting enabled to "false" it excludes/skips test (by default it is "true")
	  public void b()
	  {
		  Reporter.log("Test B is running", true);
	  }
	  
	  @Test
	  public void a()
	  {
		  Reporter.log("Test C is running", true);
	  }
	  
	  @Test
	  public void d()
	  {
		  Reporter.log("Test D is running", true);
	  }
}
