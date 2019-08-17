package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddCustomerpage extends FunctionalLibrary {

	public AddCustomerpage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[@for='done']")
	private WebElement radiobutton;
	
   @FindBy(id="fname")
   private WebElement first;
	
   @FindBy(id="lname")
   private WebElement last;
   
   @FindBy(id="email")
   private WebElement mail;
   
   @FindBy(name="addr")
   private WebElement addr;
   
   @FindBy(id="telephoneno")
   private WebElement phno;
      
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sub;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSub() {
		return sub;
	}
}
