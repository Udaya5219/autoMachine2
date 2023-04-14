package uk.co.automationtesting;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.StoreLoginPage;
import PageObjects.StoreContentPanel;
import PageObjects.StoreHomePage;
import PageObjects.StoreProductPage;
import base.BasePage;
import base.ExtentManager;
import base.Hooks;

@Listeners(resources.Listeners.class)
public class AddRemoveItemToBasketTest extends Hooks {

	public AddRemoveItemToBasketTest() throws IOException {
		super();

	}

	@Test
	public void AddRemoveItem() throws IOException, InterruptedException {
		
		ExtentManager.log("Starting AddRemoveItemToBasketTest!!");
		
		HomePage home = new HomePage();

		// handles cookie prompt
		home.getCookie().click();

		home.getTestStoreLink().click();

		StoreHomePage shopHome = new StoreHomePage();
		ExtentManager.pass("Reached the shop homepage!!");
		shopHome.getProduct1().click();

		StoreProductPage storeProduct = new StoreProductPage();
		ExtentManager.pass("Reached the shop product page!!");
		Select option = new Select(storeProduct.getSizeOption());
		option.selectByVisibleText("M");
		ExtentManager.pass("Have successfully selected the product size!!");
		storeProduct.getQuantityIncrease().click();
		ExtentManager.pass("Have successfully increased the product quantity!!");
		storeProduct.getAddtoCartButton().click();
		ExtentManager.pass("Have successfully added the product to basket!!");
		// creating an object of the cart content panel (once an item was added)
		StoreContentPanel cPanel = new StoreContentPanel();
		cPanel.getContinueShoppingButton().click();
		storeProduct.getHomeLink().click();
		shopHome.getProduct2().click();
		storeProduct.getAddtoCartButton().click();

		cPanel.getProceedToCheckOutButton().click();

		StoreLoginPage cart = new StoreLoginPage();
		/*
		cart.getDeleteItem2().click();

		waitForElementInvisible(cart.getDeleteItem2(), Duration.ofSeconds(10));

		System.out.println(cart.getTotalValue().getText());
		
		
		 try {
		 
			Assert.assertEquals(cart.getTotalValue().getText(), "$45.24");
			ExtentManager.pass("The total amount matches the expected amount!!");
		}catch(AssertionError e){
			Assert.fail("Cart amount did not match the expected amount, it found" + cart.getTotalValue().getText() + "expected $45.24");
			ExtentManager.fail("The total amount is not matching the expected amount!!");
		}
		Assert.assertEquals(cart.getTotalValue().getText(), "45.24");
		
		*/
	}
	
}
