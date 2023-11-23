package testP2;

import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0009__Checkstapage  extends ProjectSpicejetbaseP2{
	
	
	@Test(priority = 9, enabled = true)
	public void status() throws InterruptedException {
		
		new HomepageP2(driver).
		checkstatus().
		checkstatus1();
	}

}
