package testP2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0002__LogintestP2 extends ProjectSpicejetbaseP2{
	
	@BeforeTest
	public void ReadExcel() {
		Excelfile="Login";
	}

	
	@Test(priority = 2 ,dataProvider = "getdata", enabled = true)
	public void Login(String username,String password) throws InterruptedException{
		
		new HomepageP2(driver).
	
		loginbutton().
		//Loginpage();
		Emailradiobutton().
		loginusername(username).
		loginpassword(password);
//		loginbuttonSpice();

}
}


