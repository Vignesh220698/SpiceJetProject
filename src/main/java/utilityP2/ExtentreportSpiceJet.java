package utilityP2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportSpiceJet {
	
	
	public static ExtentReports getreport() {
		ExtentSparkReporter reports = new ExtentSparkReporter("./ExtentReportSpicejet/reportspicejet.html");
		reports.config().setReportName("SpiceJet Report");
		reports.config().setDocumentTitle("Spicejet Test");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reports);
		
		return extent;
	}

}
