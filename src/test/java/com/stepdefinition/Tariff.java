package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Tariff {
	
	
	static WebDriver driver;
	@Given("user need to open telecom webpage")
	public void user_need_to_open_telecom_webpage() {
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (3)\\sample1\\driver\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("click add tariff plan")
	public void click_add_tariff_plan() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		
	
	}

	@When("user need to fill the tariff plan")
	public void user_need_to_fill_the_tariff_plan(DataTable plan) {
		
		List<String> tp = plan.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(tp.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(tp.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(tp.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(tp.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(tp.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(tp.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(tp.get(6));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user gets the message")
	public void user_gets_the_message() {
		System.out.println("completed successfully");
		driver.quit();
	
		
 }
}