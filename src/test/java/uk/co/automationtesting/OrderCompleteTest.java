package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.OrderFormDeliveryPage;
import PageObjects.OrderFormPaymentPage;
import PageObjects.OrderFormPersonalInfoPage;
import PageObjects.OrderFormShippingMethodPage;
import PageObjects.StoreLoginPage;
import PageObjects.StoreContentPanel;
import PageObjects.StoreHomePage;
import PageObjects.StoreProductPage;
import base.ExtentManager;
import base.Hooks;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks {

	public OrderCompleteTest() throws IOException {
		super();

	}

	@Test
	public void endToEndTest() throws IOException, InterruptedException {

		
		HomePage home = new HomePage();

		// handles cookie prompt
		home.getCookie().click();

		home.getTestStoreLink().click();
		ExtentManager.pass("Have successfully reached the store homepage!!");
		StoreHomePage shopHome = new StoreHomePage();
		shopHome.getProduct1().click();
		ExtentManager.pass("Have successfully clciked on the product!!");
		StoreProductPage storeProduct = new StoreProductPage();
		ExtentManager.pass("Have successfully reached the shop product page!!");
		Select option = new Select(storeProduct.getSizeOption());
		option.selectByVisibleText("M");
		ExtentManager.pass("Have successfully selected the product size!!");
		storeProduct.getQuantityIncrease().click();
		ExtentManager.pass("Have successfully increased the product quantity!!");
		storeProduct.getAddtoCartButton().click();
		ExtentManager.pass("Have successfully added the product to the cart!!");

		// creating an object of the cart content panel (once an item was added)
		StoreContentPanel cPanel = new StoreContentPanel();
		cPanel.getProceedToCheckOutButton().click();

		// creating an object of the shopping cart page (all items selected)
		StoreLoginPage cart = new StoreLoginPage();
		ExtentManager.pass("Have successfully reached the shopping cart page!!");
		
		ExtentManager.pass("Have successfully checked out the product!!");

		// creating an object of the order personal information page
		OrderFormPersonalInfoPage pInfo = new OrderFormPersonalInfoPage();
		pInfo.getGenderMr().click();
		pInfo.getFirstNameField().sendKeys("John");
		pInfo.getLastnameField().sendKeys("Smith");
		pInfo.getEmailField().sendKeys("johnsmith@test.com");
		pInfo.getTermsConditionsCheckbox().click();
		pInfo.getContinueBtn().click();
		ExtentManager.pass("Have successfully entered the customer details!!");
		
		
		// creating an object of the order delivery info page
		OrderFormDeliveryPage orderDelivery = new OrderFormDeliveryPage();
		orderDelivery.getAddressField().sendKeys("123 Main Street");
		orderDelivery.getCityField().sendKeys("Houston");
		Select state = new Select(orderDelivery.getStateDropdown());
		state.selectByVisibleText("Texas");
		orderDelivery.getPostcodeField().sendKeys("77021");
		orderDelivery.getContinueBtn().click();
		ExtentManager.pass("Have successfully entered the delivery Information!!");
		// creating an object of the shipping method page
		OrderFormShippingMethodPage shipMethod = new OrderFormShippingMethodPage();
		shipMethod.getDeliveryMsgTextbox().sendKeys("If I am not in, please leave my delivery on my porch.");
		shipMethod.getContinueBtn().click();
		ExtentManager.pass("Have successfully selected the shipping!!");

		// creating an object of the payment options page
		OrderFormPaymentPage orderPay = new OrderFormPaymentPage();
		orderPay.getPayByCheckRadioBtn().click();
		orderPay.getTermsConditionsCheckbox().click();
		orderPay.getOrderBtn().click();
		Thread.sleep(5000);
		ExtentManager.pass("Have successfully placed the order!!");
	}
	
}
