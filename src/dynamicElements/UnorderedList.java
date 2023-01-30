package dynamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(500);
		
		List<WebElement> SearchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println("No of items in list are "+SearchResults.size());
		
		for(WebElement s:SearchResults)
		{
			System.out.println(s.getText());
		}
		
		
		for(WebElement result:SearchResults)
		{
			String expected = "honda amaze";
			
			String actual = result.getText();
			
			if(expected.equals(actual))
			{
				System.out.println("clicked on "+result.getText());
				result.click();
				break;
				
			}
		}
		
		Thread.sleep(500);
		
		driver.findElement(By.linkText("Images")).click();
		

	}

}
