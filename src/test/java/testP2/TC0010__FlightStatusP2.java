package testP2;

import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0010__FlightStatusP2 extends ProjectSpicejetbaseP2{
	
	
	
	@Test(priority = 10, enabled=true)
	public void FlightSta() throws InterruptedException {
		
		
		new HomepageP2(driver).
		FlightStatus().
		Flightstatus1();
	}

}
