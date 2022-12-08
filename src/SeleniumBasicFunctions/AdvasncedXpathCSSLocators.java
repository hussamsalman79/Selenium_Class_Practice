package SeleniumBasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvasncedXpathCSSLocators {

	public static void main(String[] args) throws InterruptedException {

		/*
		 
		
		
		
		 * Verify you get the error message: 
		 * "Sorry, the email you have entered is already in use."
		 */
		
			System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver(); 
		
		// * Go to etsy.com 
		driver.get("https://www.etsy.com/"); 
		
		// * Click on Sign in. 
		driver.findElement(By.cssSelector(".select-signin")).click();
		Thread.sleep(1000); 
		// * Click on Register. 
		driver.findElement(By.cssSelector(".select-register")).click();
		Thread.sleep(1000); 
		//* Enter an email address, (jon.dow@gmail.com) 
		driver.findElement(By.cssSelector("#join_neu_email_field")).sendKeys("jon.dow@gmail.com"); 
		Thread.sleep(1000); 
		// * Enter first name. 
		driver.findElement(By.cssSelector("#join_neu_first_name_field")).sendKeys("Automation"); 
		Thread.sleep(1000); 
		// * Enter password. 
		driver.findElement(By.cssSelector("#join_neu_password_field")).sendKeys("Automation"); 
		Thread.sleep(1000); 
		// * Click on Register. 
		driver.findElement(By.cssSelector(".wt-btn.wt-btn--primary.wt-width-full")).click();
		
		String ExpectedMsg = "Sorry, the email you have entered is already in use."; 
		Thread.sleep(1000); 
		String ErrorMsg = driver.findElement(By.cssSelector("#aria-join_neu_email_field-error")).getText(); 		
		Thread.sleep(1000); 
		if (ExpectedMsg.equals(ErrorMsg)) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
	}

}
