package pageP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseP2.ProjectSpicejetbaseP2;

public class HomepageP2 extends ProjectSpicejetbaseP2{



	public HomepageP2(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	public SignUpPageP2 signupbutton() {
		driver.findElement(By.xpath("//div[text()='Signup']")).click();

		return new SignUpPageP2();
	}


	public LoginPageP2 loginbutton() {
		driver.findElement(By.xpath(" //div[text()='Login']")).click();
		return new LoginPageP2();

	}
	public OneWaytrip flightbutton() {
		driver.findElement(By.xpath("//div[text()='Flights']")).click();
		return new OneWaytrip();

	}

	public RoundtTrip flightbutton1() {
		driver.findElement(By.xpath("//div[text()='Flights']")).click();
		return new RoundtTrip();

	}

	public InvalidSignupPageP2 signupbuttoninvalid() {
		driver.findElement(By.xpath("//div[text()='Signup']")).click();
		return new InvalidSignupPageP2();

	}

	public InvalidLoginPageP2 Logininvalid() {
		driver.findElement(By.xpath(" //div[text()='Login']")).click();

		return new InvalidLoginPageP2();
	}
	public InvalidOnewayTripPageP2 onewayinvalid() {
		driver.findElement(By.xpath("//div[text()='Flights']")).click();

		return new InvalidOnewayTripPageP2();
	}
	public InvalidRoundwayTripPageP2 RoundTripinvalid() {
		driver.findElement(By.xpath("//div[text()='Flights']")).click();

		return new InvalidRoundwayTripPageP2();
	}
	
	
	public ChekinStatusP2 checkstatus() {
		driver.findElement(By.xpath("//div[text()='check-in']")).click();
		return new ChekinStatusP2();
	}
	
	public  FlightStatusP2 FlightStatus() {
		driver.findElement(By.xpath("//div[text()='flight status']")).click();
		return new FlightStatusP2();
	}
	
	
	public ManageBookingP2 Managebooking() {
		driver.findElement(By.xpath("//div[text()='manage booking']")).click();
		return new ManageBookingP2();
	}
	public NegativeLoginsP2 Neglogin() {
		driver.findElement(By.xpath(" //div[text()='Login']")).click();
		return new NegativeLoginsP2();
	}
}
