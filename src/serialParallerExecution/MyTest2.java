package serialParallerExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest2 {
	@Test
	 public void GoogleLaunch() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://google.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
	  }
}
