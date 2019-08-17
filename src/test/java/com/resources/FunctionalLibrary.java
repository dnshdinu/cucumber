package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	public  void launch(String url) {
		System.setProperty("webdriver.chrome.driver","F:\\New folder (3)\\sample1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}

	public void type(WebElement ele,String name) {
			ele.sendKeys(name);
		
	}
  public void button(WebElement ele) {
	  ele.click();
	  
}	
	
}
