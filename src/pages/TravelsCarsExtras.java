package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCarsExtras extends BasicPage {

	public TravelsCarsExtras(WebDriver driver) {
		super(driver);
	}
	
	
	private By addButton = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/a[1]");
	private By saveButton = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/a[1]");
	private By nameExtras =  By.cssSelector("[name='cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--']");
	private By uploadImage = By.name("xcrud-attach");
	private By statusSelect = By.cssSelector("select.xcrud-input.form-control");
	private By priceInput = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div/input");
	private By addedAssert = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-list-container > table > tbody > tr:nth-child(1) > td:nth-child(4)");
	

	public WebElement  getAddButton () {
		return this.driver.findElement(addButton);
	}
	public void clickOnAddButton() {
		this.getAddButton().click();
}
	
	public WebElement  getSaveButton () {
		return this.driver.findElement(saveButton);
	}
	
		
	public void clickOnSaveButton() {
		this.getSaveButton().click();
}
	

	public void setNameExtras(String nameExtras) {
		this.driver.findElement(this.nameExtras).sendKeys(nameExtras);
	}
	
	
	
	public WebElement  getUploadImage () {
		return this.driver.findElement(uploadImage);
	}
	
	public void clickStatusSelect() {
		WebElement selectStatus = driver.findElement(this.statusSelect);
		Select states = new Select(selectStatus);
		states.selectByVisibleText("No");
	}
	
	public void setPriceInput(int priceInput) {
		this.driver.findElement(this.priceInput).sendKeys(priceInput+"");
	}
	
	
	public WebElement  getAddedAssert () {
		return this.driver.findElement(addedAssert);
	}
	
}
