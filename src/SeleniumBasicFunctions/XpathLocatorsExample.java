package SeleniumBasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.etsy.com/");
		
		WebElement SignBtn = driver.findElement(By.xpath("//button[@class=\"wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin\"]")); 
		SignBtn.click(); 
		Thread.sleep(500); 
		WebElement Reg = driver.findElement(By.xpath("//button [@class=\"wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register\"]")); 
		Reg.click(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
