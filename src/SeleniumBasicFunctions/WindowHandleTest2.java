package SeleniumBasicFunctions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTest2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
				
		WindowHandleTest2 obj2 = new WindowHandleTest2(); 
		obj2.HandleWindowTest();
		
	}
	
	public void HandleWindowTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://practice.primetech-apps.com:4567/styled/windows-test.html");
		driver.manage().window().maximize();
		//Get the main window ID and store it in a String,
		String MainWinID = driver.getWindowHandle(); 
		
		System.out.println("Main Window ID: " + MainWinID);
		
		//Click on the Basic Ajax in new page
		
		driver.findElement(By.xpath("//*[@id=\"gobasicajax\"]")).click(); 
		
		//Get window IDs and store it into a SET
		
		Set<String> WindowIDS = driver.getWindowHandles(); 
		
		System.out.println(WindowIDS);
		
		//Get the first window ID and Verify it matches with the main window id in step 2
		
		Iterator <String> Itr = WindowIDS.iterator();
		
		String firstWindowID = Itr.next(); 
		
		if (firstWindowID.equals(MainWinID)) {
			
			System.out.println("First ID matched with the main widow ID ");
		}
		else {
			System.out.println("First ID NOT matching  the main widow ID ");
		}
		
		// Switch to the second window using iterator 
		String secondWindowID = Itr.next(); 
		System.out.println("Second Window ID:" + secondWindowID);
		driver.switchTo().window(secondWindowID); 
	
		//Get the page header Text and verify it is “Basic Ajax Example”	
		String TextPage2 = driver.findElement(By.xpath("/html/body/div/h1")).getText(); 
		
		System.out.println(TextPage2);
		driver.close(); 
	
		driver.switchTo().window(MainWinID); 
		
		//Verify you are on the main window.
		if (driver.getWindowHandle().equals(MainWinID)) {
			System.out.println("We are at the main page ");
		}
		driver.close(); 
		
	}

}
