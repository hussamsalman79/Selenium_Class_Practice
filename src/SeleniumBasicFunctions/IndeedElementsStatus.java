package SeleniumBasicFunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedElementsStatus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		IndeedElementsStatus object = new IndeedElementsStatus(); 
		
		//object.IndeedElementsTest();
		object.radioButtons();

	}
	
	public void radioButtons() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		driver.get("https://designsystem.digital.gov/components/radio-buttons/");
		driver.manage().window().maximize();
		List <WebElement> RadioBtns = driver.findElements(By.cssSelector(".usa-radio__label")); 
		//check if the radio displayed and Enabled 
		// Since we have many of them, then we need to loop through them 
		
		for (WebElement elms : RadioBtns) {
			if (elms.isDisplayed()&& elms.isEnabled()){
				System.out.println("Element is displayed and enabled");
				Thread.sleep(1000); 
				if(!elms.isSelected()) {
					elms.click(); 
					System.out.println("Elements are clicked");
				}
				Thread.sleep(1000); 
				if(elms.isSelected()){
					System.out.println("Radio Button is selected ");
				}
				
				}
			else {
				System.out.println("Elemnet is not displayed or Enabled");
			}
		}
	}
	
	
	public void IndeedElementsTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.get("https://www.indeed.com/");
		driver.manage().window().maximize();
		WebElement WhatField = driver.findElement(By.cssSelector("#text-input-what")); 
		WebElement WhereField = driver.findElement(By.cssSelector("#text-input-where")); 
		
		Thread.sleep(1000); 
		if (WhatField.isDisplayed()==true && WhatField.isEnabled()== true) {
			System.out.println("Where Field is Displayed and Enabled, Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		Thread.sleep(1000); 
		if (WhereField.isDisplayed()==true && WhereField.isEnabled()== true) {
			System.out.println("Waht Field is Displayed and Enabled, Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		Thread.sleep(1000); 
		driver.close(); 
	}
	
}
