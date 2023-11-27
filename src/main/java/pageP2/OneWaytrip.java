package pageP2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;


import baseP2.ProjectSpicejetbaseP2;

public class OneWaytrip extends ProjectSpicejetbaseP2{


	public void oneWaytrip() throws InterruptedException {

		driver.findElement(By.xpath("//div[text()='From']")).click();

		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Mumbai']")).click();
		WebElement returnfield =driver.findElement(By.xpath("//div[text()='Return Date']"));

		boolean Actual=returnfield.isSelected();
		boolean Expected =false;
		Assert.assertEquals(Actual, Expected);
		System.out.println("Field Disabled : User in one way trip page");

		driver.findElement(By.xpath("(//div[text()='9'])[2]")).click();

		driver.findElement(By.xpath("//div[text()='Passengers']")).click(); 
		driver.findElement(By.xpath("(//div[contains(@class,'r-1awozwy')])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'r-1awozwy')])[1]")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-z2')]")).click();

		Thread.sleep(10000);

		String Source=driver.getPageSource();

		if(Source.contains("Bengaluru to Mumbai")) {
			System.out.println("User's Page Visible");
		}else {
			System.out.println("User is on Wrong destiny");
		}

		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w')]")).click();
		Thread.sleep(10000);


		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Vignesh");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("S");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8270420230");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("vignesh@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Kanchipuram");
		driver.findElement(By.xpath("//div[text()='I am flying as the primary passenger']")).click();

		Thread.sleep(3000);
		WebElement continuebutton=driver.findElement(By.xpath("//div[text()='Continue']"));
		Actions act= new Actions(driver);
		act.moveToElement(continuebutton).click().perform();

		Thread.sleep(10000);
		WebElement continuebutton2=driver.findElement(By.xpath("//div[text()='Carry More On-board ']"));

		act.moveToElement(continuebutton2).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[text()='Skip this to skip comfort.'])[1]")).click();

        Thread.sleep(2000);
		WebElement Refclick=driver.findElement(By.xpath("//h3[text()='Enter Debit / Credit Card Details']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(Refclick).perform();
		Thread.sleep(4000);
		WebElement cardnumber=driver.findElement(By.xpath("//iframe[@class='card_number_iframe']"));

		driver.switchTo().frame(cardnumber);

		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("657464846332");

		driver.switchTo().defaultContent();

		WebElement cardholdername=driver.findElement(By.xpath("//iframe[@class='name_on_card_iframe']"));

		driver.switchTo().frame(cardholdername);

		driver.findElement(By.xpath("//input[@id='name_on_card']")).sendKeys("Vignesh S");

		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		WebElement month=driver.findElement(By.xpath("//iframe[@class='card_exp_month_iframe']"));

		driver.switchTo().frame(month);

		driver.findElement(By.xpath("//input[@id='card_exp_month']")).sendKeys("09");

		driver.switchTo().defaultContent();


		WebElement year=driver.findElement(By.xpath("//iframe[@class='card_exp_year_iframe']"));

		driver.switchTo().frame(year);

		driver.findElement(By.xpath("//input[@id='card_exp_year']")).sendKeys("2024");

		driver.switchTo().defaultContent();


		WebElement ccv=driver.findElement(By.xpath("//iframe[@class='security_code_iframe']"));

		driver.switchTo().frame(ccv);

		driver.findElement(By.xpath("//input[@id='security_code']")).sendKeys("321");

		driver.switchTo().defaultContent();
        Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")).click();
		
        WebElement refclick1 =driver.findElement(By.xpath("//span[text()='Terms and Conditions']"));		
		act.moveToElement(refclick1).perform();

        
        Thread.sleep(3000);
		WebElement ProceedtoPay =driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']"));		
			act.moveToElement(ProceedtoPay).click().perform();



		//		driver.findElement(By.xpath("//input[@id='card_exp_month']")).sendKeys("09");
		//		driver.findElement(By.xpath("//input[@id='card_exp_year']")).sendKeys("2024");
		//		driver.findElement(By.xpath("//input[@id='security_code']")).sendKeys("321");
		//		Thread.sleep(5000);
		//		
		//		WebElement Cardnumber =driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']"));
		//
		//		act.moveToElement(Cardnumber).perform();
		//		
		//		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("45678433");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//div[text()='Proceed to pay']")).click();

		Thread.sleep(3000);
		String Source2=driver.getPageSource();

		if(Source2.contains("Please enter a valid card")) {
			System.out.println("Booking :Payment Sucessfull");
		}else {
			System.out.println("Booking :Payment failed");
		}


	}
}
