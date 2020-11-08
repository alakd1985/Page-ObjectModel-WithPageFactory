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

	public void gotoFlights() {
		home.flighttab.click();
		// return this;

	}

	public void travelers() {
		home.adultDropdown.click();
	}

	public void gotoHotels() {

	}

	public void bookaFlight(String from, String to) {
		home.leavingFrom.click();
		home.leavingFrom.sendKeys(from);
		home.leavingTo.click();
		home.leavingTo.sendKeys(to);

	}
}
