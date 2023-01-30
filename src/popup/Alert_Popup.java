package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alrt = driver.switchTo().alert();
		
		Thread.sleep(1000);
		
		System.out.println(alrt.getText());
		
		alrt.dismiss();
		
		String text = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
		System.out.println(text);
		//alrt.accept();

	}

}
