package SeleniumBasicFunctions;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		// go to indeed.com
		WebDriver driver = new ChromeDriver();
		// get the current URL and store it in a variable called homeURL.
		driver.get("https://www.indeed.com/");
		String homeURL = driver.getCurrentUrl();
		System.out.println(homeURL);
		// get the web site title and store it in a variable homeTitle.
		String homeTitle = driver.getTitle();
		System.out.println(homeTitle);
		// find the input field for WHAT and type SDET
		WebElement WhatField = driver.findElement(By.id("text-input-what"));
		WhatField.sendKeys("SDET");
		// find the Find job field button, and click it
		WebElement FindJob = driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton"));
		FindJob.click();
		// get the current URL and store it a variable searchURL.
		String searchURL = driver.getCurrentUrl();
		System.out.println(searchURL);
		String searchTitle = driver.getTitle();
		System.out.println(searchTitle);
		Thread.sleep(1000);
		// verify that searchURL does not equal to homeURL and contains the search
		// criteria.
		if ((!searchURL.equals(homeURL)) && (searchURL.contains("SDET"))) {
			System.out.println("URLs do not match, and it contains the message. Test Pass!");
		} else {
			System.out.println("URLs match, Test Fail!");
		}
		Thread.sleep(1000);
		// verify that searchTitle does not equal to homeTitle and has the search
		// criteria.
		if ((!searchTitle.equals(homeTitle)) && (searchTitle.contains("Phoenixville, PA"))) {
			System.out.println("Titles do not match, and it contains the message. Test Pass!");
		} else {
			System.out.println("Titles match, Test Fail!");
		}
		// Get Text of the JobsInLocation field, store it in a variable,
		Thread.sleep(500);
		String JobsInLocation = driver.findElement(By.className("jobsearch-SerpTitle")).getText();
		System.out.println(JobsInLocation);
		Thread.sleep(500);
		// then verify if it's equals to your search criteria.{
		if (JobsInLocation.contains("SDET") && (JobsInLocation.contains("Phoenixville, PA"))) {
			System.out.println("Test Pass!");
		} else {
			System.out.println("Test Fail!");
		}

	}

	public static void ClearText(WebElement element) {
		
		String location = element.getAttribute("Value"); 
		
		for (int i=0; i<location.length(); i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}

	}
	
	public static void DeleteText (WebElement element1) {
		element1.sendKeys(Keys.COMMAND, "a");
		element1.sendKeys(Keys.BACK_SPACE);

	}
}
