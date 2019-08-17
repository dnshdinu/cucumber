package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tariff3 {
	static WebDriver driver;
	@Given("user is in demoguru page")
	public void user_is_in_demoguru_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (3)\\sample1\\driver\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("click add tariff details")
	public void click_add_tariff_details() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

	}

	@When("fill the required tariff plan{string},{string},{string},{string},{string},{string},{string}")
	public void fill_the_required_tariff_plan(String f, String g, String h, String i, String j, String k, String l) {
		driver.findElement(By.id("rental1")).sendKeys(f);
		driver.findElement(By.id("local_minutes")).sendKeys(g);
		driver.findElement(By.id("inter_minutes")).sendKeys(h);
		driver.findElement(By.id("sms_pack")).sendKeys(i);
		driver.findElement(By.id("minutes_charges")).sendKeys(j);
		driver.findElement(By.id("inter_charges")).sendKeys(k);
		driver.findElement(By.id("sms_charges")).sendKeys(l);
	}

	@When("click submit form to next page")
	public void click_submit_form_to_next_page() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();    
	}

	@Then("tariff paln is successfully entered")
	public void tariff_paln_is_successfully_entered() {
	    System.out.println("Completed Successfully");
	    driver.quit();

	}


}
