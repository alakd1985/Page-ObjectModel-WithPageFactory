package page.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(xpath = "//input[@id='nBSy-destination-airport']")
	public WebElement leavingTo;

	@FindBy(xpath = "//input[@id='nBSy-origin-airport']")
	public WebElement leavingFrom;

	@FindBy(xpath = "//button[@id='MFUH-travelersAboveForm-dialog-trigger']")
	public WebElement adultDropdown;

	@FindBy(xpath = "//div[contains(text(),'Adult')]")
	public WebElement travelers;

	@FindBy(xpath = "//a[@aria-label='Search for flights']")
	public WebElement flighttab;
}
