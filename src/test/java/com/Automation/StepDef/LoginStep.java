package com.Automation.StepDef;

import com.Automation.Generic.Utils.DriverUtils;
import com.Automation.Generic.Utils.PropertyReader;
import com.Automation.Pages.Search_Page;
import com.Automation.Pages.SigmaLogin_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	SigmaLogin_Page Login= new SigmaLogin_Page();
	
	@Given("Open the browser")
	public void open_the_browser() {
	   DriverUtils.getDriver().get("https://examples.testsigma.com/");
	}

	@When("Enter valid Username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
	   
		Login.ClickLogin();
		 Login.enterUsername(PropertyReader.getProperty("Username"));
		    Login.enterPassword(PropertyReader.getProperty("Password"));
		    Login.clickbtnLogin();
	}

	@Then("execute sucessfully")
	public void execute_sucessfully() {
	    
	}

///////////////////////// SEARCH FOR FLIGHT////////////////
	Search_Page sp= new Search_Page(); 
	
	
	@When("User click on go travel")
	public void user_click_on_go_travel() {
	  sp.GO_click();
	}

	@When("click on fromcity and tocity")
	public void click_on_fromcity_and_tocity() {
	 sp.fromclick();
	 sp.cityclick();
	 sp.toclick();
	 sp. arrivalcity();
	}

	@When("click on date")
	public void click_on_date() {
	   sp.clickdate();
	   sp.dateclick();
	   sp.ok();
	}

	@When("click on passanger and search flight")
	public void click_on_passanger_and_search_flight() {
	sp.passangers();
	sp.done();
	sp.searchclick();
	}

	@Then("User click on book tickets")
	public void user_click_on_book_tickets() {
	sp. BOOKCLICK();
	}
}

