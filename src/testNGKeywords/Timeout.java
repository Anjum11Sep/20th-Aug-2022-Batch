package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout 
{
	@Test(timeOut = 500)     
	  public void a() throws InterruptedException
	  {
		  Thread.sleep(1000);                     // failed.xml this will generate file
		  Reporter.log("Test A is running", true);
	  }
	  
	  @Test             
	  public void b()
	  {
		  Reporter.log("Test B is running", true);
	  }
	  
	  @Test
	  public void c()
	  {
		  Reporter.log("Test C is running", true);
	  }
	  
	  @Test
	  public void d()
	  {
		  Reporter.log("Test D is running", true);
	  }
}
