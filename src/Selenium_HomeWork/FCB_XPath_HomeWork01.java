package Selenium_HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FCB_XPath_HomeWork01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//go to facebook.com
		driver.get("https://www.facebook.com/");
		
		//find the Email or phone number field and type Automation
		Thread.sleep(500); 
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]")); 
		email.sendKeys("Automation"); 
		
		//find the Password field and type Automation
		
		WebElement Password = driver.findElement(By.xpath("//input[@name=\"pass\"]")); 
		Password.sendKeys("Automation"); 
		
		// find the Login button and click on it.
		Thread.sleep(500); 
		WebElement Login = driver.findElement(By.xpath("//button[@type=\"submit\"]")); 
		Login.click();			
				

	}

}
