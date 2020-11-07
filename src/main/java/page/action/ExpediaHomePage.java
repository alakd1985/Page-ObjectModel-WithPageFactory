package page.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.PageFac;
import page.locator.HomePageLocators;

public class ExpediaHomePage extends PageFac {
	public HomePageLocators home;

	public ExpediaHomePage() {
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory aj = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(aj, this.home);
	}

	// important concepts
	public ExpediaHomePage gotoFlights() {
		home.flighttab.click();
		return this;

	}

	public void gotoHotels() {

	}

	public void bookaFlight(String from, String to) {
		home.leavingFrom.sendKeys(from);
		home.destination.sendKeys(to);

	}
}
