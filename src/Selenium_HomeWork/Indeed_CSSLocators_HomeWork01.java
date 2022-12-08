package Selenium_HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed_CSSLocators_HomeWork01 {
		// We can declare the object at the class level, we can access it at any method. 
		// Class level or global level can be access in any method belong to the class 
		WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		Indeed_CSSLocators_HomeWork01 obj1 = new Indeed_CSSLocators_HomeWork01();

		obj1.testcase1();
		obj1.testcase2();
		obj1.testcase3();
		
	}
	// if the method is not static, means we need create an object to call it.  
	public void testcase1() {
		// Go to indeed.com
		driver.get("https://www.indeed.com/");

		// Find the Where field and get the value of attribute 'value'
		// then verify it's based on your current location.

		String ExpectedLocation = "Arlington, VA";

		String currentLocation = driver.findElement(By.cssSelector("input[id =text-input-where]"))
				.getAttribute("value");
		System.out.println(currentLocation);
		if (ExpectedLocation.equals(currentLocation)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fails");
		}
		driver.close(); 

	}
		public void testcase2() {
		WebDriver driver = new ChromeDriver();

		// Go to indeed.com
		driver.get("https://www.indeed.com/");

		// Find the Where field and get css value of color
		// then verify the color property is "rgba(45, 45, 45, 1)".
		String CurrentRGB = driver.findElement(By.cssSelector("input[id=text-input-where]")).getCssValue("color");
		System.out.println("Current RGBA: " + CurrentRGB);

		String expectedRGBA = "rgba(45, 45, 45, 1)";
		if (CurrentRGB.equals(expectedRGBA)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		driver.close(); 
		}
		public  void testcase3() {
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
			driver.close(); 
}
}