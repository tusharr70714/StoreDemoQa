package com.demostoreqa.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccessoriesPageObject extends DemoStoreQADefaultPageObject {

	WebDriver driver;
	AccessoriesPageObject Itemobj;

	public AccessoriesPageObject(WebDriver driver) {

		super(driver);
		this.driver = driver;

	}

	public void selectMenuItem(String Item) {

		List<WebElement> MenuItem = driver.findElements(By.xpath("//*[@id='default_products_page_container']/div/div[2]/h2/a"));
		System.out.println("Element Names are: " + MenuItem.size());

		for (WebElement SelectedItem : MenuItem) {
			if (SelectedItem.getText().equalsIgnoreCase(Item)) {
				if (Item == "Magic Mouse") {
					SelectedItem.click();
					break;
				}

				if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					if (Item == "Apple TV") {
						SelectedItem.click();
						break;
					}
				}
				if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					if (Item == "Sennheiser RS 120") {
						SelectedItem.click();
						break;

					}
				}
				if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					if (Item == "Skullcandy PLYR 1 – Black") {
						SelectedItem.click();
						break;

					}
				}
				if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					if (Item == "Apple 27 inch Thunderbolt Display") {
						SelectedItem.click();
						break;

					}
				}
				if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					if (Item == "Asus MX239H 23-inch Widescreen AH") {
						SelectedItem.click();
						break;

					}
				}
			}
		}
	}
	
	public String getProductCategory(){
		
		
		WebElement ProductCategory=driver.findElement(By.xpath("//*[@id='post-105']/header/h1"));
				String Category=ProductCategory.getText();
				
				
				return Category;
				
	}


}
