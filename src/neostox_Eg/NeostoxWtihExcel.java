package neostox_Eg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeostoxWtihExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Reading data from Excel sheet
		
		File myfile=new File("C:\\Users\\Anjum\\ExcelJar_files\\Anjum.xlsx");
		
	   Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
	   
	   String UserID = mysheet.getRow(0).getCell(0).getStringCellValue();  //apply ' in sheet before number to convert numeric to string
	   
	   String password = mysheet.getRow(0).getCell(1).getStringCellValue();
	   
	   String expUserName = mysheet.getRow(0).getCell(2).getStringCellValue();
	    
	    
		//Launch URL
	   
		driver.get("https://neostox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//click on sign in button
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//Enter mobile number
		WebElement num = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		num.sendKeys(UserID);
		
		driver.findElement(By.id("lnk_signup1")).click();
		
	//   Thread.sleep(1000);
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//enter password
	   
		driver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
		
		Thread.sleep(3000);
		
		//Handle alert popup
		driver.findElement(By.linkText("OK")).click();
		
		driver.findElement(By.linkText("Close")).click();
		
		driver.findElement(By.id("lbl_username")).click();
		
		String ActualUserName = driver.findElement(By.id("lbl_username")).getText();
		
	//	String ExpectedUserName = "Hi anjum shaikh";
		
		if(expUserName.equals(ActualUserName))
		{
			System.out.println("Actual and expected usernames are matching, TC is passed");
		}
		else
		{
			System.out.println("Actual and expected usernames are not matching, TC is failed");
		}
		
		//logging out
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("lbl_username")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("lnk_logout")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.close();
		

	}

}
