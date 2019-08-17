package com.stepdefinition;

import com.objectrepository.Homepage1;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.When;

public class Addtariffplan extends FunctionalLibrary{

	
	@When("Enter the tariff plan")
	public void enter_the_tariff_plan() {
	    Homepage1 page3=new Homepage1();
	    com.objectrepository.Addtariffplan page4=new com.objectrepository.Addtariffplan();
	    button(page3.getAddtariff());
	    type(page4.getRent(),"1000");
	    type(page4.getLocal(),"600");
	    type(page4.getInter(),"500");
	    type(page4.getSmsp(),"100");
	    type(page4.getMin(),"1");
	    type(page4.getInterc(),"3");
	    type(page4.getSmsc(),"1");
	    
	    
	}

	@When("click submit button.")
	public void click_submit_button() {
	   
		com.objectrepository.Addtariffplan page5=new com.objectrepository.Addtariffplan();
		button(page5.getSubmit());
	}

	
	
}
