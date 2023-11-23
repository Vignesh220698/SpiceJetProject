package baseP2;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utilityP2.UtilityP2;

public class ProjectSpicejetbaseP2  extends UtilityP2{
	
	@Parameters({"url","browser"})
	@BeforeMethod
	public void browserlaunch(String url,String browser) {
		
		launchbrowser(url,browser);
		
	}
	
	@DataProvider(name="getdata")
	public Object[][] Exceldata() throws IOException {
		Object[][] data=ReadExcel(Excelfile);
		return data;
	}

	@AfterMethod
	public void closebrowser() {
		closebrowserpage();
	}
	
}
