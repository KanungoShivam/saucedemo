package com.saucedemo.testcase;

import org.testng.annotations.Test;

import com.saucedemo.pageobject.CheckOutPage;
import com.saucedemo.pageobject.InformationPage;
import com.saucedemo.pageobject.LoginPage;
import com.saucedemo.pageobject.ProductPage;

public class InformationTest extends BaseClass {
	
	@Test
	public void AllTest() {
		driver.get(url);
		logger.info("url is open");
		
		//===========================Login Page
		
		
		LoginPage lp = new LoginPage(driver);
		lp.EnterUserName("standard_user");
		logger.info("username Accepted");
		lp.EnterPassword("secret_sauce");
		logger.info("password is enter");
		lp.ClickOnLoginBtn();
		
		
		//============================Product Page
		
		ProductPage pp = new ProductPage(driver);
		pp.ClickAddToCart();
		pp.ClickToCartStore();
		
		//============================Checkout page
		
		CheckOutPage cop= new CheckOutPage(driver);
		cop.ClickOnCheckOut();
				
		
		//=============================Information Page
				
		InformationPage ip = new InformationPage(driver);
		ip.EnterFirstName("shiv");
		ip.EnterLastName("kalyanee");
		ip.EnterPostalCode("00000");
		ip.ClickOnContinueBtn();
		
	
		}	
}
