package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonValidation {
  @Test
  public void ValidateRadionButtonStatus() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
           JavascriptExecutor js = (JavascriptExecutor)driver;
		
		    js.executeScript("arguments[0].scrollIntoView(true)", radio1);
		    
		    Thread.sleep(1000);
		
		
		radio1.click();
		
		Assert.assertTrue(radio1.isSelected(), "Radio 1 is not selected TC is failed");
			
		
	//	Thread.sleep(1000);
  }
}
