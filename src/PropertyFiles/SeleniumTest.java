package PropertyFiles;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.PropertiesFile;

import config.PropertyFile;

public class SeleniumTest {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		//setBrowser();
		PropertyFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertyFile.writePropertiesFile();

	}
	/** 
	 * Description
	 * */

	public static void setBrowser() {
		browser = "Firefox";
	}

	public static void setBrowserConfig() {
		if (browser.contains("Firefox")) {
			driver = new FirefoxDriver();
		}
		if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:/SOFTWARES/Testing software/chromedriver.exe");
			driver = new ChromeDriver();
		}

	}

	public static void runTest() {
		driver.get("https://www.google.com/");
	}

}
