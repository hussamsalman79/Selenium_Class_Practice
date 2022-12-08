package Selenium_HomeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonTestCase1SelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		AmazonTestCase1SelectClass obj = new AmazonTestCase1SelectClass(); 
		
		obj.SelectTest();

	}
	
	public void SelectTest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//go to amazon.com
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		// get all the options in the departments select drop elements 
		Thread.sleep(1000); 
		
		WebElement DropList = driver.findElement(By.cssSelector("#searchDropdownBox")); 
		DropList.click(); 
		Thread.sleep(1000); 
		
		Select Choose = new Select(DropList); 
		List <WebElement> AllList = Choose.getOptions(); 
		Thread.sleep(1000); 
		
		System.out.println(AllList.size());
		if(AllList.size()==59) {
			
			System.out.println("Numbers of departments are match");
		}
		else {
			System.out.println("Numbers of departments are NOT match");
		}
		Thread.sleep(1000); 
		for (int i=0; i<AllList.size(); i++) {
			
			System.out.println(AllList.get(i).getText());
		}
		Thread.sleep(500); 
		driver.close(); 
	}

}
