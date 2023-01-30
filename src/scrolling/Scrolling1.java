package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//typecast driver object into JavaScriptExecuter and store it in a reference variable
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//using object call method ExecuteScript
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1000)");      //scroll down
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-500)");      //scroll up

	}

}
