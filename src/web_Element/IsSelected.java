package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
		
		
		if(checkbox.isSelected())
		{
			System.out.println("The checkbox is selected");
		}
		
		else
		{
			System.out.println("The checkbox is not selected, please select the checkbox");
			
			checkbox.click();
			System.out.println("Now checkbox is selected");
		}

		 WebElement Radiobutton = driver.findElement(By.xpath("//input[@value='Radio3']"));
		 Radiobutton.click();
		 
	   System.out.println(Radiobutton.isSelected());
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
