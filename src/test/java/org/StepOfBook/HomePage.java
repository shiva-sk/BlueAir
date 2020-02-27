package org.StepOfBook;

import org.LocatorsRepo.HomeFlight;
import org.LocatorsRepo.SearchPage;
import org.Meth.Base;

import io.cucumber.java.en.*;

public class HomePage extends Base {
	@Given("user has to be in homepage")
	public void user_has_to_be_in_homepage() {
		browserLaunch();
		lauchUrl("https://www.blueairweb.com/en/gb/");
	}

	@When("providing login credentials {string} and {string}")
	public void providing_login_credentials_and(String string, String string2) {
		SearchPage s = new SearchPage();
		HomeFlight h = new HomeFlight();
		click(s.getPri().get(0));
		click(h.getCook().get(0));
		click(s.getLg().get(0));
		send(s.getUsername().get(0), string);
		send(s.getPass().get(0), string2);

	}

	@When("click login button")
	public void click_login_button() {
		SearchPage s = new SearchPage();
		click(s.getLogin().get(0));
	}

	@Then("move to search homepage")
	public void move_to_search_homepage() {
		System.out.println("login success");
	}

	@Given("user hase to be in homepage")
	public void user_hase_to_be_in_homepage() {
		System.out.println("----------------------------success");
	}

	@When("enter from and to")
	public void enter_from_and_to() {

	}

	@When("trip type")
	public void trip_type() {

	}

	@When("Date")
	public void date() {

	}

	@When("passenger")
	public void passenger() {

	}

	@Then("click continue")
	public void click_continue() {

	}

	@Given("user hase to be in flight search page")
	public void user_hase_to_be_in_flight_search_page() {

	}

	@When("choose travel options")
	public void choose_travel_options() {

	}

}
