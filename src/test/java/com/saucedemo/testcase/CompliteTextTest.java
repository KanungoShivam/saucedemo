package com.saucedemo.testcase;

import java.io.IOException;


import org.testng.annotations.Test;

import com.saucedemo.pageobject.CheckOutPage;
import com.saucedemo.pageobject.CompliteTextPage;
import com.saucedemo.pageobject.InformationPage;
import com.saucedemo.pageobject.LoginPage;
import com.saucedemo.pageobject.OverviewPage;
import com.saucedemo.pageobject.ProductPage;

public class CompliteTextTest extends BaseClass {
	
	@Test
	public void AllTest() throws IOException, InterruptedException {
		driver.get(url);
		logger.info("url is open");
		
		driver.manage().window().maximize();
		
		//===========================Login Page
		
		
		LoginPage lp = new LoginPage(driver);
		lp.EnterUserName("standard_user");
		logger.info("username Accepted");
		lp.EnterPassword("secret_sauce");
		logger.info("password is enter");
		lp.ClickOnLoginBtn();
		
		
		Thread.sleep(5000);
		
		//============================Product Page
		
		ProductPage pp = new ProductPage(driver);
		pp.ClickAddToCart();
		pp.ClickToCartStore();
		
		Thread.sleep(5000);
		//============================Checkout page
		
		CheckOutPage cop= new CheckOutPage(driver);
		cop.ClickOnCheckOut();
		
		
		
		Thread.sleep(5000);
		
		//=============================Information Page
				
		InformationPage ip = new InformationPage(driver);
		ip.EnterFirstName("shiv");
		ip.EnterLastName("kalyanee");
		ip.EnterPostalCode("00000");
		ip.ClickOnContinueBtn();
		
		Thread.sleep(5000);
		//===============================owerview Page
		
		OverviewPage ov = new OverviewPage(driver);
		ov.ClickOnFinshBtn();
	
		//==============================Complete sucess page
		
		CompliteTextPage ctp = new CompliteTextPage(driver);
	ctp.SuceesText();
			
		Thread.sleep(5000);
		
		}	
}

	