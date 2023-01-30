package setSizeAndsetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//get default size of page(window)
		
	//	System.out.println(driver.manage().window().getSize());
		
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println(defaultSize);
		
		
		//how to set size
		
		// create object of dimention class and pass values of width and height for window
		
			Dimension d=new Dimension(1500, 500);
			Thread.sleep(1000);
			
			driver.manage().window().setSize(d);
			
			Dimension newSize = driver.manage().window().getSize();
			
			System.out.println(newSize);
			

	}

}
