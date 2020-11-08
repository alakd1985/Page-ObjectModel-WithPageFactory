package TestCase;

import org.testng.annotations.Test;

import base.PageFac;
import page.action.ExpediaHomePage;

public class FlightSearchTest {
	@Test
	public void flightsearchTest() throws InterruptedException {

		PageFac.initconfiguration();
		ExpediaHomePage hm = new ExpediaHomePage();
		hm.gotoFlights();
		Thread.sleep(2000);
		hm.bookaFlight("dulles", "barcelona");
		hm.travelers();
	}

}
