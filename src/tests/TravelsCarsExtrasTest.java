package tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsCarsExtras;
import pages.TravelsLogin;
import pages.TravelsMenu;

public class TravelsCarsExtrasTest extends BasicTest{
private String baseUrl = "https://www.phptravels.net/admin";
	
	@Test(priority = 1)
	public void extrasAddTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		

		
		TravelsLogin log = new TravelsLogin(driver);
		log.singIn("admin@phptravels.com", "demoadmin");
		Thread.sleep(2000);
		
		TravelsMenu tm = new TravelsMenu(driver);
		tm.clickOnCarsExtras();
		Thread.sleep(2000);
		
		TravelsCarsExtras tce = new TravelsCarsExtras(driver);
		tce.clickOnAddButton();
		Thread.sleep(6000);
		
		tce.getUploadImage().sendKeys("c:\\Users\\Milan\\Desktop\\alien.jpg");
		Thread.sleep(3000);
		tce.setNameExtras("Mercedeszzz");;
		tce.clickStatusSelect();
		tce.setPriceInput(15000);
		tce.clickOnSaveButton();
		Thread.sleep(5000);
		
		Assert.assertEquals(tce.getAddedAssert().getText(),"Mercedeszzz");
	}
}
