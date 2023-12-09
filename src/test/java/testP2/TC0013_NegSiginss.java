package testP2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0013_NegSiginss extends ProjectSpicejetbaseP2{
	
	@BeforeTest
	public void retrivedata() {
		Excelfile="Negsigup";
	}

	@Test(priority = 13,dataProvider = "getdata",enabled = true)
	public void negSigntest(String fname,String lname,String dob,String mob,String email,String pass,String conpass) throws InterruptedException {
		
		new HomepageP2(driver).
		NegSignups().
		NegSignup().
		firstname(fname).
		lastname(lname).
		date(dob).
		mobile(mob).
		email(email).
		pass(pass).
		cpass(conpass).
		checkbox().
		submitbutton();
		
	}
	
	
}
