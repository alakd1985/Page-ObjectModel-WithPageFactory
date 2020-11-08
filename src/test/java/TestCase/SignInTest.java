package TestCase;

import org.testng.annotations.Test;

import base.PageFac;
import page.action.SignInPage;

public class SignInTest {
	@Test
	public void signIntest() throws InterruptedException {
		PageFac.initconfiguration();
		SignInPage sp = PageFac.topnav.gotoSignin();
		sp.doSignin("leoalak@gmail.com", "Toma*1996");

	}
}
