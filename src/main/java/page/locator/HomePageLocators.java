package page.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(xpath = "//span[contains(text(),'Flights')]")
	public WebElement flighttab;
}
