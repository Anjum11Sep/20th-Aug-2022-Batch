package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple_Eg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		
		WebElement car = driver.findElement(By.id("cars"));
		
		Select s=new Select(car);
		s.selectByVisibleText("Volvo");
		s.selectByIndex(2);
		s.selectByValue("audi");
		
		System.out.println(s.isMultiple());
		
		Thread.sleep(1000);
		
		System.out.println("===============================================================");
		//s.deselectAll();
		s.deselectByIndex(0);
		s.deselectByValue("opel");
		s.deselectByVisibleText("Audi");

		System.out.println(s.isMultiple());
		Thread.sleep(2000);
		
		driver.close();		

	}

}
