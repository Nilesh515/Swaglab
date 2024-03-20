package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class InventoryPage extends Testbase
{
	//Object Repository
	@FindBy(xpath = "//div[@class='product_label']") private WebElement productTitleText;
	@FindBy(xpath = "//div[@class='peek']") private WebElement redRoboImg;
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement ApplicationLogo;
	@FindBy(xpath = "//div[@class='shopping_cart_container']") private WebElement shoppingCartIcon;

	//Constructor
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyProductLabel()
	{
		return productTitleText.getText();
		
	}
	
	public boolean VerifyRedRoboImage()
	{
		return redRoboImg.isDisplayed();
		
	}
	public boolean VerifyApplicationLogo()
	{
		return ApplicationLogo.isDisplayed();
		
	}
	public String VerifyShoppingCartIcon()
	{
		shoppingCartIcon.click();
		return driver.getCurrentUrl();
		
	}
}
