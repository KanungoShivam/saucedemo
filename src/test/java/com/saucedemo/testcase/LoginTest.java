package com.saucedemo.testcase;

import org.testng.annotations.Test;

import com.saucedemo.pageobject.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void AllTest() {
		driver.get(url);
		logger.info("url is open");
		
		LoginPage lp = new LoginPage(driver);
		lp.EnterUserName("standard_user");
		logger.info("username Accepted");
		lp.EnterPassword("secret_sauce");
		logger.info("password is enter");
		lp.ClickOnLoginBtn();
		
		}
	
}
