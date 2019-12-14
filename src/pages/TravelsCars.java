package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCars extends BasicPage {
	
	
	public TravelsCars(WebDriver driver) {
		super(driver);
	}
	
	private By rowsSelector = By.cssSelector("div.xcrud-list-container > table > tbody > tr");
	private By carsName = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By carsOrders = By.cssSelector("#Cars > li:nth-child(1) > a");

	public WebElement getCarsName() {
		return this.driver.findElement(carsName);
	}
	public WebElement getCarsOrders() {
		return this.driver.findElement(carsOrders);
	}
	public void clickOnCarsName() {
		this.driver.findElement(carsName).click();
	}
	public void clickOnCarsOrders() {
		this.driver.findElement(carsOrders).click();
	}
	
		public boolean numberOfRentedCars(int numberOfModels) {
			List<WebElement> rows = driver.findElements(rowsSelector);
			int numberOfRows = rows.size();
			System.out.println(numberOfRows);
			System.out.println(" ");
			if (numberOfRows == numberOfModels) {
				return true;
			}
			return false;
		}
	
		public int isTotalNumberOfRentedCars50() {
			int sum = 0;
			List<WebElement> rows = driver.findElements(rowsSelector);
			for(int i=0; i<rows.size(); i++) {
				WebElement row = rows.get(i);
				WebElement orderValueElement = row.findElement(By.cssSelector("td:nth-child(10) input"));
				String val = orderValueElement.getAttribute("value");
				System.out.println(val);
				sum = sum + Integer.valueOf(val);			
			}
			return sum;
		}
}


