package neostox_Eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeostoxApp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://neostox.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement num = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		num.sendKeys("7264862687");
		
		driver.findElement(By.id("lnk_signup1")).click();
		
	   Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys("1234");
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("OK")).click();
		
		driver.findElement(By.linkText("Close")).click();
		
		driver.findElement(By.id("lbl_username")).click();
		
		String ActualUserName = driver.findElement(By.id("lbl_username")).getText();
		
		String ExpectedUserName = "Hi anjum shaikh";
		
		if(ExpectedUserName.equals(ActualUserName))
		{
			System.out.println("Actual and expected usernames are matching, TC is passed");
		}
		else
		{
			System.out.println("Actual and expected usernames are not matching, TC is failed");
		}
		
		//logging out
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("lbl_username")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("lnk_logout")).click();
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
