package chromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Eg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		
		//opt.addArguments("--headless");
		opt.addArguments("--start-maximized");
		opt.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(1000);
		
		String txt = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class')]")).getText();
		
		System.out.println(txt);
		
		
		Thread.sleep(1000);

	}

}
