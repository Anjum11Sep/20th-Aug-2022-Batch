package neoStoxPOMClassUsingUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxDashboardPage1
//new method is added in dashboard page(for getting AC balance),other classes are same

{
	@FindBy(xpath = "(//a[@class='btn btn-sm neobutton'])[7]") private WebElement PopupOkButton;
//	@FindBy(linkText = "OK") private WebElement PopupOkButton;
//	@FindBy(linkText = "Close") private WebElement PopupCloseButton;
//	@FindBy(xpath = "//span[@id='lbl_username']") private WebElement UserName;
	@FindBy(id="lbl_username") private WebElement UserName;
	@FindBy(id = "lnk_logout") private WebElement LogoutButton;
	
	@FindBy(id = "navbarDropdown") private WebElement LogoutDropdown;
	@FindBy(id="lbl_curbalancetop") private WebElement AcBalance;
	
	public NeoStoxDashboardPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void HandlePopup(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		if(PopupOkButton.isDisplayed())
		{
			Utility.scrollIntoView(driver, PopupOkButton);
			PopupOkButton.click();
			Reporter.log("Clicking on popup OK button", true);
		}	
			
         	//	    Thread.sleep(500);
			//    Utility.scrollIntoView(driver, PopupCloseButton);
			//    PopupCloseButton.click();
			//    Reporter.log("clicking on popup close button", true);
//		}
		else
		{
			Reporter.log("There is no popup", true);
		}			
	}
	
	public String getActualUserName()           //in TestNG if, else doesn't give proper output, it doesn't recognize true and false output so using assertion
	{
		String actualUserName = UserName.getText();
		Reporter.log("getting actual user name ", true);
		Reporter.log("Actual username is --> "+actualUserName, true);
		return actualUserName;
	}
	
	public void ClickOnLogoutButton() throws InterruptedException
	{
		LogoutDropdown.click();
		
		Thread.sleep(1000);
		LogoutButton.click();
		Reporter.log("Logging out from neostox ", true);
		Thread.sleep(1000);
	}
	
	public String getAcBalance()
	{
		String balance = AcBalance.getText();
		Reporter.log("getting account balance", true);
		Reporter.log("Account balance is "+balance, true);
		return balance;
		
	}

}
