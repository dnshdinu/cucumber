package com.stepdefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Tariff1 {
	
	static WebDriver driver;
	@Given("user is in telecom page")
	public void user_is_in_telecom_page() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (3)\\sample1\\driver\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/telecom/index.html");
	   
	}

	@Given("click add tariff")
	public void click_add_tariff() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

	   
	}

	@When("fill the tariff plan")
	public void fill_the_tariff_plan(DataTable dt) {
	    
		Map<String, String> details = dt.asMap(String.class, String.class);
	     driver.findElement(By.id("rental1")).sendKeys(details.get("Monthly Rental"));	
	     driver.findElement(By.id("local_minutes")).sendKeys(details.get("Free Local Minutes"));	
	     driver.findElement(By.id("inter_minutes")).sendKeys(details.get("Free International Minutes"));
	     driver.findElement(By.name("sms_pack")).sendKeys(details.get("Free SMS Pack"));
	     driver.findElement(By.id("minutes_charges")).sendKeys(details.get("Local Per Minutes Charges"));
	     driver.findElement(By.id("inter_charges")).sendKeys(details.get("International Per Minutes Charges"));
	     driver.findElement(By.id("sms_charges")).sendKeys(details.get("SMS Per Charges"));

	}
	@When("click submit form")
	public void click_submit_form() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}


	@Then("completed successfully")
	public void completed_successfully() {
	    System.out.println("Completed Successfully");
	}

	
}
