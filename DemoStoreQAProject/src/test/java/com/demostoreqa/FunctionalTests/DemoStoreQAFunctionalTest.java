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
import com.demostoreqa.PageObjects.HomePageObject;
import com.demostoreqa.PageObjects.MacBooksPageObject;

public class DemoStoreQAFunctionalTest {

	public WebDriver driver;
	public CheckoutPageObjects Checkobj;
	public HomePageObject Homeobj;

	public static final String USERNAME = "tusharr";
	public static final String ACCESS_KEY = "df5a2462-a305-4ad1-a97b-b52d11731cc8";
	public static final String SURL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		// Running on Local machine

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
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

		// Setting up Grid having single node
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "drivers\\chromedriver.exe"); DesiredCapabilities caps =
		 * DesiredCapabilities.chrome(); caps.setVersion("55.0.2883.87");
		 * caps.setPlatform(Platform.VISTA);
		 */

		// caps.setCapability("platform", "Windows 8.1");
		// caps.setCapability("version", "55.0");

		/*
		 * DesiredCapabilities caps =new DesiredCapabilities();
		 * caps.setBrowserName("chrome"); caps.setPlatform(Platform.WIN8_1);
		 */
		// caps.setCapability(capabilityName, value);
		// caps.setCapability("Browser", "Chrome");
		// caps.setCapability("Version", "55");
		// caps.setCapability("Platform", "Platform.WIN8_1");

		/*
		 * driver=new RemoteWebDriver(new
		 * URL("http://10.10.125.99:4444/wd/hub"), caps);
		 * driver.get("http://store.demoqa.com/");
		 * driver.manage().window().maximize()
		 */;

		// Macbookobj = new MacBooksPageObject(driver);
		// Accobj = new AccessoriesPageObject(driver);
		// Checkobj=new CheckoutPageObjects(driver);
		Homeobj = new HomePageObject(driver);

	}

	/*
	 * @Test(enabled = false) public void selectProductCategory() throws
	 * InterruptedException { Homeobj.hoverMenuAndClick("Accessories"); String
	 * ProductCategoryName = Homeobj.getProductCategory(); System.out.println(
	 * "Category Name: " + ProductCategoryName);
	 * Assert.assertEquals(ProductCategoryName, "Accessories");
	 * 
	 * }
	 * 
	 * @Test(enabled = true) public void verifyUserIsAbleToAddItemToCart()
	 * throws InterruptedException { Homeobj.hoverMenuAndClick("iMacs");
	 * Homeobj.selectMenuItem("Magic Mouse"); Homeobj.addToCart(); //
	 * Accobj.continueShopping(); }
	 * 
	 * @Test(enabled = false) public void
	 * verifyUserIsAbleToAddMultipleItemsToCart() throws InterruptedException {
	 * Homeobj.hoverMenuAndClick("Accessories"); Homeobj.selectMenuItem(
	 * "Magic Mouse"); Homeobj.addToCart(); Homeobj.continueShopping();
	 * Homeobj.selectMenuItem("Apple TV"); Homeobj.addToCart(); Checkobj =
	 * Homeobj.gotoCheckout(); System.out.println(
	 * "Multiple Products are added to cart successfully"); }
	 * 
	 * @Test(enabled = false) public void verifyUserCanUpdateProductQuantity()
	 * throws InterruptedException { Homeobj.hoverMenuAndClick("Accessories");
	 * Homeobj.selectMenuItem("Magic Mouse"); Homeobj.addToCart(); Checkobj =
	 * Homeobj.gotoCheckout(); Checkobj.productQuantityUpdate("Magic Mouse",
	 * "5"); System.out.println("Product Quantity updated successfully"); }
	 * 
	 * @Test(enabled = false) public void verifyTotalProductPrice() throws
	 * InterruptedException { Homeobj.hoverMenuAndClick("Accessories");
	 * Homeobj.selectMenuItem("Magic Mouse"); Homeobj.addToCart(); Checkobj =
	 * Homeobj.gotoCheckout(); Checkobj.verifyTotalPriceOfProduct("Magic Mouse"
	 * ); System.out.println("Total price of product verified successfully"); }
	 * 
	 * @Test(enabled = false) public void verifySubTotalAmount() throws
	 * InterruptedException { Homeobj.hoverMenuAndClick("Accessories");
	 * Homeobj.selectMenuItem("Magic Mouse"); Homeobj.addToCart();
	 * Homeobj.continueShopping(); Homeobj.selectMenuItem("Apple TV");
	 * Homeobj.addToCart(); Checkobj = Homeobj.gotoCheckout();
	 * Checkobj.verifyAllProductsTotalPrice(); System.out.println(
	 * "Subtotal price is verified successfully"); }
	 */
	// @Parameters({ "country", "state", "email", "FN", "LN", "Add", "city",
	// "state2", "country_main", "PS", "phn" })

	@Test(enabled = false, dataProvider = "UserAdress", dataProviderClass = DataProvider.class)
	public void verifyUserIsAbleToPurchaseSingleProduct(String ctry, String st, String eml, String FirstN, String LastN,
			String Addss, String ct, String st2, String ctry_main, String PosS, String phone)
			throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Checkobj.clickContinue();
		Checkobj.entershippingDetails(ctry, st, eml, FirstN, LastN, Addss, ct, st2, ctry_main, PosS, phone);
		Checkobj.clickOnPurchase();
		System.out.println("Purchase completed successfully");
	}

	@Test(enabled = false, dataProvider = "UserAdress", dataProviderClass = DataProvider.class)
	public void verifyUserIsAbleToPurchaseMultipleProduct(String ctry, String st, String eml, String FirstN,
			String LastN, String Addss, String ct, String st2, String ctry_main, String PosS, String phone)
			throws InterruptedException

	{
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Homeobj.continueShopping();
		Homeobj.selectMenuItem("Apple TV");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Checkobj.clickContinue();
		Checkobj.entershippingDetails(ctry, st, eml, FirstN, LastN, Addss, ct, st2, ctry_main, PosS, phone);
		Checkobj.clickOnPurchase();
		System.out.println("Purchase completed successfully");
	}

	@Test(enabled = false, dataProvider = "UserAdress", dataProviderClass = DataProvider.class)
	public void verifyUserCanRemoveProductFromCartAndPurchase(String ctry, String st, String eml, String FirstN,
			String LastN, String Addss, String ct, String st2, String ctry_main, String PosS, String phone)
			throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Homeobj.continueShopping();
		Homeobj.selectMenuItem("Apple TV");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Checkobj.removeProduct("Magic Mouse");
		System.out.println("Product Removed successfully");
		Checkobj.clickContinue();
		Checkobj.entershippingDetails(ctry, st, eml, FirstN, LastN, Addss, ct, st2, ctry_main, PosS, phone);
		Checkobj.clickOnPurchase();
		System.out.println("Purchase completed successfully");
	}

	@Test(enabled = false)
	public void verifySubTotalPriceCalcualtionAfterRemovingProductFromCart() throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Homeobj.continueShopping();
		Homeobj.selectMenuItem("Apple TV");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Checkobj.removeProduct("Magic Mouse");
		System.out.println("Product Removed successfully");
		Checkobj.verifySubTotalPrice();
		System.out.println("Test Passed successfully");
	}

	@Test(enabled = false)
	public void verifySubTotalPriceCalcualtionForCartHavingMultipleProducts() throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Homeobj.continueShopping();
		Homeobj.selectMenuItem("Apple TV");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Checkobj.verifySubTotalPrice();
		System.out.println("Test Passed successfully");
	}

	@Test(enabled = false)
	public void verifyProductPriceAfterIncreaseInProductQuantity() throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Checkobj.productQuantityUpdate("Magic Mouse", "5");
		Checkobj.verifyTotalPriceOfProduct("Magic");
	}

	@Test(enabled = false)
	public void verifyProductPriceAfterDecreaseInProductQuantity() throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Checkobj.productQuantityUpdate("Magic Mouse", "5");
		Checkobj.verifyTotalPriceOfProduct("Magic");
		Checkobj.productQuantityUpdate("Magic Mouse", "3");
		Checkobj.verifyTotalPriceOfProduct("Magic");
	}

	@Test(enabled = false)
	public void verifyDuplicateEntriesInCart() throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Homeobj.continueShopping();
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Assert.assertEquals(Checkobj.checkDuplicateItems("Magic Mouse"), false);
	}

	@Test(enabled = false, dataProvider = "UserAdress", dataProviderClass = DataProvider.class)
	public void verifyPurchasingItemsFromDifferentCategories(String country, String state, String email, String FN,
			String LN, String Add, String city, String state2, String country_main, String PS, String phn)
			throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Homeobj.continueShopping();
		Homeobj.hoverMenuAndClick("iPads");
		Homeobj.selectMenuItem("Apple iPad 2 16GB, Wi-Fi, 9.7in – Black");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Checkobj.clickContinue();
		Checkobj.entershippingDetails(country, state, email, FN, LN, Add, city, state2, country_main, PS, phn);
		Assert.assertEquals(Checkobj.clickOnPurchase(), true);
	}

	@Test(enabled = false)
	public void verifySubtotalForItemsFromDiffCategories() throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Homeobj.continueShopping();
		Homeobj.hoverMenuAndClick("iPads");
		Homeobj.selectMenuItem("Apple iPad 2 16GB, Wi-Fi, 9.7in – Black");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Assert.assertEquals(Checkobj.verifySubTotalPrice(), true);
	}

	@Test(enabled = true)
	public void verifyEachProductPriceAddedFromDiffCategories() throws InterruptedException {
		Homeobj.hoverMenuAndClick("Accessories");
		Homeobj.selectMenuItem("Magic Mouse");
		Homeobj.addToCart();
		Homeobj.continueShopping();
		Homeobj.hoverMenuAndClick("iPods");
		Homeobj.selectMenuItem("Apple iPod touch Large");
		Homeobj.addToCart();
		Checkobj = Homeobj.gotoCheckout();
		Assert.assertEquals(Checkobj.verifyTotalPriceOfProduct("Magic Mouse"), true);
		Assert.assertEquals(Checkobj.verifyTotalPriceOfProduct("Apple iPod touch Large"), true);
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}