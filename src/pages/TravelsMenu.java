package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsMenu extends BasicPage{

	public TravelsMenu(WebDriver driver) {
		super(driver);
	}
	
	private By minimize = By.cssSelector("document.querySelector(\"#social-sidebar-menu > li:nth-child(1) > a\")");
	private By dashboard = By.cssSelector("#social-sidebar-menu > li:nth-child(1) > a > strong");
	private By updates = By.cssSelector("#social-sidebar-menu > li:nth-child(2) > a > span:nth-child(2)");
	
	private By modules =  By.cssSelector("[href='https://www.phptravels.net/admin/settings/modules/']");
	private By tours = By.cssSelector("[href='#Tours']");
	private By toursAddNew =  By.cssSelector("[href='https://www.phptravels.net/admin/tours/add']");
	private By cars = By.cssSelector("[href='#Cars']");
	private By carsCars = By.cssSelector("a[href='https://www.phptravels.net/admin/cars']");
	private By carsExtras = By.cssSelector("#Cars > li:nth-child(2)");
	private By coupons =  By.cssSelector("[href='https://www.phptravels.net/admin/coupons/']");
	private By newsletter = By.cssSelector("[href='https://www.phptravels.net/admin/newsletter/']");
	private By bookings = By.cssSelector("[href='https://www.phptravels.net/admin/bookings/']");
	
	public WebElement  getMinimize () {
		return this.driver.findElement(minimize);
	}
	public void clickOnMinimize() {
		this.getMinimize().click();
}
	
	
	public WebElement  getDashboard () {
		return this.driver.findElement(dashboard);
	}
	public void clickOnDashboard() {
		this.getDashboard().click();
}

	public WebElement  getUpdates () {
		return this.driver.findElement(updates);
	}
	public void clickOnUpdates() {
		this.getUpdates().click();
}

	public WebElement  getModules () {
		return this.driver.findElement(modules);
	}
	public void clickOnModules() {
		this.getModules().click();
}
	
	public WebElement  getTours () {
		return this.driver.findElement(tours);
	}
	public void clickOnTours() {
		this.getTours().click();
}
	
	public WebElement  getToursAddNew () {
		return this.driver.findElement(toursAddNew);
	}
	public void clickOnToursAddNew() {
		this.getToursAddNew().click();
}	
	
	public WebElement  getCars () {
		return this.driver.findElement(cars);
	}
	public void clickOnCars() {
		this.getCars().click();
}
	
	public WebElement  getCarsCars () {
		return this.driver.findElement(carsCars);
	}
	public void clickOnCarsCars() {
		this.clickOnCars();
		this.getCarsCars().click();
}

	public WebElement  getCarsExtras () {
		return this.driver.findElement(carsExtras);
	}
	public void clickOnCarsExtras() throws InterruptedException {
		this.clickOnCars();
		Thread.sleep(2000);
		this.getCarsExtras().click();
}
	
	public WebElement  getCoupons () {
		return this.driver.findElement(coupons);
	}
	public void clickOnCoupons() {
		this.getCoupons().click();
}
	
	public WebElement  getBookings () {
		return this.driver.findElement(bookings);
	}
	public void clickOnBookings() {
		this.getBookings().click();
}
	
	public WebElement  getNewsletter () {
		return this.driver.findElement(newsletter);
	}
	public void clickOnNewsletter() {
		this.getNewsletter().click();
}
	
}

