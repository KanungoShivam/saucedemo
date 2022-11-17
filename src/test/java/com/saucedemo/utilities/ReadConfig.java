package com.saucedemo.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties property;
	String path="C:\\Users\\Hp\\eclipse-workspace\\saucedemo\\configuration\\config.properties";
	
	public ReadConfig() {
		try { 
		property =new Properties();
			FileInputStream zzz =new FileInputStream(path);
			property.load(zzz);
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	public String getBaseUrl() {
		String value = property.getProperty("baseUrl");
		if(value!= null)
			return value;
			else
				throw new RuntimeException("Url not found");
		
	}
	public String getBrowser() {
		String value = property.getProperty("browser");
		if(value!=null)
			return value;
			else 
				throw new RuntimeException("browser not get");
	}
}
