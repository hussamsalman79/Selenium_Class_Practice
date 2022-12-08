package Selenium_HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_TestCase2 {

	public static void main(String[] args) {
		
		
			//Test case 2: 
			//go to http://practice.primetech-apps.com:4567/styled/index.html
			//Find iFrames Test Page and click on it.
			//Find the iFrame Example List text and print it out.
			//Find the iFrame List Item 0 and print it out.
			//Find the iFrame List Item 1, print it out.
			//Find the iFrame List Item 2, print it out.
			//Go back to the main frame, find the main frame header and print. 
			//Find 'Nested Page Example' text and  print it 
			//Go back to the main frame, find the main frame header and print.
		

	}
	public void iFrametest() {
		//go to http://practice.primetech-apps.com:4567/styled/index.html
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.get("http://practice.primetech-apps.com:4567/styled/index.html");
				
				//Find iFrames Test Page and click on it.
				driver.findElement(By.id("iframestest")).click();
				//Find the iFrame Example List text and print it out.
				String exampleListText = driver.findElement(By.xpath("//h2[text()='iFrame Example List']")).getText();
			    System.out.println(exampleListText);
			    
			    
			    WebElement iframe1 = driver.findElement(By.id("thedynamichtml"));
			    driver.switchTo().frame(iframe1);
			    //Find the iFrame List Item 0 and print it out.
			    System.out.println(driver.findElement(By.id("iframe0")).getText());
			    
			    // Find the iFrame List Item 1, print it out.
			    System.out.println(driver.findElement(By.id("iframe1")).getText());
				// Find the iFrame List Item 2, print it out.
			    System.out.println(driver.findElement(By.id("iframe2")).getText());
			    
			    //Go back to the main frame, find the main frame header and print.
			    // driver.switchTo().parentFrame() // or
			    driver.switchTo().defaultContent();
			    
			    System.out.println(driver.findElement(By.xpath("//h1[text()='iFrames Example']")).getText());
			    
			    //Find 'Nested Page Example' text and  print it
			    
			    driver.switchTo().frame("theheaderhtml");
			    System.out.println(driver.findElement(By.xpath("//h1[text()='Nested Page Example']")).getText());
			    
			    //Go back to the main frame, find the main frame header and print.
			    driver.switchTo().parentFrame();
			    System.out.println(driver.findElement(By.xpath("//h1[text()='iFrames Example']")).getText());
			    
			    driver.quit();
			    
			}
	}


