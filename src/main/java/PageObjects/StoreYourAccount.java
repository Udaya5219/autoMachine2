package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreYourAccount extends BasePage{

	WebDriver driver;
	
	By Heading = By.cssSelector("h1");
	By SignOut = By.linkText(" Sign out");
	
	public StoreYourAccount() throws IOException {
		super();
	}
	
	public WebElement getHeading() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Heading);
	}
	
	public WebElement getSignOut() throws IOException {
			this.driver = getDriver();
			return driver.findElement(SignOut);
	}
	
}
