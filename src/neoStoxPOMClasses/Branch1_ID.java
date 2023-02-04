package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Branch1_ID 
{
	 @FindBy(xpath = "(//input[@type='number'])[1]") private WebElement MobileNumField;
		
		@FindBy(id = "lnk_signup1") private WebElement SignInButton;
		
		//2.
		
		public Branch1_ID(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3. enter mobile number
		
		public void EnterMobileNumber()
		{
			MobileNumField.sendKeys("7264862687");
		}
		
		public void ClickOnSignInButton()
		{
			SignInButton.click();
		}
		
		public void EnterPassword()
		{
			MobileNumField.sendKeys("1234");
		}
		

}
