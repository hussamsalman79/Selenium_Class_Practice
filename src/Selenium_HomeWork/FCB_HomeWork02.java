package Selenium_HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FCB_HomeWork02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		
		driver.getTitle(); 
		
		WebElement CreateBtn = driver.findElement(By.partialLinkText("Create new account"));
		CreateBtn.click(); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		WebElement FirstName = driver.findElement(By.name("firstname")); 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		FirstName.sendKeys("Sam"); 
		
		WebElement LastName = driver.findElement(By.name("lastname")); 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		LastName.sendKeys("Karmah"); 
		WebElement Email = driver.findElement(By.name("reg_email__")); 
		Email.sendKeys("hussamsalman79@yahoo.com"); 
		WebElement Password = driver.findElement(By.id("password_step_input")); 
		Password.sendKeys("Password"); 
		driver.findElement(By.name("websubmit")).click(); 
	}

}
