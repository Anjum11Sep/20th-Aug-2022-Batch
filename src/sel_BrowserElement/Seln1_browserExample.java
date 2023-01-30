package sel_BrowserElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seln1_browserExample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
       //		driver.quit();
		
		String title = driver.getTitle();
		System.out.println("The title of page is "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("The url is "+url);
		
	
			Thread.sleep(1000);
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		driver.close();
		
	
		
		
	}

}
