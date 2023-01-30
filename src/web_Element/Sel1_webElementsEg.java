package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel1_webElementsEg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi, Good Morning");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();                        //clear() method
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Good Evening All");             //sendkeys() method
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();                  //click() method
		
		
	}

}
