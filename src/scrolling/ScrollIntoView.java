package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement Ancient_India = driver.findElement(By.xpath("//span[@id='Ancient_India']"));
		
		//typecast driver object into JavaScriptExecuter and store it in a reference variable
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		//using object call method ExecuteScript
		// pass arguments as  arguments[0].scrollIntoView(true)
		
		js.executeScript("arguments[0].scrollIntoView(true)",Ancient_India);
		

	}

}
