package Selenium_HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FCB_HomeWork01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailPhone = driver.findElement(By.name("email"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		emailPhone.sendKeys("hussamsalman79@yahoo.com"); 

		WebElement Password = driver.findElement(By.name("pass")); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		Password.sendKeys("Ashburn@20148");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		WebElement LogBtn = driver.findElement(By.name("login")); 
		LogBtn.click();

	}

}
