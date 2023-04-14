package uk.co.automationtesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import PageObjects.StoreYourAccount;
import base.BasePage;
import base.ExtentManager;
import base.Hooks;

@Listeners(resources.Listeners.class)
public class StoreLoginTest extends Hooks {

	public StoreLoginTest() throws IOException {
		super();

	}

	@Test
	public void AddRemoveItem() throws IOException, InterruptedException {

		ExtentManager.log("Starting StoreLoginTest!!");
		HomePage home = new HomePage();

		// handles cookie prompt
		home.getCookie().click();

		home.getTestStoreLink().click();

		StoreHomePage shopHome = new StoreHomePage();
		ExtentManager.pass("Reached the shop homepage!!");
		shopHome.getLoginButton().click();
		String workBook = "C:\\Users\\Administrator\\Desktop\\Resources\\workspace\\autoMachine2\\src\\main\\java\\resources\\credentials.xlsx";
		FileInputStream workBookLocation = new FileInputStream(workBook);
		
		XSSFWorkbook workbook = new XSSFWorkbook(workBookLocation);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row1 = sheet.getRow(1);
		Cell cellR1C0 = row1.getCell(0);
		Cell cellR1C1 = row1.getCell(1);
		
		String emailRow1 = cellR1C0.toString();
		String PasswordRow1 = cellR1C1.toString();
		
		System.out.println(emailRow1);
		System.out.println(PasswordRow1);
		
		StoreLoginPage shop = new StoreLoginPage();
		shop.getEmail().sendKeys(emailRow1);
		shop.getPassword().sendKeys(PasswordRow1);
		shop.getSubmitButton().click();
		
		StoreYourAccount account = new StoreYourAccount();
		
		try {
			account.getSignOut().click();
			ExtentManager.pass("User Signed in Successfully");
		}catch(Exception e) {
			ExtentManager.fail("User NOT Signed in Successfully");
			Assert.fail();
		}
		/*
		Row row2 = sheet.getRow(2);
		Cell cellR2C0 = row2.getCell(0);
		Cell cellR2C1 = row2.getCell(1);
		
		String emailRow2 = cellR2C0.toString();
		String PasswordRow2 = cellR2C1.toString();
		
		System.out.println(emailRow2);
		System.out.println(PasswordRow2);
		
		shop.getEmail().sendKeys(emailRow2);
		shop.getPassword().sendKeys(PasswordRow2);
		shop.getSubmitButton().click();
		
		Thread.sleep(3000);
		
		try {
			account.getSignOut().click();
			ExtentManager.pass("User Signed in Successfully");
		}catch(Exception e) {
			ExtentManager.fail("User NOT Signed in Successfully");
			Assert.fail();
		}
		
			
		*/
		
	}
}
