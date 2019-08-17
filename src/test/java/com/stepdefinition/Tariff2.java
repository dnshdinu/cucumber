package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Tariff2 {
	static WebDriver driver;
	@Given("user is in demoguru site")
	public void user_is_in_demoguru_site() {
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (3)\\sample1\\driver\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("click add tariff detail")
	public void click_add_tariff_detail() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

	}

	@When("fill the required tariff plan")
	public void fill_the_required_tariff_plan(DataTable Dt) {
		List<Map<String, String>> m = Dt.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(m.get(0).get("Mr"));
		driver.findElement(By.id("local_minutes")).sendKeys(m.get(1).get("Flm"));
		driver.findElement(By.id("inter_minutes")).sendKeys(m.get(0).get("Fim"));
		driver.findElement(By.id("sms_pack")).sendKeys(m.get(2).get("Fsp"));
		driver.findElement(By.id("minutes_charges")).sendKeys(m.get(2).get("Lfm"));
		driver.findElement(By.id("inter_charges")).sendKeys(m.get(1).get("Imc"));
		driver.findElement(By.id("sms_charges")).sendKeys(m.get(0).get("Sm"));

	}

	@When("click submit form to next step")
	public void click_submit_form_to_next_step() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("tariff paln is successfully done")
	public void tariff_paln_is_successfully_done() {
		System.out.println("completed successfully");
		driver.quit();
	
	}

}
