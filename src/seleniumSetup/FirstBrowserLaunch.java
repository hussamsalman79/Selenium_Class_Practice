package seleniumSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstBrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		String title = new String(); 
		
		WebDriver driver = new ChromeDriver();
		// Getting the amazon.com using get method
		driver.get("https://amazon.com");
		title = driver.getTitle(); 
		System.out.println(title);
		
		// find the search box using find method and store it into a WebElement object
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox")); 
		// Type coffee mug 
		SearchBox.sendKeys("Coffee mug"); 
		//find search button and store it into a WebElement
		WebElement SearchBtn = driver.findElement(By.id("nav-search-submit-button")); 
		// click the search button
		SearchBtn.click(); 
		//clear the coffee mug from the search box and type something else 
		
		WebElement Searchbox2 = driver.findElement(By.id("twotabsearchtextbox")); 
		Searchbox2.clear(); 
		Searchbox2.sendKeys("Pretty Coffee MuG"); 
		WebElement SearchBtn2 = driver.findElement(By.id("nav-search-submit-button")); 
		SearchBtn2.click(); 
		
		
	}
	
}
