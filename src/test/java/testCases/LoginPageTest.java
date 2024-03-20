package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pages.LoginPage;

public class LoginPageTest extends Testbase
{
	LoginPage login;
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		initialization();
		login=new LoginPage();
	}
	@Test
	public void VerifyTitleOfApplicationTest()
	{
		String expTitle="Swag Labs";
		String actTitle=login.VerifyTitleOfApplication();
		Assert.assertEquals(expTitle, actTitle);
	}
	@Test
	public void VerifyURLOfApplicationTest()
	{
		String expURL="https://www.saucedemo.com/v1/";
		String actURL=login.VerifyURLOfApplication();
		Assert.assertEquals(expURL, actURL);
	}
	@Test
	public void LoginIntoApplicationTest()
	{
		String expURL="https://www.saucedemo.com/v1/inventory.html";
		String actURL=login.LoginIntoApplication();
		Assert.assertEquals(expURL, actURL);
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
