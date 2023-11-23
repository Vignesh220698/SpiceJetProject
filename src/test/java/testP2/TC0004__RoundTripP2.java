package testP2;

import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0004__RoundTripP2 extends ProjectSpicejetbaseP2{
	
	@Test(priority = 4, enabled = true)
	 public void RoundTrip() throws InterruptedException {
		
		 new HomepageP2(driver).
	     flightbutton1().
	     RoundWay();
	 }
}
