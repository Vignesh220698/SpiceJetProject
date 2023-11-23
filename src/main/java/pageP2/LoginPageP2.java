package pageP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseP2.ProjectSpicejetbaseP2;



public class LoginPageP2 extends ProjectSpicejetbaseP2 {


		@FindBy(xpath="//div[text()='Email']")
		WebElement Emailradio;
		
		@FindBy(xpath ="//input[@type='email']")
		WebElement loginusername;
		
		@FindBy(xpath="//input[@type='password']")
		WebElement loginpassword;
		
		
		@FindBy(xpath = "//div[text()='LOGIN']")
		WebElement loginbutton;

	
	public  LoginPageP2() {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public LoginPageP2 Emailradiobutton() {
		click(Emailradio);	
		//driver.findElement(By.xpath("//div[text()='Email']")).click();
			return this;
		}
		public LoginPageP2 loginusername(String username) {
			sentkey(loginusername ,username);
			return this;
		}
		
		public LoginPageP2 loginpassword(String password) {
			sentkey(loginpassword,password);
			return this;
		}

		
		public LoginPageP2 loginbuttonSpice() {
			click(loginbutton);	
			//driver.findElement(By.xpath("//div[text()='Email']")).click();
				return this;
			}
//	public void Loginpage() throws InterruptedException {
//		driver.findElement(By.xpath("//div[text()='Email']")).click();
//		//driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("8270420230");		
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Vignesh@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vignesh@123");
//		Thread.sleep(2000);
//	}

}
