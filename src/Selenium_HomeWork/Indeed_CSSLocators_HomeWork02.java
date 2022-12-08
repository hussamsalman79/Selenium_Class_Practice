package Selenium_HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed_CSSLocators_HomeWork02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		Indeed_CSSLocators_HomeWork02 obj2 = new Indeed_CSSLocators_HomeWork02(); 
		obj2.testcase2();
	
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
}
