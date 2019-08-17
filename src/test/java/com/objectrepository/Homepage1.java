package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class Homepage1 extends FunctionalLibrary {

	public Homepage1() {
	PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement addtariff;
	public WebElement getAddtariff() {
		return addtariff;
	}
	
}
