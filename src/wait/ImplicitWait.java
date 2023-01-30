package wait;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//ImplicitWait --> applicable for whole webPage
		
		driver.findElement(By.id("searchInput")).click();
		Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		

	}

}
