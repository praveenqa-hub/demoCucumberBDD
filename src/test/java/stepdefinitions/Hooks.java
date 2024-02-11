package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before 
	public void welcome() {
		System.out.println("This is zbank welcome");
	}
	@Before ("@NetBanking")
	public void netBankingSetup() {
		System.out.println("netbanking setup");
	}
	
	@Before ("@Mortgage")
	public void mortgageSetup() {
		System.out.println("mortgage setup");
	}
	@After
	public void tearDown() {
		System.out.println("tear down");
	}
}
