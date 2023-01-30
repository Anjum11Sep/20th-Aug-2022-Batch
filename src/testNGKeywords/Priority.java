package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(invocationCount = 5)       //executes test 5 times  ,also run in alphabetical order
	  public void c()
	  {
		  Reporter.log("Test C is running", true);
	  }
	  
	  @Test(priority = -4)             //lower value having highest priority executes first(By default priority -zero),priority can zero,+ve,-ve
	  public void b()
	  {
		  Reporter.log("Test B is running", true);
	  }
	  
	  @Test(priority = -3)
	  public void a()
	  {
		  Reporter.log("Test A is running", true);
	  }
	  
	  @Test(priority = -2)
	  public void d()
	  {
		  Reporter.log("Test D is running", true);
	  }
}
