package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.TravelsLogin;
import pages.TravelsMenu;

public class TravelsMenuTest extends BasicTest {

	private String baseUrl = "https://www.phptravels.net/admin";
	
	@Test(priority = 1)
	public void basicMenuClickTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		

		
		TravelsLogin log = new TravelsLogin(driver);
		log.singIn("admin@phptravels.com", "demoadmin");
		Thread.sleep(2000);
		
		TravelsMenu tm = new TravelsMenu(driver);
		Thread.sleep(15000);
		tm.clickOnDashboard();
		Assert.assertEquals(driver.getTitle(), "Dashboard");
		Thread.sleep(1000);
		tm.clickOnUpdates();
		Assert.assertEquals(driver.getTitle(), "Updates");
		Thread.sleep(1000);
		tm.clickOnModules();
		Assert.assertEquals(driver.getTitle(), "Modules");
		Thread.sleep(1000);
		tm.clickOnTours();
		Thread.sleep(1000);
		tm.clickOnToursAddNew();
		Assert.assertEquals(driver.getTitle(), "Add Tour");
		Thread.sleep(1000);
		tm.clickOnCars();
		Thread.sleep(1000);
		tm.clickOnCoupons();
		Assert.assertEquals(driver.getTitle(), "Coupon Codes Management");
		Thread.sleep(1000);
		tm.clickOnCarsExtras();
		Assert.assertEquals(driver.getTitle(), "Extras Management");
		Thread.sleep(1000);
		tm.clickOnCarsCars();
		Assert.assertEquals(driver.getTitle(), "Cars Management");
		Thread.sleep(4000);
		tm.clickOnNewsletter();
		Assert.assertEquals(driver.getTitle(), "Newsletter Management");
		Thread.sleep(1000);
		tm.clickOnBookings();
		Assert.assertEquals(driver.getTitle(), "Booking Management");
	}
}
