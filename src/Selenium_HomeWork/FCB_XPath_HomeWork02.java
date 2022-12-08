package Selenium_HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FCB_XPath_HomeWork02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//go to facebook.com
		driver.get("https://www.facebook.com/");
		
		// find the Create New Account button and click on it
		WebElement NewAcc = driver.findElement(By.xpath("//a[@rel=\"async\"]")); 
		NewAcc.click(); 
		Thread.sleep(500); 
		//find the FirstName and type Automation
		WebElement FirstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]")); 
		FirstName.sendKeys("Automation"); 
		
		Thread.sleep(500); 
		
		//find the LastName and type Automation
		WebElement LastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]")); 
		LastName.sendKeys("Automation");
		Thread.sleep(500); 
		//find the Email and type Automation
		WebElement email = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")); 
		email.sendKeys("Automation@primetech.com"); 
		Thread.sleep(500); 
		//find the Password and type Automation
		WebElement Password = driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")); 
		Password.sendKeys("Automation"); 
		Thread.sleep(500); 
		//find the Sign Up button and click on it.
		WebElement SignUp = driver.findElement(By.xpath("//button[@name=\"websubmit\"]")); 
		SignUp.click(); 
		

	}

}
