package stepdefination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import common.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestSteps{
	
	WebDriver driver;
	String exp_title = "LMS | Leave Management System- Home";
	private BaseClass base;
	public TestSteps(BaseClass base) {
		this.base=base;
	}
	
	@Before
	public void setup()
	{
	base.setDriver();
	driver = base.getDriver();
	}

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://lms.ey.net/");
		System.out.println("You are in Home Page");
		
	}

	@Then("Login is succesful")
	public void login_is_succesful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Successful search page");
		System.out.println(exp_title);
		String curr_title = driver.getTitle();
		System.out.println(curr_title);
		
		assertEquals(exp_title, curr_title);
	}
}