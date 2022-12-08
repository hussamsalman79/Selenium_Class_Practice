package SeleniumBasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicFunctionsAndLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		//Element locator by name
		
		// navigate to https://www.saucedemo.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		// find the username by name locator and store it in a webElement.
		WebElement usernameField = driver.findElement(By.name("user-name"));
		// type standard_user into username field.
		usernameField.sendKeys("standard_user");
		// find the password by name locator and store it in a webElment.
		WebElement passwordField = driver.findElement(By.name("password"));
		// type secret_sauce into password field.
		passwordField.sendKeys("secret_sauce");
		// find the login button and click on it.
		driver.findElement(By.name("login-button")).click();

		// Element locator with linkText
		WebDriver driver1 = new ChromeDriver();
		// Getting the amazon.com using get method
		driver1.get("https://amazon.com");								
		driver1.findElement(By.linkText("Customer Service")).click(); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		// find the Amazon Basics link using linkText locator and click on it.
		driver1.findElement(By.linkText("Amazon Basics")).click();
		
		// Find element by Class name 
		
		driver1.findElement(By.className("nav-input")).sendKeys("Soccer Ball");
		
		WebElement SearchBtn = driver1.findElement(By.id("nav-search-submit-button")); 
		SearchBtn.click();

	}

}
