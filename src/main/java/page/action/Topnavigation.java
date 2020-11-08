package page.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.PageFac;
import page.locator.TopNavigationLocator;

public class Topnavigation {

	public TopNavigationLocator topNavigationLocator;

	public Topnavigation() {
		this.topNavigationLocator = new TopNavigationLocator();
		AjaxElementLocatorFactory aj = new AjaxElementLocatorFactory(PageFac.driver, 10);
		PageFactory.initElements(aj, this.topNavigationLocator);
	}

	public SignInPage gotoSignin() throws InterruptedException {
		/*
		 * topNavigationLocator.signInLink.click();
		 */
		Thread.sleep(1500);
		topNavigationLocator.signInButton.click();
		return new SignInPage();
	}

	public void gotoCrateAccount() {

	}

	public void gotoCars() {

	}

	public void gotoCruises() {

	}
}
