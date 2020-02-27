package org.StepOfBook;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.LocatorsRepo.FlightSelection;
import org.LocatorsRepo.SearchPage;
import org.LocatorsRepo.SearchPage1;
import org.Meth.Base;
import org.hamcrest.core.IsSame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.en.*;

public class BookAFlight extends Base {

	@Given("user should be in Home page")
	public void user_should_be_in_Home_page() {
		browserLaunch();
		lauchUrl("https://www.blueairweb.com/en/gb/Book-a-flight/");

	}

	@Given("navigate to book a login page {string}, {string}")
	public void navigate_to_book_a_login_page(String string, String string2) {
		SearchPage s = new SearchPage();
		click(s.getPri().get(0));
		click(s.getCook().get(0));
		click(s.getLg().get(0));
		send(s.getUsername().get(0), string);
		send(s.getPass().get(0), string2);
		boolean as = asse(s.getPass().get(0));
		System.out.println("asse--------------" + as);
		click(s.getLogin().get(0));

	}

	@When("providing journey deails")
	public void providing_journey_deails() throws InterruptedException, AWTException {
		SearchPage1 s = new SearchPage1();
		// click(s.getSrcD().get(0));
		js(s.getSrcD().get(0));
		Thread.sleep(5000);
		click(s.getRom().get(0));
		click(s.getBuc().get(0));
		// Thread.sleep(5000);
		js(s.getSrcda().get(0));
		click(s.getFr().get(0));
		js(s.getZuc().get(0));
		boolean ena = isDis(s.getRdate().get(0));
		System.out.println("check------------------" + ena);
		js(s.getOne().get(0));
		boolean ena1 = isDis(s.getRdate().get(0));
		System.out.println("check------------------" + ena1);
		// Thread.sleep(5000);
		js(s.getDd().get(0));
		scroll(4);
		click(s.getDate().get(0));
		scroll(-3);
		click(s.getPasenpger().get(0));
		scroll(4);
		click(s.getAd().get(0));
		click(s.getCh().get(0));
		click(s.getIn().get(0));
		click(s.getYo().get(0));
		click(s.getApp().get(0));
	}

	@When("click Book Now")
	public void click_Book_Now() {
		SearchPage1 s = new SearchPage1();
		click(s.getBbb().get(0));
	}

	@Then("Naviate to Flight Selectio Page")
	public void naviate_to_Flight_Selectio_Page() {
		SearchPage s = new SearchPage();
		click(s.getCook().get(0));
		System.out.println("success in search page");
	}

	@Given("user should see available flight")
	public void user_should_see_available_flight() {
		FlightSelection f = new FlightSelection();
		String s = gettext(f.getNum().get(0));
		System.out.println(s);
	}

	@When("should select flight and types")
	public void should_select_flight_and_types() throws InterruptedException {
		FlightSelection f = new FlightSelection();
		Thread.sleep(5000);
		boolean isse = issel(f.getFs().get(0));
		System.out.println("select----------------" + isse);
		click(f.getFs().get(0));
		Thread.sleep(2000);
		// boolean isl = issel(f.getSelect().get(0));
		// System.out.println("select----------------" + isl);
	}

	@When("continue the booking")
	public void continue_the_booking() throws InterruptedException {
		FlightSelection f = new FlightSelection();
		boolean isl = issel(f.getCont().get(0));
		System.out.println("select----------------" + isl);
		Thread.sleep(5000);
		click(f.getCont().get(0));
		//FluentWait<WebElement> w=new FluentWait<WebElement>(f.getCont().get(0)).pollingEvery(60, TimeUnit.NANOSECONDS).ignoring(Exception.class);
		boolean is = issel(f.getCont().get(0));
		System.out.println("select----------------" + is);
	}

	@Then("redirect to Extras page")
	public void redirect_to_Extras_page() throws InterruptedException {
		
		System.out.println("success in flight booking page");
	}

}
