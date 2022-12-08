package Selenium_HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed_XPath_HomeWork03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//go to facebook.com
		driver.get("https://www.indeed.com/");
		//get the current URL and store it in a variable called homeURL.
		String homeURL = driver.getCurrentUrl(); 
		System.out.println(homeURL);
		//get the web site title and store it in a variable homeTitle.
		String homeTitle = driver.getTitle(); 
		System.out.println(homeTitle);
		Thread.sleep(300); 
		//find the input field for WHAT and type SDET
		WebElement WhatJob = driver.findElement(By.xpath("//input[@id=\"text-input-what\"]")); 
		WhatJob.sendKeys("SDET"); 
		Thread.sleep(300); 
		//find the input field for where, clear the field first and type Washington DC
		WebElement WhereJob = driver.findElement(By.xpath("//input[@id=\"text-input-where\"]")); 
		ClearText(WhereJob); 
		Thread.sleep(500); 
		WhereJob.sendKeys("Washington, DC"); 
		Thread.sleep(500); 
		//find the Find Jobs button and click on it.
		WebElement FindJobbtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		FindJobbtn.click(); 
		
		//get the current URL and store it as a variable searchURL.
		String searchURL = driver.getCurrentUrl(); 
		System.out.println(searchURL);
		//get the website title and store it in a variable searchTitle.
		String serchTitle = driver.getTitle(); 
		System.out.println(serchTitle);
		//verify that searchURL does not equal to homeURL and contains the search criteria.
		
		if (!(searchURL.equalsIgnoreCase(homeURL)) && searchURL.contains("SDET")){
			
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		Thread.sleep(500); 
		//verify that searchTitle does not equal to homeTitle and has the search criteria.
		if (!(serchTitle.equalsIgnoreCase(homeTitle)) && serchTitle.contains("Washington, DC")){
			
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		//Get Text of the JobsInLocation field, store it in a variable, 
		
		WebElement JobsInLocation = driver.findElement(By.xpath("//h1[@class=\"jobsearch-SerpTitle i-unmask\"]")); 
		String JobsLoc= JobsInLocation.getText(); 
		System.out.println(JobsLoc);
		
		// then verify if it's equal to your search criteria.
		if (JobsLoc.contains("SDET") && (JobsLoc.contains("Washington, DC"))) {
			System.out.println("Search Criteria is matching, Test Pass ");
		}
		else {
			System.out.println("Search Criteria is not matching, Test Fail ");
		}

	}
	
	public static void ClearText(WebElement element) {
		element.sendKeys((Keys.CONTROL) + "a");
		element.sendKeys(Keys.BACK_SPACE);
	}

}
