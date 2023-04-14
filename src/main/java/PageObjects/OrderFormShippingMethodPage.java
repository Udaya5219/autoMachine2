package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormShippingMethodPage extends BasePage{

	WebDriver driver;
	
	By DeliveryMsgTextbox = By.cssSelector("textarea#delivery_message");
	By ContinueBtn = By.cssSelector("[name='confirmDeliveryOption']");

	public OrderFormShippingMethodPage() throws IOException {
		super();
	}
	
	public WebElement getDeliveryMsgTextbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(DeliveryMsgTextbox);
	}
	
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ContinueBtn);
	}
}
