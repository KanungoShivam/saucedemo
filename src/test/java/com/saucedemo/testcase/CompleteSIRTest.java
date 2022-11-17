package com.saucedemo.testcase;


	import java.io.IOException;

	
	import org.testng.Assert;

	import org.testng.annotations.Test;

import com.saucedemo.pageobject.CheckOutPage;

import com.saucedemo.pageobject.InformationPage;
import com.saucedemo.pageobject.LoginPage;
import com.saucedemo.pageobject.OverviewPage;
import com.saucedemo.pageobject.ProductPage;

	public class CompleteSIRTest extends BaseClass{
		
		@Test
		public void verifyProduct() throws InterruptedException, IOException{
			
			driver.get(url);
			logger.info("url opened");
			
			LoginPage lp = new LoginPage(driver);
			
			lp.EnterUserName("standard_user");
			lp.EnterPassword("secret_sauce");
			lp.ClickOnLoginBtn();
			
			String title = driver.getTitle();
			System.out.println("Product page title is :" + title);
			
			if(title.equals("Swag Labs"))
			{
				logger.info("VerifyLogin - Passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("VerifyLogin - Failed");
				capturescreenshot(driver,"VerifyLogin");
				Assert.assertTrue(false);

			}
			
			ProductPage sp = new ProductPage(driver);
			
			sp.ClickAddToCart();
			sp.ClickToCartStore();
			
			String url = driver.getCurrentUrl();
			System.out.println("Product page title is :" + url);
			
			if(url.equals("https://www.saucedemo.com/inventory-item.html?id=4"))
			{
				logger.info("VerifyLogin - Passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("VerifyLogin - Failed");
				capturescreenshot(driver,"VerifyLogin");
				Assert.assertTrue(false);

			}
			
			CheckOutPage cp = new CheckOutPage(driver);
			cp.ClickOnCheckOut();
			
			String checkOUturl = driver.getCurrentUrl();
			System.out.println("Product page title is :" + checkOUturl);
			
			if(checkOUturl.equals("https://www.saucedemo.com/checkout-step-one.html"))
			{
				logger.info("VerifyLogin - Passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("VerifyLogin - Failed");
				capturescreenshot(driver,"VerifyLogin");
				Assert.assertTrue(false);

			}
			
			InformationPage ip = new InformationPage(driver);
			ip.EnterFirstName("manish");
			ip.EnterLastName("Test");
			ip.EnterPostalCode("00000");
			ip.ClickOnContinueBtn();
			
			String overviewUrl = driver.getCurrentUrl();
			System.out.println("Product page title is :" + overviewUrl);
			
			if(overviewUrl.equals("https://www.saucedemo.com/checkout-step-two.html"))
			{
				logger.info("VerifyLogin - Passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("VerifyLogin - Failed");
				capturescreenshot(driver,"VerifyLogin");
				Assert.assertTrue(false);

			}
			
			OverviewPage op = new OverviewPage(driver);
			op.ClickOnFinshBtn();
			
			
					
			Thread.sleep(5000);

	}
	

}
