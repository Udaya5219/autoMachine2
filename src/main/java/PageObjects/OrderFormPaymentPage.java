package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPaymentPage extends BasePage{

WebDriver driver;
	
	By PayByCheck = By.xpath("//span[.='Pay by Check']");
	By PayByWire = By.xpath("//span[.='Pay by bank wire']");
	By TermsAndConditions = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
	By OrderButton = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");
	
	public OrderFormPaymentPage() throws IOException {
		super();
	}
	
	public WebElement getPayByCheckRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(PayByCheck);
	}
	
	public WebElement getPayByWireRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(PayByWire);
	}
	
	public WebElement getTermsConditionsCheckbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(TermsAndConditions);
	}

	public WebElement getOrderBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(OrderButton);
	}
}
