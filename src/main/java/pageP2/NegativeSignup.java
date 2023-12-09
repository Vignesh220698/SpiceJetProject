package pageP2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseP2.ProjectSpicejetbaseP2;

public class NegativeSignup extends ProjectSpicejetbaseP2{




	@FindBy(xpath="//input[@id='first_name']")
	WebElement Firstname;

	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;

	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateofbirth;

	@FindBy(xpath="//input[@class=' form-control']")
	WebElement mobile;

	@FindBy(xpath="//input[@id='email_id']")
	WebElement Nemail;

	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;

	@FindBy(xpath="//input[@id='c-password']")
	WebElement cpassword;

	@FindBy(xpath="//label[text()='I agree to the']")
	WebElement checkbox;

	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	public NegativeSignup() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public NegativeSignup NegSignup() {
		Set<String>window=driver.getWindowHandles();
		List<String> list =  new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		WebElement drop=driver.findElement(By.xpath("//select[@class='form-control form-select ']"));
		Select opt = new Select(drop);
		opt.selectByVisibleText("Mr");
		return this;
	}
	public NegativeSignup firstname(String fname) {

		sentkey(Firstname,fname);
		return this;
	}

	public NegativeSignup lastname(String lname) {
		sentkey(lastname,lname);
		return this;
	}
	public NegativeSignup date(String dob) {
		sentkey(dateofbirth,dob);
		return this;
	}
	public NegativeSignup mobile(String mob) {
		sentkey(mobile,mob);
		return this;
	}
	public NegativeSignup email(String email) {
		sentkey(Nemail,email);
		return this;
	}
	public NegativeSignup pass(String pass) {
		sentkey(password,pass);
		return this;
	}
	public NegativeSignup cpass(String conpass) {
		sentkey(cpassword,conpass);
		return this;
	}
	public NegativeSignup checkbox() throws InterruptedException {
		Thread.sleep(3000);
		
		Actions bulid = new Actions(driver);
		bulid.moveToElement(checkbox).click();
	//	click(checkbox);
		return this;
	}
	public NegativeSignup submitbutton() throws InterruptedException {
		Actions bulid = new Actions(driver);
		bulid.moveToElement(submit).click();
		Thread.sleep(3000);
		String source=driver.getPageSource();
		
		if(source.contains("Please enter")) {
			System.out.println("Negative SignupTest Pass");
		}else {
			System.out.println("Negative SignupTest Fail");
		}
		//click(submit);
		return this;
	}
}
