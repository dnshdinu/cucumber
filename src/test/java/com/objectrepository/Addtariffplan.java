package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class Addtariffplan extends FunctionalLibrary {

	public Addtariffplan() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="rental1")
	private WebElement rent;

	@FindBy(id="local_minutes")
	private WebElement local;
	
	@FindBy(id="inter_minutes")
	private WebElement inter;
	
	
	@FindBy(name="sms_pack")
	private WebElement smsp;
	
	@FindBy(id="minutes_charges")
	private WebElement min;
	
	@FindBy(id="inter_charges")
	private WebElement interc;
	
	@FindBy(id="sms_charges")
	private WebElement smsc;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

	public WebElement getRent() {
		return rent;
	}

	public WebElement getLocal() {
		return local;
	}

	public WebElement getInter() {
		return inter;
	}

	public WebElement getSmsp() {
		return smsp;
	}

	public WebElement getMin() {
		return min;
	}

	public WebElement getInterc() {
		return interc;
	}

	public WebElement getSmsc() {
		return smsc;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
}
