package com.demostoreqa.FunctionalTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.demostore.qa.dataprovider.DataProvider;
import com.demostoreqa.PageObjects.AccessoriesPageObject;
import com.demostoreqa.PageObjects.CheckoutPageObjects;
import com.demostoreqa.PageObjects.DemoStoreQADefaultPageObject;
import com.demostoreqa.PageObjects.MacBooksPageObject;

public class DemoStoreQAFunctionalTest {

	public WebDriver driver;

	public DemoStoreQADefaultPageObject obj;
	public MacBooksPageObject Macbookobj;
	public AccessoriesPageObject Accobj;
	public CheckoutPageObjects Checkobj;

	public static final String USERNAME = "tusharr";
	public static final String ACCESS_KEY = "df5a2462-a305-4ad1-a97b-b52d11731cc8";
	public static final String SURL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		// Running on Local machine
		
		 System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe"); 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://store.demoqa.com/");
		 

		// running on Sauce labs cloud VMs
		/*
		 * DesiredCapabilities caps = DesiredCapabilities.chrome();
		 * caps.setCapability("platform", "Windows XP");
		 * caps.setCapability("version", "43.0");
		 * 
		 * driver = new RemoteWebDriver(new URL(SURL), caps);
		 * driver.get("http://store.demoqa.com/");
		 * 
		 * //driver = new RemoteWebDriver(new URL(SURL), caps);
		 * //driver.manage().window().maximize();
		 */
		
		//Setting up Grid having single node
		/*System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setVersion("55.0.2883.87");
		caps.setPlatform(Platform.VISTA);*/
		
//		caps.setCapability("platform", "Windows 8.1");
//		caps.setCapability("version", "55.0");
		
		/*DesiredCapabilities caps =new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN8_1);*/
		//caps.setCapability(capabilityName, value);
		//caps.setCapability("Browser", "Chrome");
//		caps.setCapability("Version", "55");
//		caps.setCapability("Platform", "Platform.WIN8_1");
		
		/*driver=new RemoteWebDriver(new URL("http://10.10.125.99:4444/wd/hub"), caps);
		driver.get("http://store.demoqa.com/");
		driver.manage().window().maximize()*/;
		
		
		// Macbookobj = new MacBooksPageObject(driver);
		Accobj = new AccessoriesPageObject(driver);
		// Checkobj=new CheckoutPageObjects(driver);

	}

	/*@Test(enabled = false)
	public void selectProductCategory() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		String ProductCategoryName = Macbookobj.getProductCategory();
		System.out.println("Category Name: " + ProductCategoryName);
		Assert.assertEquals(ProductCategoryName, "Accessories");

	}

	@Test(enabled = false)
	public void verifyUserIsAbleToAddItemToCart() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		//Accobj.continueShopping();
	}
	
	@Test(enabled = false)
	public void verifyUserIsAbleToAddMultipleItemsToCart() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Accobj.continueShopping();
		Accobj.selectMenuItem("Apple TV");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		System.out.println("Multiple Products are added to cart successfully");
	}
	
	

	@Test(enabled = false)
	public void verifyUserCanUpdateProductQuantity() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.productQuantityUpdate("Magic Mouse", "5");
		System.out.println("Product Quantity updated successfully");
	}



	@Test(enabled = false)
	public void verifyTotalProductPrice() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.verifyTotalPriceOfProduct("Magic Mouse");
		System.out.println("Total price of product verified successfully");
	}

	@Test(enabled = false)
	public void verifySubTotalAmount() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Accobj.continueShopping();
		Accobj.selectMenuItem("Apple TV");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.verifyAllProductsTotalPrice();
		System.out.println("Subtotal price is verified successfully");
	}
	*/

	// @Parameters({ "country", "state", "email", "FN", "LN", "Add", "city",
	// "state2", "country_main", "PS", "phn" })
	
	@Test(enabled = true, dataProvider = "UserAdress", dataProviderClass = DataProvider.class)
	public void verifyUserIsAbleToPurchaseSingleProduct(String ctry, String st, String eml, String FirstN, String LastN, String Addss,
			String ct, String st2, String ctry_main, String PosS, String phone) throws InterruptedException
	{	Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.clickContinue();
		Checkobj.entershippingDetails(ctry, st, eml, FirstN, LastN, Addss, ct, st2, ctry_main, PosS, phone);
		Checkobj.clickOnPurchase();
		System.out.println("Purchase completed successfully");
	}
	
	@Test(enabled = false, dataProvider = "UserAdress", dataProviderClass = DataProvider.class)
	public void verifyUserIsAbleToPurchaseMultipleProduct(String ctry, String st, String eml, String FirstN, String LastN, String Addss,
			String ct, String st2, String ctry_main, String PosS, String phone) throws InterruptedException

	{	Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Accobj.continueShopping();
		Accobj.selectMenuItem("Apple TV");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.clickContinue();
		Checkobj.entershippingDetails(ctry, st, eml, FirstN, LastN, Addss, ct, st2, ctry_main, PosS, phone);
		Checkobj.clickOnPurchase();
		System.out.println("Purchase completed successfully");
	}

	@Test(enabled = false, dataProvider = "UserAdress", dataProviderClass = DataProvider.class)
	public void verifyUserCanRemoveProductFromCartAndPurchase(String ctry, String st, String eml, String FirstN, String LastN, String Addss,
			String ct, String st2, String ctry_main, String PosS, String phone) throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Accobj.continueShopping();
		Accobj.selectMenuItem("Apple TV");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.removeProduct("Magic Mouse");
		System.out.println("Product Removed successfully");
		Checkobj.clickContinue();
		Checkobj.entershippingDetails(ctry, st, eml, FirstN, LastN, Addss, ct, st2, ctry_main, PosS, phone);
		Checkobj.clickOnPurchase();
		System.out.println("Purchase completed successfully");
	}
	
	@Test(enabled = false)
	public void verifySubTotalPriceCalcualtionAfterRemovingProductFromCart() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Accobj.continueShopping();
		Accobj.selectMenuItem("Apple TV");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.removeProduct("Magic Mouse");
		System.out.println("Product Removed successfully");
		Checkobj.verifyAllProductsTotalPrice();
		System.out.println("Test Passed successfully");
	}
	
	@Test(enabled = false)
	public void verifySubTotalPriceCalcualtionForCartHavingMultipleProducts() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Accobj.continueShopping();
		Accobj.selectMenuItem("Apple TV");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.verifyAllProductsTotalPrice();
		System.out.println("Test Passed successfully");
	}
	
	@Test(enabled = false)
	public void verifyProductPriceAfterIncreaseInProductQuantity() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.productQuantityUpdate("Magic Mouse", "5");
		Checkobj.verifyTotalPriceOfProduct("Magic");
	}
	
	@Test(enabled = false)
	public void verifyProductPriceAfterDecreaseInProductQuantity() throws InterruptedException {
		Accobj.hoverMenuAndClick("Accessories");
		Accobj.selectMenuItem("Magic Mouse");
		Accobj.addToCart();
		Checkobj = Accobj.gotoCheckout();
		Checkobj.productQuantityUpdate("Magic Mouse", "5");
		Checkobj.verifyTotalPriceOfProduct("Magic");
		Checkobj.productQuantityUpdate("Magic Mouse", "3");
		Checkobj.verifyTotalPriceOfProduct("Magic");
		System.out.println("Git Changes");
	}	
	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}