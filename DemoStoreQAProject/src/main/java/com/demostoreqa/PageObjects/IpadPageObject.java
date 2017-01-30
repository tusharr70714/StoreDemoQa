package com.demostoreqa.PageObjects;

import org.openqa.selenium.WebDriver;

public class IpadPageObject extends DemoStoreQADefaultPageObject 
{
  WebDriver driver;
  
  public IpadPageObject(WebDriver driver)
  {   super(driver);
	  this.driver=driver;
  }
}
