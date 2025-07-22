package com.omrbranch.stepdefinition;
import io.cucumber.java.en.*;

public class TC002_SearchHotelsStep {
	
	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	
	}
	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String string) {


	}

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String string, String string2, String string3, String string4, String string5, String string6) {
	 
	}
	
	@Then("User click Search button")
	public void userClickSearchButton() {


	}
	@Then("User should verify after search hotel error message {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageAnd(String string, String string2, String string3, String string4, String string5, String string6) {


	}






}
