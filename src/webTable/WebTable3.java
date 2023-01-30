package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

		//read total rows from table
		
		//outer for loop--> rows-->2-11(tr) -->i
		for(int i=2;i<=11;i++)
		{
			//inner for loop ---> table data(td) -->j
			for(int j=1;j<=3;j++)
			{
				 String TableData = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]")).getText();
				
				System.out.print(TableData +" ");
			}
			
			System.out.println();
		}
	}

}
