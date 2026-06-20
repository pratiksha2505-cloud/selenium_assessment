package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.BaseClass;

public class LogoutTest  extends BaseClass{
@Test
public void logoutValidation()
{
	LoginPage login=new LoginPage(driver);
	login.login("student", "Password123");
	
	HomePage home=new HomePage(driver);
	home.clickLogout();
	
	Assert.assertTrue(driver.getCurrentUrl().contains("practice-test-login"));
}
}
