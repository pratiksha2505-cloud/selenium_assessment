package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By logoutBtn=By.linkText("Log out");
	
	public void clickLogout()
	{
		driver.findElement(logoutBtn).click();
	}
}
