package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is on NetBanking Landing Page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on - Landing page");
	}
	@When("User login with username {string} and password {string} into the application")
	public void user_login_into_the_application(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user Logged In with username : "+username+" password : "+password);
	}
	
	@When("^User login with username (.+) and password (.+) into the application combination$")
	public void user_login_application(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user Logged In with username : "+username+" password : "+password);
	}
	
	@When("User login")
	public void user_login(List<String> demo) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user Logged In with username : "+demo.get(0)+" password : "+demo.get(1));
		System.out.println("user Logged In with username : "+demo.get(2)+" password : "+demo.get(3));
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
	
	@Given ("setup entries in the database")
	public void dbSetup() {
		System.out.println("db entries setup");
	}
	@When ("launched browser with config")
	public void launchBrow(){
		System.out.println("launched browser with config");
	}
	@When ("hit the homepage url of bank website")
	public void navhomePage() {
		System.out.println("home page of bank");
	}
}
