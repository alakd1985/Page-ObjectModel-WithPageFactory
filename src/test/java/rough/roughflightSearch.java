package rough;

import java.net.MalformedURLException;

import base.PageFac;
import page.action.ExpediaHomePage;

public class roughflightSearch {

	public static void main(String[] args) throws MalformedURLException {
		// System.setProperty("webdriver.chrome.driver",
		// ".\\src\\test\\resources\\driver\\chromedriver.exe");
		PageFac.initconfiguration();
		ExpediaHomePage homePage1 = new ExpediaHomePage();
		homePage1.gotoFlights().bookaFlight("dulles", "barcelona");

		PageFac.quitbrowser();
	}

}
