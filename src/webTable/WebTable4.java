package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

		//outer for loop-->tr-->1-11
		for(int i=1;i<=11;i++)
		{
			//inner for loop-->columns-->th/td-->1-3
			for(int j=1;j<=3;j++)
			{
				if(i==1)
				{
					 String headerText = driver.findElement(By.xpath("//tbody//tr["+i+"]/th["+j+"]")).getText();
					 System.out.print(headerText +" ");
				}
				else
				{
					String dataText = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(dataText +" ");
				}
			}
			System.out.println();
		}	
			
			
	}

}
