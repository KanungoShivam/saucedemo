package com.saucedemo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {

	WebDriver driver;
	public InformationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement postalcode;
	
	@FindBy(id="continue")
	WebElement contine;
	
	public void EnterFirstName(String Firstname) {
		firstname.sendKeys(Firstname);
	}
	
	public void EnterLastName(String LastName){
		lastname.sendKeys(LastName);
	}
	
	public void EnterPostalCode(String Postalcode) {
		postalcode.sendKeys(Postalcode);
	}
	
	public void ClickOnContinueBtn() {
		contine.click();
	}
	
}
