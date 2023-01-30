package mouseActions_Eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_Eg2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.uitestpractice.com/Students/Actions");
		
		Thread.sleep(1000);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
//   	act.dragAndDrop(drag, drop).perform();    //drag and drop image
		
	  act.clickAndHold(drag).moveToElement(drop).release().build().perform();
				

	}

}
