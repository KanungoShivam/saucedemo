package com.saucedemo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver ldriver;
	
	public ProductPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement AddCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cardbutten;
	
	public void ClickAddToCart() {
		AddCart.click();
	}
	
	public void ClickToCartStore() {
		cardbutten.click();
	}
	

}
