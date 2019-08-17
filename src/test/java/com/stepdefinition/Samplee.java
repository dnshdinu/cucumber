package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Samplee {
	
    static WebDriver driver;
	@Given("user need to open telecom web page")
	public void user_need_to_open_telecom_web_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (3)\\sample1\\driver\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/telecom/index.html");  
	}

	@Given("click add customer to fill form")
	public void click_add_customer_to_fill_form() {
	  driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	     
	}

	@When("user is filling the application form")
	public void user_is_filling_the_application_form() {
	 driver.findElement(By.xpath("//label[@for='done']")).click();
     driver.findElement(By.id("fname")).sendKeys("Dinesh");	
     driver.findElement(By.id("lname")).sendKeys("kumar");	
     driver.findElement(By.id("email")).sendKeys("dinutalk@gmail.com");
     driver.findElement(By.name("addr")).sendKeys("karur");
     driver.findElement(By.id("telephoneno")).sendKeys("8825524233");
	}

	@When("click submit button to open next window")
	public void click_submit_button_to_open_next_window() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should see the customer id is generated or not")
	public void user_should_see_the_customer_id_is_generated_or_not() {
	   
		
		
	}
	
}
