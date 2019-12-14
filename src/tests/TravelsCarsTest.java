
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsCars;
import pages.TravelsLogin;
import pages.TravelsMenu;

public class TravelsCarsTest extends BasicTest{
	private String baseUrl = "https://www.phptravels.net/admin";
	
	@Test(priority = 1)
	public void numberOfRentedCars() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		

		
		TravelsLogin log = new TravelsLogin(driver);
		log.singIn("admin@phptravels.com", "demoadmin");
		Thread.sleep(2000);
		
		TravelsMenu tm = new TravelsMenu(driver);
		tm.clickOnCarsCars();
		Thread.sleep(2000);
		
		TravelsCars tc = new TravelsCars(driver);
		
		boolean numberOfCars = tc.numberOfRentedCars(10);
		Assert.assertFalse(numberOfCars);
		
	}
	
	@Test(priority = 2)
	public void numberOfRented50() throws InterruptedException {
		
		TravelsCars tc = new TravelsCars(driver);
		int suma = tc.isTotalNumberOfRentedCars50();
		Assert.assertFalse(suma > 50 );
		
	}

}
