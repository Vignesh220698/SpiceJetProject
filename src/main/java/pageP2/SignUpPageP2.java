package pageP2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseP2.ProjectSpicejetbaseP2;

public class SignUpPageP2 extends ProjectSpicejetbaseP2{

	public void signupPage() throws InterruptedException {

		Set<String>window=driver.getWindowHandles();
		List<String> list =  new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
     	WebElement drop=driver.findElement(By.xpath("//select[@class='form-control form-select ']"));
        Select opt = new Select(drop);
		opt.selectByVisibleText("Mr");
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys("vignesh");
		Thread.sleep(2000);
		driver.findElement(By.id("last_name")).sendKeys("S");
		
		
		driver.findElement(By.xpath("//input[@id='dobDate']")).sendKeys("22/06/1998");
		
		//WebElement country=driver.findElement(By.xpath("//select[@class='form-control form-select']"));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(country));		
		//act.moveToElement(country).perform();
		//Select con = new Select(country);
		//con.selectByVisibleText("India ");		
//		WebElement calenderfield=driver.findElement(By.xpath("//input[@id='dobDate']"));	
//		act.moveToElement(calenderfield).perform();		
//		Actions act= new Actions(driver);
//		act.moveToElement(calender).click().perform();
		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//img[@alt='date']")).click();
//		WebElement month =driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//		
//		Select Dmon = new Select(month);
//		Dmon.selectByVisibleText("June");
//		
//		WebElement year =driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
//		
//		Select Dyear = new Select(year);
//		Dyear.selectByVisibleText("1998");
//			
//		driver.findElement(By.xpath("//div[text()='22']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8765423451");
		driver.findElement(By.id("email_id")).sendKeys("Vignesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='new-password']")).sendKeys("Vignesh@1234");
		driver.findElement(By.xpath("//input[@id='c-password']")).sendKeys("Vignesh@1234");
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(3000);
	}

}
