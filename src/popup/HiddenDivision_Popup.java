package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Popup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();      //taking xpath of cross to close popup
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Redmi note 11");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	//	Thread.sleep(3000);
		
		//driver.close();
	}

}
