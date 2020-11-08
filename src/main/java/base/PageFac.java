package base;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.action.Topnavigation;

public class PageFac {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public static Topnavigation topnav;
	// public ExtentReports reports = ExtentManager.getInstance();

	public static void initconfiguration() {
		if (Constants.BROWSER.equals("chrome")) {
			WebDriverManager.chromedriver().setup();

			Map<String, Object> prefs = new HashMap<String, Object>();

			prefs.put("profile.default_content_setting_values.notifications", 1);

			prefs.put("credentials_enable_service", false);

			prefs.put("profile.password_manager_enabled", false);

			ChromeOptions options = new ChromeOptions();

			options.setExperimentalOption("prefs", prefs);

			options.addArguments("--disable-extensions");

			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
			log.debug("chrome file loaded!!!");
		} else if (Constants.BROWSER.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}
		driver.get(Constants.testsite_url);
		driver.manage().window().maximize();
		topnav = new Topnavigation();

	}

	public static void quitbrowser() {
		driver.quit();
	}

}