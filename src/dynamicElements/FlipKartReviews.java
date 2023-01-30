package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartReviews {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//Handle Hidden Division popup
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
		
		System.out.println(review);
		
	}

}
