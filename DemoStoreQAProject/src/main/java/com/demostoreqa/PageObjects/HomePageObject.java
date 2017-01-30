package com.demostoreqa.PageObjects;

import org.openqa.selenium.WebDriver;

public class HomePageObject extends DemoStoreQADefaultPageObject {

	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {

		super(driver);
		this.driver = driver;

	}

}
