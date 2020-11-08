package page.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.PageFac;
import page.locator.SignInPageLocator;

public class SignInPage extends PageFac {

	public SignInPageLocator sign;

	public SignInPage() {
		this.sign = new SignInPageLocator();
		AjaxElementLocatorFactory aj = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(aj, this.sign);
	}

	public void doSignin(String username, String password) {
		sign.emailBox.sendKeys(username);
		sign.passWordBox.sendKeys(password);
		sign.signInBtn.click();
	}
}
