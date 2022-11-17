package com.saucedemo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement login;
	
	public void EnterUserName(String Name) {
		username.sendKeys(Name);
	}
	
	 public void EnterPassword(String Password) {
		 password.sendKeys(Password);
	 }
	 
	 public void ClickOnLoginBtn() {
		 login.click();
	 }
}
