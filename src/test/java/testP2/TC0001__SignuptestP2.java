package testP2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0001__SignuptestP2 extends ProjectSpicejetbaseP2{
	
	
//	@BeforeTest
//	public void setdata() {
//		Excelfile="signup";
//	}



	
	@Test(priority = 1, enabled = true)
	public void Register() throws InterruptedException {
		
		new HomepageP2(driver).
	    signupbutton().	
		signupPage();

}
}