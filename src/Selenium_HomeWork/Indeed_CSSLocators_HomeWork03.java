package Selenium_HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed_CSSLocators_HomeWork03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
				
		testcase3(); 

	}
	// Static method means we could use it within same class without creating an object
	public static void testcase3() {
		WebDriver driver =new ChromeDriver(); 		
		//Go to indeed.com
		driver.get("https://www.indeed.com/");
		
		//Find the Where field and get tag name
		//Then verify the tag name is equal to "input".
		
		String TagName = driver.findElement(By.cssSelector("input[id=text-input-where]")).getTagName(); 
		
		System.out.println(TagName);
		
		String ExpectedTageName = "input"; 
	
		if(ExpectedTageName.equals(TagName)) {
			System.out.println("Tag name is matching, Test Pass");
		}
		else {
			System.out.println("Tag Name is not matching, Test Fail");
		}
		
	}
}
