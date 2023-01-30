package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_webelement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		
		WebElement getotp = driver.findElement(By.xpath("//button[@type='submit']"));
		// getotp.click();
		 
		 //boolean otp = getotp.isEnabled();
		// System.out.println("The OTP button is "+otp);
		 
		
		WebElement MobNo = driver.findElement(By.id("mobileNumber"));
		//MobNo.sendKeys("7264862687");
		
		Thread.sleep(1000);
		
		//boolean otp1 = getotp.isEnabled();
		//System.out.println("The OTP button is "+otp1);
		
		// getotp.click();
		 
	 if(getotp.isEnabled())
		 {
			 boolean otp = getotp.isEnabled();
			 System.out.println("The button is Enabled "+otp);
			getotp.click();
		 }
		 
		 else
		 {
			// System.out.println("The button is Disabled "+otp);
			 MobNo.sendKeys("7264862687");
			 Thread.sleep(1000);
			 
			 boolean otp1 = getotp.isEnabled();
				System.out.println("The button is Enabled "+otp1);
			 getotp.click();
			
			
			 
			 
		 }

	}

}
