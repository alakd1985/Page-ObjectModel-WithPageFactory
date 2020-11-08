package page.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocator {

	@FindBy(css = "#signin-loginid")
	public WebElement emailBox;

	@FindBy(css = "#signin-password")
	public WebElement passWordBox;

	@FindBy(css = "#submitButton")
	public WebElement signInBtn;
}
