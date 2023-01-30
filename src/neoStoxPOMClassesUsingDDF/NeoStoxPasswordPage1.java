package neoStoxPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	}
	
	public void ClickOnSubmitButton() throws InterruptedException
	{
		Thread.sleep(500);
		SubmitButton.click();
	}
}
