package Selenium_HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_NavigateFunctions_HomeWork01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		Amazon_NavigateFunctions_HomeWork01 obj = new Amazon_NavigateFunctions_HomeWork01(); 
		
		obj.testCase();
		
	}
	
	public void testCase() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.findElement(By.cssSelector("input[id =twotabsearchtextbox]")).sendKeys("Coffee Mug", Keys.ENTER); 
		
		driver.navigate().back(); 
		driver.findElement(By.cssSelector("input[id =twotabsearchtextbox]")).sendKeys("Pretty Coffee Mug", Keys.ENTER);
		
		Thread.sleep(1000); 	
		driver.navigate().back(); 
		
		Thread.sleep(1000); 
		driver.navigate().forward(); 
		
		Thread.sleep(1000); 
		driver.navigate().refresh(); 
		
		Thread.sleep(1000); 
		driver.close(); 
		
		
	}

}
