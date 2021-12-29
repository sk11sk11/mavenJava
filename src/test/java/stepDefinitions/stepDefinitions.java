package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class stepDefinitions {

	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("Landed on Netbanking page");
		// throw new io.cucumber.java.PendingException();
	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("homepage is populated")
	public void homepage_is_populated() {
		System.out.println("Landed on homepage");
		// throw new io.cucumber.java.PendingException();
	}

	@And("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

}
