package screenshot_Eg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotwithRandom {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/recharge");
		
		Thread.sleep(1000);
		
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	        String random = RandomString.make(5);       //to add random things to the screenshot for making override
	        
	File dest=new File("C:\\Users\\Anjum\\eclipse-workspace\\selenium_project\\ScreenshotEg\\PaytmRecharge"+random+".jpg");
	
	FileHandler.copy(src, dest);
	
     Thread.sleep(1000);
      driver.close();
		
	}

}
