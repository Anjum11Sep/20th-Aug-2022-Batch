package dropdown_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Eg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s=new Select(day);
		s.selectByValue("11");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1=new Select(month);
		s1.selectByIndex(8);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s3=new Select(year);
		s3.selectByVisibleText("1999");
		
		
		System.out.println(s3.isMultiple());
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
