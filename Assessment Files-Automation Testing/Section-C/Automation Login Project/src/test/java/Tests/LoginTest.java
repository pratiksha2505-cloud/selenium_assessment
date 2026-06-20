package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.BaseClass;
import utilities.ExcelUtility;

public class LoginTest extends BaseClass{

	@DataProvider(name="loginData")
	public Object[][] loginData() throws Exception
	{
		return ExcelUtility.getLoginData();
	}
	
	@Test(dataProvider = "loginData")
	public void loginValidation(String username,String password,boolean expectedResult)
	{
		LoginPage login=new LoginPage(driver);
		login.login(username, password);
		
		boolean actualResult=driver.getCurrentUrl().contains("logged-in-successfully");
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}
}
