package SeleniumBasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		// 1. Go to etsy.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com/"); // We call the page
		String EtsyURL = driver.getCurrentUrl(); // Convert to String
		System.out.println("Estsy full URL is: " + EtsyURL);// Display

		// 2. Find Sign in button and click on it
		WebElement SignInBtn = driver.findElement(By.className("select-signin"));
		SignInBtn.click();
		Thread.sleep(1000);

		// 3. Find email address field and type “automation”
		WebElement emailAddress = driver.findElement(By.id("join_neu_email_field"));
		emailAddress.sendKeys("Automation");

		Thread.sleep(1000);
		// 4. Find the password field and type “automation”
		WebElement Password = driver.findElement(By.id("join_neu_password_field"));
		Password.sendKeys("Secrer_Password@2022");

		// 5. Find the sign in button and click on it
		WebElement Signin = driver.findElement(By.name("submit_attempt"));
		Signin.click();
		Thread.sleep(4000);
		driver.quit();
	}

}
