package Selenium_HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPracticeRview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		AlertPracticeRview obj = new AlertPracticeRview(); 
		
		obj.testcase4();
	}
	
	public void TestCase2() throws InterruptedException {
	
		//alert. Then Validate the text cret has changed to True.
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		
		//go to http://practice.primetech-apps.com:4567/alerts.html
		
		driver.get("http://practice.primetech-apps.com:4567/alerts.html");
		
		//Find the text cret and save in a variable.
		
		String  CertElement1 =driver.findElement(By.id("confirmreturn")).getText(); 
		
		Thread.sleep(1000); 
		//Click on the Show Confirm Box button and Accept the
		driver.findElement(By.id("confirmexample")).click(); 
		
		//alert. Then Validate the text cret has changed to True.
		Thread.sleep(1000); 
		Alert handle = driver.switchTo().alert(); 
		
		handle.accept(); 
		Thread.sleep(1000); 
		String  CertElement2 =driver.findElement(By.id("confirmreturn")).getText(); 
		
		if (!CertElement2.equals(CertElement1) && CertElement2.equals("true")) {
			
			System.out.println("Test Pass - " + CertElement2);
		}
		else {
			System.out.println("Test Fail");
		}
		
		
		
	}
	
	public void TestCase3() throws InterruptedException {
		
		//alert. Then Validate the text cret has changed to True.
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		
		//go to http://practice.primetech-apps.com:4567/alerts.html
		
		driver.get("http://practice.primetech-apps.com:4567/alerts.html");
		
		//Find the text cret and save in a variable.
		
		String  CertElement1 =driver.findElement(By.id("confirmreturn")).getText(); 
		
		Thread.sleep(1000); 
		//Click on the Show Confirm Box button and Accept the
		driver.findElement(By.id("confirmexample")).click(); 
		
		//alert. Then Validate the text cret has changed to True.
		Thread.sleep(1000); 
		Alert handle = driver.switchTo().alert(); 
		
		handle.dismiss(); 
		Thread.sleep(1000); 
		String  CertElement2 =driver.findElement(By.id("confirmreturn")).getText(); 
		
		if (!CertElement2.equals(CertElement1) && CertElement2.equals("false")) {
			
			System.out.println("Test Pass - " + CertElement2);
		}
		else {
			System.out.println("Test Fail");
		}
		
		
		
	}
	public void testcase4() {
		/*
		 * Test case 4
           go to http://practice.primetech-apps.com:4567/alerts.html
           Click on the Show Prompt Box button, enter a text and accept.
           Validate the text input displays on the screen.
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://practice.primetech-apps.com:4567/alerts.html");
		
		driver.findElement(By.id("promptexample")).click();
		
		WebDriverWait letsWait = new WebDriverWait(driver, 5);
		letsWait.until(ExpectedConditions.alertIsPresent());
		
		Alert handle = driver.switchTo().alert();
		
		handle.sendKeys("Coffee mug.");
		handle.accept();
		
		String text = driver.findElement(By.id("promptreturn")).getText();
		
		if (text.equals("Coffee mug.")) {
			System.out.println("Test Pass.");
		}else {
			System.out.println("Test Fail.");
		}
	}
}
