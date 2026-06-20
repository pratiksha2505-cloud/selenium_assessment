package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		//super();
		this.driver = driver;
	}
	
	By username=By.id("username");
	By password=By.id("password");
	By submit=By.id("submit");
	By errorMsg=By.id("error");
	
	public void login(String user, String pass) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(user);
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
		
		driver.findElement(submit).click();
		
	}
	
	public String getErrorMessage()
	{
		return driver.findElement(errorMsg).getText();
	}
}
