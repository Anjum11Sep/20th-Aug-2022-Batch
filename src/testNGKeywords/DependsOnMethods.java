package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods
{
	@Test(dependsOnMethods = "d", priority = -1)   
	  public void a()
	  {
		  Reporter.log("Test A is running", true);
	  }
	  
	  @Test(dependsOnMethods = "c")             //There is no guarantee on the order on which the methods depended upon will be run
	  public void b()
	  {
		  Reporter.log("Test B is running", true);
	  }
	  
	  @Test            //@Test(dependsOnMethods = "b")  TestNG exception(deadlock occured)
	  public void c()
	  {
		  Reporter.log("Test C is running", true);
	  }
	  
	  @Test(invocationCount = 3)
	  public void d()
	  {
		  Reporter.log("Test D is running", true);
	  }
}
