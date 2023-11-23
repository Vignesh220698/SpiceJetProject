package testP2;

import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0005__invalidSignin extends ProjectSpicejetbaseP2{
	
	
	@Test(priority = 5, enabled = true)
	public void invalidsignin() throws InterruptedException {
		
		new HomepageP2(driver).signupbuttoninvalid().invalidsignup();
		
	}

}
