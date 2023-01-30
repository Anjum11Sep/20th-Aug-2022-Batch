package keyboard_Eg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDropdownActions 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
				
		//1.create an object of Actions class
		
		Actions act=new Actions(driver);
		
		//2. find element
		WebElement day = driver.findElement(By.id("day"));
		
		//3. take required action
		
		act.click(day).perform();
		Thread.sleep(1000);
		
		//using sendkeys
		
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
	//	act.sendKeys(Keys.ENTER).perform();
		
	//	Thread.sleep(1000);
		
		//action using keyDown
		act.keyDown(day, Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			
			//action using keyUp
			
		act.keyUp(day,Keys.ARROW_UP).perform();
		

	}

}
