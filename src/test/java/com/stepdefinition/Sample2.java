package com.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Sample2 {
 static WebDriver driver;
	@Given("user is in telecom web page")
	public void user_is_in_telecom_web_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (3)\\sample1\\driver\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/telecom/index.html");  
	}

	@Given("click add customer")
	public void click_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();  
	}

	@When("fill the form")
	public void fill_the_form(DataTable d) {
		Map<String, String> details = d.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
	     driver.findElement(By.id("fname")).sendKeys(details.get("firstname"));	
	     driver.findElement(By.id("lname")).sendKeys(details.get("lastname"));	
	     driver.findElement(By.id("email")).sendKeys(details.get("email"));
	     driver.findElement(By.name("addr")).sendKeys(details.get("addr"));
	     driver.findElement(By.id("telephoneno")).sendKeys(details.get("phno"));
		}
	@When("click submit")
	public void click_submit() {
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
}


	@Then("id get generated")
	public void id_get_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		System.out.println("ID generated successfully");
		driver.quit();
	   
	}

	
	
}
