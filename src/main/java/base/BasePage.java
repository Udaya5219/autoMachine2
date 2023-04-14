package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private String url;
	private Properties prop;

	public static String screenshotDesinationPath;
	
	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Resources\\workspace\\autoMachine2\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
	}

	public String getDriverPath() {
		
			String s= (System.getProperty("user.dir"));
			return s;
	
	}
	public static WebDriver getDriver() throws IOException {
		return WebDriverInstance.getDriver();
	}

	public String getUrl() throws IOException {
		url = prop.getProperty("url");
		return url;
	}

	public static String takeSnapShot(String name) throws IOException {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

		String destFile = "C:\\Users\\Administrator\\Desktop\\Resources\\workspace\\autoMachine2\\target\\screenshots\\"
				+ timestamp() + ".png";

		screenshotDesinationPath = destFile;
		try {
			FileUtils.copyFile(srcFile, new File(destFile));
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		return name;
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	public static String getScreenshotDestinationPath() {
		
		return screenshotDesinationPath;
	}
	public static void waitForElementInvisible(WebElement element, Duration timer) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriver(),timer);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	
}
