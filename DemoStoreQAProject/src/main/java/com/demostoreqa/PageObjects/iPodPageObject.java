package com.demostoreqa.PageObjects;

import org.openqa.selenium.WebDriver;

public class iPodPageObject extends DemoStoreQADefaultPageObject {

	WebDriver driver;

	public iPodPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
