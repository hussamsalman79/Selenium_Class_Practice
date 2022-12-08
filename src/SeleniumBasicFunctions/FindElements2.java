package SeleniumBasicFunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		FindElements2 obj = new FindElements2(); 
		
		obj.ItmesList();
		

	}
	
	public void ItmesList() throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user"); 
		Thread.sleep(1000); 
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		Thread.sleep(1000); 
		driver.findElement(By.cssSelector(".submit-button.btn_action")).click(); 
		
		
		List <WebElement> Items = driver.findElements(By.cssSelector(".inventory_item_price"));
		System.out.println(Items.size());
		
		Thread.sleep(1000); 
		if (Items.size() == 6) {
			
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
			
		}
		Thread.sleep(1000); 
		for (int i=0; i<=Items.size(); i++) {
			
			System.out.println("The price is: " + Items.get(i).getText());
			
		}
		driver.close(); 
		
	}
}
