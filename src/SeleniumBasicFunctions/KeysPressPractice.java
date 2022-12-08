package SeleniumBasicFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysPressPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		KeysPressPractice obj = new KeysPressPractice(); 
		obj.keyPressEnter();

	}
	
	public void keyPressEnter() {
		
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.findElement(By.cssSelector("input[name=q]")).sendKeys("Coffee Mug", Keys.ENTER); 
	}
}
