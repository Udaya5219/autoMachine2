package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreLoginPage extends BasePage{

	WebDriver driver;
	
	By Email = By.cssSelector("section input[name='email']");
	By Password = By.cssSelector("input[name='password']");
	By SubmitButton = By.cssSelector("button#submit-login");
	By ForgotPassword = By.cssSelector("form#login-form a[rel='nofollow']");
	
	public StoreLoginPage() throws IOException {
		super();
	}
	
	public WebElement getEmail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Email);
	}
	
	public WebElement getPassword() throws IOException {
			this.driver = getDriver();
			return driver.findElement(Password);
	}
		
	public WebElement getSubmitButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(SubmitButton);
	}

}
