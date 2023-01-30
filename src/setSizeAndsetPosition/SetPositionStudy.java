package setSizeAndsetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//get default position of page(window)
		
		System.out.println(driver.manage().window().getPosition());
		
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println("Default position is "+defaultPosition);
		
		//how to set position?
		
	 //1. crate object of point class and pass argument as X & Y co-ordinates
		
		Point p=new Point(400, -200);
		//Thread.sleep(1000);
		
	//2. use setPosition method to set the position and pass object of point class
		
		 driver.manage().window().setPosition(p);
		 
		System.out.println(driver.manage().window().getPosition());

	}

}
