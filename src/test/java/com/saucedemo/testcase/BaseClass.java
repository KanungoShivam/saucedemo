package com.saucedemo.testcase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.saucedemo.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	
	String url = readconfig.getBaseUrl();
	String browser = readconfig.getBrowser();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		switch (browser.toLowerCase()){
		case "chrome":
		WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		break;
		
			case"ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
			default:
				driver = null;
				break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger= LogManager.getLogger("saucedemo");
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public void capturescreenshot(WebDriver driver,String textname) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
	
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"./screenshots" + textname + "png");
	FileUtils.copyFile(source, target);
	
		
	}
}
