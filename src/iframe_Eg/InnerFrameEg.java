package iframe_Eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InnerFrameEg
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//nested Frame
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		WebElement text = driver.findElement(By.tagName("input"));
		text.sendKeys("Selenium");
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
         driver.switchTo().frame("frame2");
         
         Thread.sleep(1000);
         
       //  WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
         
         WebElement animals=driver.findElement(By.id("animals"));
         
         //creating the object of select class for dropdown elements
      Select s=new Select(animals);           
      s.selectByIndex(2);         //search element By index from list
      
      driver.switchTo().defaultContent();
      String mainPageText = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
      
      System.out.println("The main page text is "+mainPageText);
      
	}

}
