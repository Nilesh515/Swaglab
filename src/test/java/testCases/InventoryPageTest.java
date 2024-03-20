package testCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pages.InventoryPage;
import pages.LoginPage;

public class InventoryPageTest extends Testbase
{
	LoginPage login;
	InventoryPage invent;
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		initialization();
		login=new LoginPage();
		invent=new InventoryPage();
		login.LoginIntoApplication();
	}
	@Test
	public void VerifyProductLabelTest()
	{
		String expText="Products";
		String actText=invent.VerifyProductLabel();
		Assert.assertEquals(expText, actText);
		Reporter.log("Application Label = "+actText);
		
	}
	@Test
	public void VerifyRedRoboImageTest()
	{
		boolean result=invent.VerifyRedRoboImage();
		Assert.assertEquals(result, true);
		Reporter.log("Visibility of Red Robo Image = "+ result);
	}
	@Test
	public void VerifyApplicationLogoTest()
	{
		boolean logo=invent.VerifyApplicationLogo();
		Assert.assertEquals(logo, true);
		Reporter.log("Visibility of Application Logo = "+logo);
	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	@Test
	public void VerifyShoppingCartIconTest()
	{
		String expURL="https://www.saucedemo.com/v1/cart.html";
		String actURL=invent.VerifyShoppingCartIcon();
		Assert.assertEquals(expURL, actURL);
	}

}
