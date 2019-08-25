package com.cucumber.steps;

import org.openqa.selenium.By;


import com.cucumber.pages.Base;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends Base{
	
	Base obj = new Base();
	
	@Given("^I open \"([^\"]*)\"$")
	public void i_open(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.instance();
		
	//    throw new PendingException();
	}

	@And("^I enter valid \"([^\"]*)\" to invoke application$")
	public void i_enter_valid_to_invoke_application(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		obj.instance().get(arg1);
	    // throw new PendingException();
	}

	@Then("^I verify i am on login page$")
	public void i_verify_i_am_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	//	Assert.assertEquals(obj.instance().getTitle(), "http://yp1007034lt/yash-test/");
	}

	@When("^I enter valid \"([^\"]*)\" username$")
	public void i_enter_valid_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.instance().findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(arg1);
	}

	@When("^I enter valid \"([^\"]*)\" password$")
	public void i_enter_valid_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.instance().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arg1);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.instance().findElement(By.xpath("//a[@class='btn btn-success']")).click();
	}

	@Then("^I verify landing page is adduser page$")
	public void i_verify_landing_page_is_adduser_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(obj.instance().getTitle()+"--"+obj.instance().getCurrentUrl());
	   
	}
	
	@When("^I click on adduser link$")
	public void i_click_on_adduser_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.instance().findElement(By.xpath("//ul[@class='quick-actions']/li[2]/a/i")).click();
		
		obj.instance().findElement(By.xpath("//input[@id='required']")).sendKeys("naveen");
		Thread.sleep(5000);
		obj.instance().quit();
	    
	}


}
