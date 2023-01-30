package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest {
	
	@Parameters("browserName")
	
  @Test
  public void cbTesting(String bName) 
  {
		WebDriver driver = null;
		
		if(bName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\geckodriver-v0.32.0-win64\\geckodriver.exe");

	     driver = new FirefoxDriver();
		
		
		}
		
		else if (bName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

			 driver = new ChromeDriver();		
				
			
		}
		
		    driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
		
  }
  
	
}
