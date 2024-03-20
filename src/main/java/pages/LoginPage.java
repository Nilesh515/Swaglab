package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class LoginPage extends Testbase
{
	//Object Repository
	@FindBy(xpath = "//input[@id='user-name']") private WebElement usernameTextBox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextBox;
	@FindBy(xpath = "//input[@id='login-button']")private WebElement loginBtn;
	
	//Constructor to initialize the above web elements
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method for Login into the Application
	public String LoginIntoApplication()
	{
		usernameTextBox.sendKeys("standard_user");
		passwordTextBox.sendKeys("secret_sauce");
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	
	public String VerifyTitleOfApplication()
	{
		return driver.getTitle();
		
	}
	
	public String VerifyURLOfApplication()
	{
		return driver.getCurrentUrl();
		
	}

}
