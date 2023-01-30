package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		//how many rows are there in table
		
		System.out.println("The no of rows are "+table.size());
		
		//print table
		
		for(WebElement t:table)
		{
			System.out.println(t.getText());
		}
		
		// how many columns/headers are there?
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		
		System.out.println("The number of columns are "+header.size());
		
		//what are the headers?
		
		Iterator<WebElement> it = header.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		
		

	}

}
