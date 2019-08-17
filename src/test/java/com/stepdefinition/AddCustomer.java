package com.stepdefinition;

import com.objectrepository.AddCustomerpage;
import com.objectrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.When;

public class AddCustomer extends FunctionalLibrary{
	
	
	@When("enter the customer details")
	public void enter_the_customer_details() throws InterruptedException {
		Thread.sleep(1000);
      HomePage page=new HomePage();	
      AddCustomerpage page1=new AddCustomerpage();
	button(page.getAddcustomer());
	button(page1.getRadiobutton());
	type(page1.getFirst(),"dinesh");
	type(page1.getLast(),"kumar");
	type(page1.getMail(),"dinutalk@gmail.com");
	type(page1.getAddr(),"karur");
	type(page1.getPhno(),"8825524233");
	}

	@When("click submit button")
	public void click_submit_button() {
		AddCustomerpage page2=new AddCustomerpage();
		button(page2.getSub());
	    
	}

}
