package utilityP2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityP2 {
	
	public static WebDriver driver;
	
	public String Excelfile;

	public void launchbrowser(String url ,String browser) {


		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver(option);
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);


	}
	public void closebrowserpage() {
		driver.close();
		driver.quit();
	}
	
	public Object[][] ReadExcel(String Excelfile) throws IOException {

		XSSFWorkbook book= new XSSFWorkbook("C:\\Users\\VIJAYAKUMAR P\\eclipse-workspace\\ProjectSpiceJet\\SpicejetExcel.xlsx");
		XSSFSheet sheet = book.getSheet(Excelfile);

		int rowcount= sheet.getLastRowNum();

		int colcount = sheet.getRow(0).getLastCellNum();


		Object[][] data= new Object[rowcount][colcount];


		for(int i=1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);

			for(int j=0;j<colcount;j++) {
				XSSFCell cell= row.getCell(j);


				data[i-1][j] = cell.getStringCellValue();
				System.out.println(cell.getStringCellValue());
			}        	
		}
		book.close();
		return data;       
	}
	public void click(WebElement element) {
		element.click();
	}

	public void sentkey(WebElement element, String value) {
		element.sendKeys(value);
	}
	
        public String  getScreenShotP2(String testmethodname) throws IOException {
		
		TakesScreenshot Screenshot = ((TakesScreenshot)driver);
		String path="./ScreenShotSpicejet"+ testmethodname+".png";
		File source=Screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);
		return path;
		
	}
	
	
}
