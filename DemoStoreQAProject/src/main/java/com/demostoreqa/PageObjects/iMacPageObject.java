package com.demostoreqa.PageObjects;

import org.openqa.selenium.WebDriver;

public class iMacPageObject extends DemoStoreQADefaultPageObject{
	
	WebDriver driver;
	
	public iMacPageObject(WebDriver driver){
		
		super(driver);
		this.driver = driver;
						
	}
	

}
