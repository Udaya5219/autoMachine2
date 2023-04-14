package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPersonalInfoPage extends BasePage{
	WebDriver driver;
	
	By GenderMr = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
	By GenderMrs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
	By FirstNameField = By.cssSelector("input[name='firstname']");
	By LastNameField = By.cssSelector("input[name='lastname']");
	By EmailField = By.cssSelector("form#customer-form > section input[name='email']");
	By PasswordField = By.cssSelector("form#customer-form > section input[name='password']");
	By BirthDateField = By.cssSelector("input[name='birthday']");
	By ReceiveOffersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label > span");
	By NewsletterCheckbox = By.cssSelector("div:nth-of-type(8)  span > label > span");
	By TermsConditionsCheckbox = By.cssSelector("input[name='psgdpr']");
	By ContinueBtn = By.cssSelector("form#customer-form  button[name='continue']");
	
	public OrderFormPersonalInfoPage() throws IOException {
		super();
	}
	
	public WebElement getGenderMr() throws IOException {
		this.driver = getDriver();
		return driver.findElement(GenderMr);
	}

	public WebElement getGenderMrs() throws IOException {
		this.driver = getDriver();
		return driver.findElement(GenderMrs);
	}

	public WebElement getFirstNameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(FirstNameField);
	}
	
	public WebElement getLastnameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(LastNameField);
	}

	public WebElement getEmailField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(EmailField);
	}
	
	public WebElement getPasswordField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(PasswordField);
	}
	
	public WebElement getBirthDateField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(BirthDateField);
	}
	
	public WebElement getRecOfferCheckbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ReceiveOffersCheckbox);
	}
	
	public WebElement getNewsletterCheckbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(NewsletterCheckbox);
	}
	
	public WebElement getTermsConditionsCheckbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(TermsConditionsCheckbox);
	}
	
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ContinueBtn);
	}
}
