package testP2;

import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0006__InvalidLogin extends ProjectSpicejetbaseP2{
	
	@Test(priority = 6, enabled = true)
	public void invalidlogin() throws InterruptedException {
		
		new HomepageP2(driver).Logininvalid().invalidlog();
		
	}

}
