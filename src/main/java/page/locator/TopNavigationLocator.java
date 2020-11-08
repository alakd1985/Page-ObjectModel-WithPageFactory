package page.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocator {

	@FindBy(xpath = "//div[contains(text(),'Sign in')]")
	public WebElement signInLink;

	@FindBy(xpath = "(//span[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-has-text uitk-button-primary']//span[contains(text(),'Sign in')])[2]")
	public WebElement signInButton;

	@FindBy(xpath = "//a[contains(text(),'Sign up, it’s free')]")
	public WebElement signUpButton;

}
