package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login page");
	}

	@When("^user enters username and passord$")
	public void user_enters_username_and_passord() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter credentials");
	}

	@And("^click on login button$")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on the button");
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate to home page");
	}
}
