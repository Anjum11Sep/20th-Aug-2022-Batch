package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeckoTesting {
  @Test
  public void firefoxTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
  }
}
