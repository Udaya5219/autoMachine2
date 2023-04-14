package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormDeliveryPage extends BasePage{

WebDriver driver;
	
	By FirstNameField = By.cssSelector("input[name='firstname']");
	By LastNameField = By.cssSelector("input[name='lastname']");
	By CompanyNameField = By.cssSelector("input[name='company']");
	By AddressField = By.cssSelector("input[name='address1']");
	By AddressComplementField = By.cssSelector("input[name='address2']");
	By CityField = By.cssSelector("input[name='city']");
	By StateDropdown = By.cssSelector("select[name='id_state']");
	By PostcodeField = By.cssSelector("input[name='postcode']");
	By CountryDropdown = By.cssSelector("select[name='id_country']");
	By PhoneField = By.cssSelector("input[name='phone']");
	By InvoiceSameAddCheckBox = By.cssSelector("input#use_same_address");
	By ContinueButton = By.cssSelector("button[name='confirm-addresses']");
	
	public OrderFormDeliveryPage() throws IOException {
		super();
	}
	
	public WebElement getFirstNameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(FirstNameField);
	}
	
	public WebElement getLastnameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(LastNameField);
	}

	public WebElement getCompanyField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(CompanyNameField);
	}
	
	public WebElement getAddressField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddressField);
	}
	
	public WebElement getAddressCompField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddressComplementField);
	}
	
	public WebElement getCityField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(CityField);
	}
	
	public WebElement getStateDropdown() throws IOException {
		this.driver = getDriver();
		return driver.findElement(StateDropdown);
	}
	
	public WebElement getPostcodeField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(PostcodeField);
	}
	
	public WebElement getCountryDropdown() throws IOException {
		this.driver = getDriver();
		return driver.findElement(CountryDropdown);
	}

	public WebElement getPhoneField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(PhoneField);
	}
	
	public WebElement getInvoiceSameAddCheckbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(InvoiceSameAddCheckBox);
	}
	
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ContinueButton);
	}
}
