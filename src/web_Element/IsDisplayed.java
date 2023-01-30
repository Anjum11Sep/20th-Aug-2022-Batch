package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		hide.click();
		
		WebElement show = driver.findElement(By.id("show-textbox"));
		
		
		if(textbox.isDisplayed())
		{
			System.out.println("The text box is visible");
			textbox.sendKeys("selenium");
		}
		
		else
		{
			System.out.println("The textbox is not visible.please make it visible");
			
			show.click();
			
			System.out.println("Now textbox is visible. please enter input");
			textbox.sendKeys("selenium");
			
		}

	}

}
