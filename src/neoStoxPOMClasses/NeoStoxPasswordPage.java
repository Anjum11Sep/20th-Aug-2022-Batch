package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxPasswordPage 
{

	@FindBy(id = "txt_accesspin") private WebElement NeoStoxPasswordField;
	@FindBy(xpath = "//a[text()='Submit']") private WebElement SubmitButton;
	
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPassword()
	{
		NeoStoxPasswordField.sendKeys("1234");
	}
	
	public void ClickOnSubmitButton() throws InterruptedException
	{
		Thread.sleep(500);
		SubmitButton.click();
	}
}
