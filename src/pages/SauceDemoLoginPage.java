package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class SauceDemoLoginPage {
	
	public SauceDemoLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id="user-name")
	public WebElement username; 
	
	@FindBy (name="password")
	public WebElement password; 
	
	@FindBy(name ="login-button")
	public WebElement loginButton; 
	
	
	

}
