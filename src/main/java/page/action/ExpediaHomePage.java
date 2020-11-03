package page.action;

import org.openqa.selenium.support.PageFactory;

import base.PageFac;
import page.locator.HomePageLocators;

public class ExpediaHomePage extends PageFac {
	public HomePageLocators home;

	public ExpediaHomePage() {
		this.home = new HomePageLocators();
		PageFactory.initElements(driver, this.home);
	}

	public void gotoFlights() {
		home.flighttab.click();

	}

	public void gotoHotels() {

	}

	public void bookaFlight(String from, String to, String returning) {

	}
}
