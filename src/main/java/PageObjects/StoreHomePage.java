package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreHomePage extends BasePage {

	WebDriver driver;

	By Product1 = By.linkText("Hummingbird Printed T-Shirt");
	By Product2 = By.linkText("Hummingbird Printed Sweater");
	By Product3 = By.linkText("The Best Is Yet To Come'...");
	By Product4 = By.linkText("The Adventure Begins Framed...");
	By Product5 = By.linkText("Today Is A Good Day Framed...");
	By Product6 = By.linkText("Mug The Best Is Yet To Come");
	By Product7 = By.linkText("Mug The Adventure Begins");
	By Product8 = By.linkText("Mug Today Is A Good Day");
	By LoginButton = By.cssSelector("[title] .hidden-sm-down");

	public StoreHomePage() throws IOException {
		super();
	}

	public WebElement getProduct1() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Product1);
	}

	public WebElement getProduct2() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Product2);
	}

	public WebElement getProduct3() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Product3);
	}

	public WebElement getProduct4() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Product4);
	}

	public WebElement getProduct5() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Product5);
	}

	public WebElement getProduct6() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Product6);
	}

	public WebElement getProduct7() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Product7);
	}

	public WebElement getProduct8() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Product8);
	}

	public WebElement getLoginButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(LoginButton);
	}
}
