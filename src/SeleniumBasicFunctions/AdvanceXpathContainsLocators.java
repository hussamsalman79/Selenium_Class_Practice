package SeleniumBasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathContainsLocators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		// go to etsy.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com/");

		driver.findElement(By.xpath("//button [contains(@class, 'action select-signin')]")).click();
		Thread.sleep(1000);
		// Click on Register.
		driver.findElement(By.xpath("//button [contains(@class, 'register-header-action select-register')]")).click();
		Thread.sleep(1000);
		// Enter email.
		driver.findElement(By.xpath("//input[contains(@id , 'join_neu_email_field')]")).sendKeys("Automation");
		Thread.sleep(1000);
		// Enter firstName
		driver.findElement(By.xpath("//input[contains(@id , 'join_neu_first_name_field')]")).sendKeys("Automation");
		Thread.sleep(1000);
		// Enter password
		driver.findElement(By.xpath("//input[contains(@id , 'join_neu_password_field')]")).sendKeys("Automation");

		// Click on register
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class, 'primary wt-width-full')]")).click();
		String Expectedmsg = "Please enter a valid email address.";
		Thread.sleep(1000);
		WebElement ErrMsg = driver.findElement(By.xpath("//div[@id='aria-join_neu_email_field-error']")); 
		String ActualMsg =ErrMsg.getText(); 
		System.out.println(ActualMsg);
		Thread.sleep(1000);
		if (ActualMsg.equals(Expectedmsg)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}

	}

}
