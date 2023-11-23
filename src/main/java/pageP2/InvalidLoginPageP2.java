package pageP2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseP2.ProjectSpicejetbaseP2;

public class InvalidLoginPageP2 extends ProjectSpicejetbaseP2{
	
	public void invalidlog() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[text()='Email']")).click();
		
		
		
//		WebElement submit=driver.findElement(By.xpath("//div[contains(@class,'css-76zvg2 r-jwli3a r-2t')]"));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	    wait.until(ExpectedConditions.elementToBeClickable(submit));
//        submit.click();
		
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		String source=driver.getPageSource();
		if(source.contains("Please enter a valid email address")) {
			System.out.println("Negative Login Testing pass");
		}else {
			System.out.println("Negative Login Testing fail");
		}
	}
}



