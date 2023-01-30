package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		driver.manage().window().maximize();

		//create an object of WebDriverWait
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(20000));
		
		//using object take next action
		
	//	w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"))));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
		
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		
		

	}

}
