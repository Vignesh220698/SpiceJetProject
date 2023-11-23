package testP2;

import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0008__invalidRoundwayP2 extends ProjectSpicejetbaseP2{
	
	
	
	@Test(priority = 8, enabled = true)
	public void invalRoundway() throws InterruptedException {
		
		new HomepageP2(driver).RoundTripinvalid().invalidroundway();;
		
	}

}
