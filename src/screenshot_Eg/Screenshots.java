package screenshot_Eg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/recharge");
		
		Thread.sleep(1000);
		
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    //first import TakesScreenshot package and after that take command of getScreenshotAs();
	    
	    System.out.println(source);
	    
	  //create object of File & pass destination address & give name fot image in path
	    
	    File dest=new File("C:\\Users\\Anjum\\eclipse-workspace\\selenium_project\\ScreenshotEg\\PaytmRecharge.png");        
	    
	  //we need to store image so, need copy() method which is present in FileHandler class(select selenium fileHandler)
	    
	    FileHandler.copy(source, dest);   
	    
	    
	    Thread.sleep(5000);
	    driver.close();
	    
	    
		
	}

}
