package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
                                                    //testNG class doesn't have main method
public class TestNGSample1 {
  @Test
  public void NeostoxLaunch() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://neostox.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		System.out.println("This is neostox testing");           //print only on console ,not on testNG output
		
		Reporter.log("This is reporter");                     //print only on testNG output, not on console
		
		Reporter.log("This is reporter to test", true);       //print on console and testNG output
		
  }
  
  @Test
  public void UpstoxLaunch() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://upstox.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		System.out.println("This is upstox testing");     
		
		Reporter.log("This is reporter");
		
		Reporter.log("This is reporter to test", true);
  }
}
