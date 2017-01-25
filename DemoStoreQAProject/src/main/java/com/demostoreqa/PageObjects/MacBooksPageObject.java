package com.demostoreqa.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MacBooksPageObject extends AccessoriesPageObject {
	public WebDriver driver;

	public MacBooksPageObject(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
	}

	public String getProductCategory(){
		
		
			WebElement ProductCategory=driver.findElement(By.xpath("//*[@id='post-103']/header/h1"));
					String Category=ProductCategory.getText();
					
					return Category;
					
		}

}
