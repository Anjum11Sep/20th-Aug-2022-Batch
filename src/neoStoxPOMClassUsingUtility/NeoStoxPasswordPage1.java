package neoStoxPOMClassUsingUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxPasswordPage1 
{

	@FindBy(id = "txt_accesspin") private WebElement NeoStoxPasswordField;
	@FindBy(xpath = "//a[text()='Submit']") private WebElement SubmitButton;
	
	public NeoStoxPasswordPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPassword(String Password)
	{
		NeoStoxPasswordField.sendKeys(Password);
		Reporter.log("entering password", true);
	}
	
	public void ClickOnSubmitButton() throws InterruptedException
	{
		
		SubmitButton.click();
		Reporter.log("clicking on submit button", true);
	}
}
