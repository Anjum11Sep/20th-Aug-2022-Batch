package neoStoxPOMClassUsingUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxSignInPage1 
{

	//1.
	
		@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement MobileNumField;
		
		@FindBy(id = "lnk_signup1") private WebElement SignInButton;
		
		//2.
		
		public NeoStoxSignInPage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.
		
		public void EnterMobileNumber(String UserID)
		{
			MobileNumField.sendKeys(UserID);
			Reporter.log("entering mobile number ", true);
		}
		
		public void ClickOnSignInButton()
		{
			SignInButton.click();
			Reporter.log("clicking on sign in button", true);
		}
}
