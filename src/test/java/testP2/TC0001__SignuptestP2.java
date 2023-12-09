package testP2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0001__SignuptestP2 extends ProjectSpicejetbaseP2{


	@BeforeTest
	public void setdata() {
		Excelfile="psignup";
	}

	@Test(priority = 1,dataProvider = "getdata",enabled  = true)
	public void Register(String fname,String lname,String dob,String mob,String email,String pass,String conpass) throws InterruptedException {

		new HomepageP2(driver).
		signupbutton().
		PSignup().
		firstname(fname).
		lastname(lname).
		date(dob).
		mobile(mob).
		email(email).
		pass(pass).
		cpass(conpass).
		checkbox().
		submitbutton();
		//signupPage();
	}
}