package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Customer1 {
	
	static WebDriver driver;
	@Given("user is in demoguru website")
	public void user_is_in_demoguru_website() {
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (3)\\sample1\\driver\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("click add customer to give details")
	public void click_add_customer_to_give_details() {
		  driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("fill the required field")
	public void fill_the_required_field(DataTable D) {
		List<List<String>> c = D.asLists(String.class);
		 driver.findElement(By.xpath("//label[@for='done']")).click();
	     driver.findElement(By.id("fname")).sendKeys(c.get(0).get(0));	
	     driver.findElement(By.id("lname")).sendKeys(c.get(0).get(1));	
	     driver.findElement(By.id("email")).sendKeys(c.get(1).get(2));
	     driver.findElement(By.name("addr")).sendKeys(c.get(1).get(3));
	     driver.findElement(By.id("telephoneno")).sendKeys(c.get(2).get(4));
	}

	@When("click submit the form")
	public void click_submit_the_form() {
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("ID is generated or not")
	public void id_is_generated_or_not() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		System.out.println("ID generated successfully");
		driver.quit();
	}


}
