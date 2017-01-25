package com.demostoreqa.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class DemoStoreQADefaultPageObject {

	public WebDriver driver;
	DemoStoreQADefaultPageObject product;

	public DemoStoreQADefaultPageObject(WebDriver driver) {

		this.driver = driver;

	}

	public DemoStoreQADefaultPageObject hoverMenuAndClick(String ProductCategory) {

		WebElement productToBeSelected = null;

		Actions actions = new Actions(driver);
		WebElement MenuOption = driver.findElement(By.xpath("//*[@id='menu-item-33']"));
		actions.moveToElement(MenuOption).build().perform();
		

		List<WebElement> element = driver.findElements(By.xpath("//*[@id='menu-item-33']/ul/li/a"));

		//System.out.println("Element Names are: " + element.size());

		for (WebElement menuitems : element) {

			if (menuitems.getText().equalsIgnoreCase(ProductCategory)) {

				if (ProductCategory == "Accessories") {

					productToBeSelected = menuitems;
					productToBeSelected.click();
					product = new AccessoriesPageObject(driver);
					break;

				}

				if (ProductCategory == "iMacs") {

					productToBeSelected = menuitems;
					productToBeSelected.click();
					product = new iMacPageObject(driver);
					break;

				}

				if (ProductCategory == "iPads") {

					productToBeSelected = menuitems;
					productToBeSelected.click();
					product = new iMacPageObject(driver);
					break;

				}

				if (ProductCategory == "iPhones") {

					productToBeSelected = menuitems;
					productToBeSelected.click();
					product = new iPhonesPageObject(driver);
					break;

				}
				if (ProductCategory == "iPods") {

					productToBeSelected = menuitems;
					productToBeSelected.click();
					product = new iPodPageObject(driver);
					break;

				}
				if (ProductCategory == "MacBooks") {

					productToBeSelected = menuitems;
					productToBeSelected.click();
					product = new MacBooksPageObject(driver);
					break;

				}

			}

		}

		return product;

	}
	 
	public void addToCart() throws InterruptedException
	{
		WebElement AddToCart=driver.findElement(By.name("Buy"));
		AddToCart.click();
		Thread.sleep(2000);
	}
	
	public CheckoutPageObjects gotoCheckout()
	{
		WebElement GoToCheckout = driver.findElement(By.linkText("Go to Checkout"));
		GoToCheckout.click();
		return new CheckoutPageObjects(driver);
	}
	
	public void continueShopping()
	{
		WebElement ContinueShopping = driver.findElement(By.linkText("Continue Shopping"));
		ContinueShopping.click();
		driver.navigate().back();
	}
	
}