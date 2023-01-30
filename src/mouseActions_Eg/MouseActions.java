package mouseActions_Eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		WebElement signinbutton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		//signinbutton.click();
		
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		
		//create object of actions class & pass argument as driver(object of chrome driver)
		
		Actions as=new Actions(driver);
		
//		as.click(signinbutton).perform();
		
//		as.moveToElement(signinbutton).click().build().perform();         //when 2 or more methods binded in 1 line then need to use build()
		
//		as.doubleClick(signinbutton).perform();
		
		as.contextClick(link).perform();
		
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
}
	