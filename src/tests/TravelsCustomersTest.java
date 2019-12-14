package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsCustomers;
import pages.TravelsLogin;

public class TravelsCustomersTest extends BasicTest {
		private String baseUrl = "https://www.phptravels.net/admin";
		
		@Test(priority = 1)
		public void customersTest() throws InterruptedException {
			driver.get(baseUrl);
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			

			
			TravelsLogin log = new TravelsLogin(driver);
			log.singIn("admin@phptravels.com", "demoadmin");
			Thread.sleep(4000);
			
			TravelsCustomers ts = new TravelsCustomers(driver);
			Thread.sleep(6000);
			ts.clickOnCustomers();
			ts.clickOnEditCustomer();
			Thread.sleep(6000);
			ts.setFirstName("Mikonosrastos");
			ts.setLastName("Markovic");
			ts.setEmail("lalalablabla@bla.com");
			ts.setPassword("lallabalaa");
			ts.setMobileNumber("432234638543");
			ts.clickSelectCountry();
			Thread.sleep(4000);
			ts.setAdress1("Mokranjca 11");
			ts.selectStatus();
			ts.clickOnSelect();
			ts.clickOnSubmit();
			
			Thread.sleep(6000);
			ts.clickOnSearch();
			Thread.sleep(2000);
			ts.setSearchInput("Mikonosrastos");
			Assert.assertFalse(ts.getFirstName().getText().contains("Mikonosrastos"));
		}
}
