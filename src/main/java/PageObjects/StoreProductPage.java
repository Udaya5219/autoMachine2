package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreProductPage extends BasePage{

	WebDriver driver;
	
	By SizeOption = By.cssSelector("select[name='group[1]']");
	By QuantityIncrease = By.cssSelector(".touchspin-up");
	By QuantityDecrease = By.cssSelector(".touchspin-down");
	By AddtoCartButton = By.xpath("//button[@class='btn btn-primary add-to-cart']");
	By HomeLink = By.xpath("//span[text()='Home']");
	
	public StoreProductPage() throws IOException {
		super();
	}
	
	public WebElement getSizeOption() throws IOException {
		this.driver = getDriver();
		return driver.findElement(SizeOption);
	}
	public WebElement getQuantityIncrease() throws IOException {
		this.driver = getDriver();
		return driver.findElement(QuantityIncrease);
	}
	public WebElement getQuantityDecrease() throws IOException {
		this.driver = getDriver();
		return driver.findElement(QuantityDecrease);
	}
	public WebElement getAddtoCartButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddtoCartButton);
	}
	public WebElement getHomeLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(HomeLink);
	}
	
}
