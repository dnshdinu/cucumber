package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Customer {

	static WebDriver driver;
	@Given("user is in demoguru web page")
	public void user_is_in_demoguru_web_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (3)\\sample1\\driver\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/telecom/index.html");
	}
	@Given("click add customer details")
	public void click_add_customer_details() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();	    
	}

	@When("fill the required field{string},{string},{string},{string},{string}")
	public void fill_the_required_field(String a, String b, String c, String d, String e) {
		 driver.findElement(By.xpath("//label[@for='done']")).click();
	     driver.findElement(By.id("fname")).sendKeys(a);	
	     driver.findElement(By.id("lname")).sendKeys(b);	
	     driver.findElement(By.id("email")).sendKeys(c);
	     driver.findElement(By.name("addr")).sendKeys(d);
	     driver.findElement(By.id("telephoneno")).sendKeys(e);
		
	}

	@When("click submit form to proceed")
	public void click_submit_form_to_proceed() {
		   driver.findElement(By.xpath("//input[@type='submit']")).click();   
	}

	@Then("ID get generated or not")
	public void id_get_generated_or_not() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		System.out.println("ID generated successfully");
		driver.quit();
	}

	
	
}
