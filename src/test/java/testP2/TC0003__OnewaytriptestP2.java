package testP2;

import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0003__OnewaytriptestP2 extends ProjectSpicejetbaseP2{
	
	@Test(priority = 3 ,enabled = true)
	public void oneway() throws InterruptedException {
		
		new HomepageP2(driver).flightbutton().oneWaytrip();
	}

}
