package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelsLogin  extends BasicPage{
	
	private By email = By.name("email");
	private By password = By.name("password");
	private By rememberMe = By.xpath("/html/body/div[2]/form[1]/div[1]/div/div[1]/label");
	private By forgetPassword = By.linkText("Forget Password");
	private By loginBtn = By.cssSelector("button.btn-lg");
	
	
	
	public TravelsLogin(WebDriver driver) {
		super(driver);
	}
	
	
	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}
	
	public void clickOnRememberMe() {
		this.driver.findElement(this.rememberMe).click();
	}
	
	public void clickOnForgetPassword() {
		this.driver.findElement(this.forgetPassword).click();
	}
	
	public void clickOnLoginBtn() {
		this.driver.findElement(this.loginBtn).click();
	}
	
	public void singIn(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.clickOnRememberMe();
		this.clickOnLoginBtn();
	}
}
