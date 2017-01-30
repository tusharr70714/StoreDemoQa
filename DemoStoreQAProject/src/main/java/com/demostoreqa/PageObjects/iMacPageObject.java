package com.demostoreqa.PageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iMacPageObject extends DemoStoreQADefaultPageObject{
	
	WebDriver driver;
	
	public iMacPageObject(WebDriver driver){
		
		super(driver);
		this.driver = driver;
						
	}
}
