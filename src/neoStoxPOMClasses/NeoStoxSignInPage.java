package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage 
{

	//1.
	
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement MobileNumField;
	
	@FindBy(id = "lnk_signup1") private WebElement SignInButton;
	
	//2.
	
	public NeoStoxSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	
	public void EnterMobileNumber()
	{
		MobileNumField.sendKeys("7264862687");
	}
	
	public void ClickOnSignInButton()
	{
		SignInButton.click();
	}
}
