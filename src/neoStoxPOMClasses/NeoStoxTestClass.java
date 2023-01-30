package neoStoxPOMClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjum\\eclipse-workspace\\sel1\\chromedriver_win32\\chromedriver.exe");
		
		//created object of chromedriver

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch URL
		
		driver.get("https://neostox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		//create an object of Home page
		
		NeoStoxHomePage home=new NeoStoxHomePage(driver);
		home.clickOnSignInButton();
		
		//SignIn page
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		NeoStoxSignInPage signIn=new NeoStoxSignInPage(driver);
		
		signIn.EnterMobileNumber();
		signIn.ClickOnSignInButton();
		
		
		//password page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		NeoStoxPasswordPage password=new NeoStoxPasswordPage(driver);
		
		password.EnterPassword();
		password.ClickOnSubmitButton();
		
		//Dashboard page
		
		Thread.sleep(3000);
		NeoStoxDashboardPage dashboard=new NeoStoxDashboardPage(driver);
		
		dashboard.HandlePopup();
		dashboard.ValidateUserName();
		dashboard.ClickOnLogoutButton();
		
		driver.close();
	}

}
