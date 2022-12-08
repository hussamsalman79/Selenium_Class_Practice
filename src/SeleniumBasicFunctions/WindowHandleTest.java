package SeleniumBasicFunctions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WindowHandleTest obj = new WindowHandleTest(); 
		obj.WindowHandling();
		
	}
	
	public void WindowHandling() {
		//Go to a Web site  
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://practice.primetech-apps.com:4567/styled/windows-test.html");
		driver.manage().window().maximize();
		
		// get the current window handle
		String mainWindowId = driver.getWindowHandle(); 
		System.out.println("Main Window ID: " + mainWindowId);
		// click on a page link
		driver.findElement(By.id("gobasicajax")).click(); 
		//get window handles 
		Set <String> windowIds = driver.getWindowHandles(); 
		
		for (String windowId : windowIds) {
			
			System.out.println("Window id:" + windowId);
			
			if (!windowId.equals(mainWindowId)) {
				driver.switchTo().window(windowId); // Ask the driver to switch to the 2nd page
				
			}
			
		}
		
		//switch to next window (child window)
		String test2ndPage = driver.findElement(By.xpath("/html/body/div/h1")).getText(); 
		
		System.out.println(test2ndPage);
		//driver.close(); 
		// we need to switch back to the main window in order to get the text of the main window
		
		driver.switchTo().window(mainWindowId); 
		
		String MainText = driver.findElement(By.xpath("/html/body/div/h1")).getText(); 
		
		System.out.println(MainText);
		
		//driver.close(); 
	
		
		
		
		
		
	}

}
