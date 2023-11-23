package testP2;

import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0007__invalidonewayP2 extends ProjectSpicejetbaseP2{
	
	@Test(priority = 7, enabled = true)
	public void invaloneway() throws InterruptedException {
		
		new HomepageP2(driver).onewayinvalid().invalidoneway();
		
	}

}
