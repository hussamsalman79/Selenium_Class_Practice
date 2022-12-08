package SeleniumBasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMoreFunctions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		// Go to Facebook.com
		// Get title and verify it matches to 
		driver.get("https:\\facebook.com");
		String title= driver.getTitle(); 
		if (title.equals("Facebook - log in or sign up")) {
			System.out.println("Title Matches");
		}
		else {
			System.out.println("Not Matches");
		}
		// Get current URL 
		String URL	=driver.getCurrentUrl(); 
		System.out.println("Current URL is correct " + URL);
		
		// Find the the forget password element 
		WebElement forgetPassword = driver.findElement(By.linkText("Forgot password?")); 
		String TextFP = forgetPassword.getText();
		System.out.println(TextFP);
		if(TextFP.equals("Forgot password?")){
			System.out.println("Forget password Text is matching ");
		}
		else {
			System.out.println("Forget password Text is NOT matching");
		}
		// Close the browser 
		//driver.close();
		// Quits the driver session which closes all browsers if any is open 
		driver.quit();
	}

}
