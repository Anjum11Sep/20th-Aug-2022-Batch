package popup;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_Popup 
{
	      
	public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();

		String mainpageID = driver.getWindowHandle();

		System.out.println("The main page ID is "+mainpageID);

		Set<String> allpagesID = driver.getWindowHandles();

		 Iterator<String> it = allpagesID.iterator();

		String mainpageNewID = it.next();

		System.out.println("The main page new ID "+mainpageNewID);

		 String childWindowID = it.next();
		 

		 driver.switchTo().window(childWindowID);

		 Thread.sleep(1000);

		driver.manage().window().maximize();

		driver.findElement(By.id("the7-search")).sendKeys("Velocity");


		// driver.quit();
	    driver.close();

		driver.switchTo().window(mainpageNewID);

		String mainpageText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		
		System.out.println(mainpageText);
		
		
		}
			

}
