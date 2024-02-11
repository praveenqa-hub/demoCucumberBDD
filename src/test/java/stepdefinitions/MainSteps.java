package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is on NetBanking Landing Page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on - Landing page");
	}
	@When("User login into the application")
	public void user_login_into_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user Logged In");
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on - HomePage");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user can view cards");
	}
	
	@Then ("Home Page is populated")
	public void user_home_page() {
		System.out.println("bgHome Page is populated");
	}
}
