package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucelogin {
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement usernamefield;
	
	@FindBy(id="password")
	WebElement passwordfield;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	public saucelogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setvalues(String username,String password) {
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
	}
	
	public void login() {
		loginbutton.click();
	}

}
