package pageP2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import baseP2.ProjectSpicejetbaseP2;

public class InvalidOnewayTripPageP2 extends ProjectSpicejetbaseP2{
	
	
	public void invalidoneway() throws InterruptedException {
		
		WebElement returnfield =driver.findElement(By.xpath("//div[text()='Return Date']"));

		boolean Actual=returnfield.isSelected();
		boolean Expected =false;
		Assert.assertEquals(Actual, Expected);
		System.out.println("Field Disabled : User in one way trip page");

		
		driver.findElement(By.xpath("//div[text()='From']")).click();

		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		Thread.sleep(2000);
		
		WebElement refclick=driver.findElement(By.xpath("//div[text()='Welcome aboard']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(refclick).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-z2')]")).click();
		
		Thread.sleep(1000);
		
		
		String source=driver.getPageSource();
		
		if(source.contains("empty")) {
			System.out.println("Negative Test pass");
		}else {
			System.out.println("Negative Test fail");
		}

	}

}
