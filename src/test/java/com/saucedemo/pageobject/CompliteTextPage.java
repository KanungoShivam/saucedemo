package com.saucedemo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompliteTextPage {

	WebDriver ldriver;
	
	public CompliteTextPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver , this);
	}
	
    @FindBy(xpath="//h2[@class='complete-header']")
    WebElement completetext;
    
    public void SuceesText() {
    	completetext.getText(); 
    	
    }
}

