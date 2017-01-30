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
	
	public CheckoutPageObjects gotoCheckout() throws InterruptedException
	{
		WebElement GoToCheckout = driver.findElement(By.linkText("Go to Checkout"));
		GoToCheckout.click();
		Thread.sleep(2000);
		return new CheckoutPageObjects(driver);
	}
	
	public void continueShopping()
	{
		WebElement ContinueShopping = driver.findElement(By.linkText("Continue Shopping"));
		ContinueShopping.click();
		driver.navigate().back();
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

				//if (SelectedItem.getText().equalsIgnoreCase(Item)) 
					if (Item == "Apple TV") {
						SelectedItem.click();
						break;
					}
				
				//if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					if (Item == "Sennheiser RS 120") {
						SelectedItem.click();
						break;

					}
				
				//if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					if (Item == "Skullcandy PLYR 1 – Black") {
						SelectedItem.click();
						break;

					}
				
				//if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					if (Item == "Apple 27 inch Thunderbolt Display") {
						SelectedItem.click();
						break;

					}
				
				//if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					if (Item == "Asus MX239H 23-inch Widescreen AH") {
						SelectedItem.click();
						break;

					}
				
				//ImacPageObject
				//if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					/*if (Item == "Magic Mouse") {
						SelectedItem.click();
						break;
					}*/
				
				//IpadPageObject
					/*if(Item == "Magic Mouse")
					{
						SelectedItem.click();
						break;
					}*/
					if(Item == "Apple iPad 2 16GB, Wi-Fi, 9.7in – Black")
					{
						SelectedItem.click();
						break;
					}
					if(Item == "Apple iPad 6 32GB (White, 3D)")
					{
						SelectedItem.click();
						break;
					}
				
				
				//IphonePageObject
				//if(SelectedItem.getText().equalsIgnoreCase(Item))
				
					/*if(Item == "Magic Mouse")
					{
						SelectedItem.click();
						break;
					}*/
					if(Item == "Apple iPhone 4S 16GB SIM-Free – Black")
					{
						SelectedItem.click();
						break;
					}
					if(Item == "Apple iPhone 4S 32GB SIM-Free – White")
					{
						SelectedItem.click();
						break;
					}
				
				
				//IpodPageobject
				//if(SelectedItem.getText().equalsIgnoreCase(Item))
				
					if(Item == "Magic Mouse")
					{
						SelectedItem.click();
						break;
					}
					if(Item == "Apple iPod touch 32GB 5th Generation – Black")
					{
						SelectedItem.click();
						break;
					}
					if(Item == "Apple iPod touch Large")
					{
						SelectedItem.click();
						break;
					}
				
				//MackbooksPageObject
				//if (SelectedItem.getText().equalsIgnoreCase(Item)) {
					/*if (Item == "Magic Mouse") {
						SelectedItem.click();
						break;
					}*/
					if (Item == "Apple 13-inch MacBook Pro") {
						SelectedItem.click();
						break;
					}
				
			}
		}
	}
	
}