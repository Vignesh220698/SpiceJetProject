package pageP2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseP2.ProjectSpicejetbaseP2;

public class InvalidSignupPageP2 extends ProjectSpicejetbaseP2 {



	public void invalidsignup() throws InterruptedException {

		Set<String>window=driver.getWindowHandles();
		List<String> list =  new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		WebElement drop=driver.findElement(By.xpath("//select[@class='form-control form-select ']"));
		Select opt = new Select(drop);
		opt.selectByVisibleText("Mr");

//		driver.findElement(By.id("first_name")).sendKeys(" ");
//		Thread.sleep(2000);
//		driver.findElement(By.id("last_name")).sendKeys(" ");
//
//		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8765423451");
//		driver.findElement(By.id("email_id")).sendKeys(" ");
//		driver.findElement(By.xpath("//input[@id='new-password']")).sendKeys(" ");
//		driver.findElement(By.xpath("//input[@id='c-password']")).sendKeys(" ");
//		
////		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
////		WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
////		submit.click();
//
	    WebElement Submit=	driver.findElement(By.xpath("//button[text()='Submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Submit);
		
//
////			WebElement Submit=	driver.findElement(By.xpath("//button[text()='Submit']"));	
////			Actions act = new Actions(driver);
////			act.moveToElement(Submit).click().perform();
       //  driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(10000);
		String source=driver.getPageSource();

		if(source.contains("Please fill all mandatory fields marked with an '*' to proceed")) {
			System.out.println("Negative Testing pass");
		}else {
			System.out.println("Negative Testing fail");
		}
	}

}
