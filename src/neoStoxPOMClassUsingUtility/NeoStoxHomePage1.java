package neoStoxPOMClassUsingUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxHomePage1
{

	//Data member should be declared globally with access level private using @findBy annotation
	
		@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement SignInButton;
		

		//initialize within a constructor with access level public using pageFactory
		
		public NeoStoxHomePage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilize within a method with access level public
		
		public void clickOnSignInButton()
		{
			
			SignInButton.click();
			Reporter.log("clicking on sign in button", true);
		}
		
}
