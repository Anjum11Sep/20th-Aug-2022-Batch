package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class Base
{
	protected static WebDriver driver;
	
	public void LaunchNeoStoxBrowser() throws IOException
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");
		
		//created object of chromedriver

		 driver = new ChromeDriver();
		 // maximize window
		
		driver.manage().window().maximize();
		
		
	//	driver.get("https://neostox.com/");
		
		driver.get(Utility.readDataFromPropertyFile("url"));
		
		Utility.implicitWait(1000, driver);
		
		Reporter.log("Launching neostox application", true);
	}

}
