package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreContentPanel extends BasePage{

	WebDriver driver;
	By ContinueShoppingButton = By.xpath("//button[normalize-space()='Continue shopping']");
	
	By ProceedToCheckOutButton = By.linkText("PROCEED TO CHECKOUT");
	
	public StoreContentPanel() throws IOException {
		super();
	}
	
	public WebElement getContinueShoppingButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ContinueShoppingButton);
	}
	public WebElement getProceedToCheckOutButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ProceedToCheckOutButton);
	}
}
