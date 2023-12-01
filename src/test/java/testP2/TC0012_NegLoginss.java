package testP2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseP2.ProjectSpicejetbaseP2;
import pageP2.HomepageP2;

public class TC0012_NegLoginss extends ProjectSpicejetbaseP2{

	@BeforeTest
	public void excel() {
		Excelfile="NegLogin";
	}

	@Test(priority =12,dataProvider = "getdata",enabled = true)
	public void Neglog(String user1,String pass1) throws InterruptedException {

		new HomepageP2(driver).
		Neglogin().
		emailradio().
		emailfield(user1).
		passwordfield(pass1).
		logbutton();

	}
}
