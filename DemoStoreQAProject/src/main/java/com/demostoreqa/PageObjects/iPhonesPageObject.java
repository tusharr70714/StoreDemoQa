package com.demostoreqa.PageObjects;

import org.openqa.selenium.WebDriver;

public class iPhonesPageObject extends DemoStoreQADefaultPageObject {
	WebDriver driver;

	public iPhonesPageObject(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
}
