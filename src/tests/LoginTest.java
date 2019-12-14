package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.TravelsLogin;
import utils.ExcelLogin;

public class LoginTest extends BasicTest{
	private String baseUrl = "https://www.phptravels.net/admin";

	
	@Test(priority = 0)
	public void basicLoginTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		

		
//		TravelsLogin log = new TravelsLogin(driver);
//		log.singIn("admin@phptravels.com", "demoadmin");
//		Thread.sleep(2000);
		
		TravelsLogin log = new TravelsLogin(driver);
		ExcelLogin el = new ExcelLogin();
		el.setExcell("Username.xlsx");
		el.setWorkSheet(0);
		String username = el.getDataAt(1, 0);
		String password = el.getDataAt(1, 1);
		log.singIn(username, password);
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Dashboard");
		
	}
	
			
		
	
}
