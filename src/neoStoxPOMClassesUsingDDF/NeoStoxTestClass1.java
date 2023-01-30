package neoStoxPOMClassesUsingDDF;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class NeoStoxTestClass1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");
		
		//created object of chromedriver

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Reading data from Excel sheet using DDF
		
		File myfile=new File("C:\\Users\\Anjum\\ExcelJar_files\\Anjum.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		
		String UserID = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		String Password = mySheet.getRow(0).getCell(1).getStringCellValue();
		
		String ExpUserName = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		//launch URL
		
		driver.get("https://neostox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		//create an object of Home page
		
		NeoStoxHomePage1 home=new NeoStoxHomePage1(driver);
		home.clickOnSignInButton();
		
		//SignIn page
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		NeoStoxSignInPage1 signIn=new NeoStoxSignInPage1(driver);
		
		signIn.EnterMobileNumber(UserID);
        signIn.ClickOnSignInButton();
		
		
		//password page
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		NeoStoxPasswordPage1 password1=new NeoStoxPasswordPage1(driver);
		
		password1.EnterPassword(Password);
		password1.ClickOnSubmitButton();
		
		//Dashboard page

		Thread.sleep(3000);
		NeoStoxDashboardPage1 dashboard=new NeoStoxDashboardPage1(driver);
		
		dashboard.HandlePopup();
		dashboard.ValidateUserName(ExpUserName);
		dashboard.ClickOnLogoutButton();
		
		driver.close();
	

	}

}
