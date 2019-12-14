package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TravelsCustomers extends BasicPage {


	public TravelsCustomers(WebDriver driver) {
		super(driver);
	}
	
	private By accounts =  By.cssSelector("#social-sidebar-menu > li:nth-child(5) > a");
	private By customers = By.cssSelector("#ACCOUNTS > li:nth-child(3) > a");
	private By editCustomer = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-list-container > table > tbody > tr:nth-child(1) > td.xcrud-current.xcrud-actions.xcrud-fix > span > a.btn.btn-default.btn-xcrud.btn.btn-warning");
	private By firstName = By.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(1) > div > input");
	private By lastName = By.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(2) > div > input");
	private By email = By.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(3) > div > input");
	private By password = By.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(4) > div > input");
	private By mobileNumber = By.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(5) > div > input");
	private By selectCountry = By.cssSelector("#s2id_autogen1 > a");
	private By adress1 = By.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(8) > div > input");
	private By status = By.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(11) > div > div > div > select");
	private By select = By.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(13) > div > div > label > input");
	private By submit = By.cssSelector("#content > form > div > div.panel-footer > button");
	private By search = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > a");
	private By searchInput = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > span.xcrud-search.form-inline > input");
	
	public WebElement  getAccounts () {
		return this.driver.findElement(accounts);
	}
	public void clickOnAccounts() {
		this.getAccounts().click();
}
	
	public WebElement  getCustomers () {
		return this.driver.findElement(customers);
	}
	public void clickOnCustomers() throws InterruptedException {
		this.clickOnAccounts();
		Thread.sleep(2000);
		this.getCustomers().click();
}
	
	public WebElement  getEditCustomer () {
		return this.driver.findElement(editCustomer);
	}
	public void clickOnEditCustomer() {
		this.getEditCustomer().click();
	}
	
	public WebElement  getFirstName () {
		return this.driver.findElement(firstName);
	}
	public void clearFirstName() {
		this.getFirstName().clear();
}
	public void setFirstName(String firstName) {
		this.clearFirstName();
		this.driver.findElement(this.firstName).sendKeys(firstName);
	}
	
	public WebElement  getLastName () {
		return this.driver.findElement(lastName);
	}
	public void clearLastName() {
		this.getLastName().clear();
}
	public void setLastName(String lastName) {
		this.clearLastName();
		this.driver.findElement(this.lastName).sendKeys(lastName);
	}
	
	public WebElement  getEmail () {
		return this.driver.findElement(email);
	}
	public void clearEmail() {
		this.getEmail().clear();
}
	public void setEmail(String email) {
		this.clearEmail();
		this.driver.findElement(this.email).sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}
	
	public WebElement  getMobileNumber () {
		return this.driver.findElement(mobileNumber);
	}
	public void clearMobileNumber () {
		this.getMobileNumber().clear();
}
	public void setMobileNumber(String mobileNumber) {
		this.clearMobileNumber();
		this.driver.findElement(this.mobileNumber).sendKeys(mobileNumber);
	}
	
	public void clickSelectCountry() {
		WebElement selectCountry = driver.findElement(this.selectCountry);
		
		selectCountry.click();
		selectCountry.sendKeys("Serbia");
		selectCountry.sendKeys(Keys.ENTER);
	}
	
	public void setAdress1(String adress1) {
		this.driver.findElement(this.adress1).sendKeys(adress1);
	}
	
	public void selectStatus() {
		WebElement selectStatus = driver.findElement(this.status);
		
		selectStatus.click();
		selectStatus.sendKeys("Disable");
		
	}
	
	
	public WebElement  getSelect () {
		return this.driver.findElement(select);
	}
	public void clickOnSelect() {
		this.getSelect().click();
	}
	
	public WebElement  getSubmit () {
		return this.driver.findElement(submit);
	}
	public void clickOnSubmit() {
		this.getSubmit().click();
	}
	
	
	public WebElement  getSearch () {
		return this.driver.findElement(search);
	}
	public void clickOnSearch() {
		this.getSearch().click();
	}
	
	public void setSearchInput(String searchInput) {
		this.driver.findElement(this.searchInput).sendKeys(searchInput);
		this.driver.findElement(this.searchInput).sendKeys(Keys.ENTER);
	}
	
}
