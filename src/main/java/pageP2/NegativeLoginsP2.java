package pageP2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseP2.ProjectSpicejetbaseP2;

public class NegativeLoginsP2 extends ProjectSpicejetbaseP2{

	@FindBy(xpath="//div[text()='Email']")
	WebElement Emailradio;

	@FindBy(xpath ="//input[@type='email']")
	WebElement loginusername;

	@FindBy(xpath="//input[@type='password']")
	WebElement loginpassword;


	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement loginbutton1;

	public NegativeLoginsP2(){	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public NegativeLoginsP2 emailradio() {

		click(Emailradio);
		return this;
	}

	public NegativeLoginsP2 emailfield(String user1) {
		sentkey(loginusername ,user1);
		return this;
	}
	public NegativeLoginsP2 passwordfield(String pass1) {
		sentkey(loginpassword ,pass1);
		return this;
	}
	public NegativeLoginsP2 logbutton() throws InterruptedException {
		click(loginbutton1);
		Thread.sleep(5000);	
		String source1=	driver.getPageSource();

		if(source1.contains("Please enter")) {
			System.out.println("Neg test pass");
		}else {
			System.out.println("Neg test fail");
		}
		return this;
	}
}
