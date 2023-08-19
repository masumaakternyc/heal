package heal.com.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import heal.com.utitlities.ConfigsFactory;

public class DriverSetup {

	private static WebDriver driver;

//	public static WebDriver getDriver() {
//		String browser = System.getProperty("browser", ConfigsFactory.getConfig().browser());
//
//		if (browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if ((browser.equalsIgnoreCase("firefox"))) {
//			driver = new FirefoxDriver();
//		} else {
//			driver = new ChromeDriver();
//		}
//
//		return driver;
//	}

	// public static WebDriver driver;

	public static void setupChromeDriver() {

		driver = new ChromeDriver();
	}

	public static void setupFirefoxDriver() {
		driver = new FirefoxDriver();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void tearDownDriver() {
		driver.quit();
	}

}
