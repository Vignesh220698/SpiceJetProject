package testP2;

import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0011__MangeBookP2 extends ProjectSpicejetbaseP2{
	
	@Test(priority = 11, enabled =true)
	public void ManageBooking1() throws InterruptedException {
		
		new HomepageP2(driver).
		Managebooking().
		Managebooking1();
		
	}

}
