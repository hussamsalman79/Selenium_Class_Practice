package SeleniumBasicFunctions;

import pages.SauceDemoLoginPage;
import utils.DataReader;
import utils.Driver;

public class SuaceDemoTest {
	
	public static void main(String[] args) {
	
		
		SauceDemoLoginPage page = new SauceDemoLoginPage(); 
		
		Driver.getDriver().get(DataReader.getData("sauceUrl"));
		
		page.username.sendKeys("standard_user");
		page.password.sendKeys("secret_sauce");
		page.loginButton.click();
		
		
		
		
		
		
	}
	
	

}
