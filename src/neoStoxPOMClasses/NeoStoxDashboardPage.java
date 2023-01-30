package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxDashboardPage 
{
	@FindBy(linkText = "OK") private WebElement PopupOkButton;
	@FindBy(linkText = "Close") private WebElement PopupCloseButton;
	@FindBy(xpath = "//span[@id='lbl_username']") private WebElement UserName;
	@FindBy(id = "lnk_logout") private WebElement LogoutButton;
	
	@FindBy(id = "navbarDropdown") private WebElement LogoutDropdown;
	
	public NeoStoxDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void HandlePopup() throws InterruptedException
	{
		Thread.sleep(500);
		PopupOkButton.click();
		Thread.sleep(500);
		PopupCloseButton.click();
	}
	
	public void ValidateUserName()
	{
		String ExpectedUserName = "Hi anjum shaikh";
		String ActualUserName = UserName.getText();
		
		if(ExpectedUserName.equals(ActualUserName))
		{
			System.out.println("Actual and expected usernames are matching, TC is passed");
		}
		else
		{
			System.out.println("Actual and expected usernames are not matching, TC is failed");
		}
	}
	
	public void ClickOnLogoutButton() throws InterruptedException
	{
		Thread.sleep(1000);
		LogoutDropdown.click();
		
		Thread.sleep(500);
		LogoutButton.click();
	}

}
