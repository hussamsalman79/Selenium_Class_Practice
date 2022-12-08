package Selenium_HomeWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guruHomeWork1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		guruHomeWork1 obj = new guruHomeWork1();
		obj.AlterTest();

	}

	public void AlterTest() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// go to http://demo.guru99.com/popup.php
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		// Get the title and store it in a variable.
		String MyTitle = driver.getTitle();
		System.out.println(MyTitle);
		String mainWindowId = driver.getWindowHandle();
		// Click on Click Here button and switch over to next window
		driver.findElement(By.xpath("/html/body/p/a")).click();
		// provide an email click Submit.
		Set<String> windowIds = driver.getWindowHandles();

		for (String windowId : windowIds) {

			System.out.println("Window id:" + windowId);

			if (!windowId.equals(mainWindowId)) {
				driver.switchTo().window(windowId); // Ask the driver to switch to the 2nd page

			}

		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name ='emailid']")).sendKeys("test123@primetech.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		// Get text of the user ID and password and store them in variables, print them
		String UserName = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		System.out.println("User Name: " + UserName);
		Thread.sleep(1000);
		String Password = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();

		System.out.println("Password: " + Password);
		// Then verify the text "This access is valid only for 20 days."

		String AccessText = driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/h3")).getText();

		System.out.println(AccessText);
		String ExpectedText = "This access is valid only for 20 days.";

		if (AccessText.equals(ExpectedText)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		// Close the window.
		driver.close();

		// Go back to the main window
		driver.switchTo().window(mainWindowId);
		// and get the title then verify it equals to your stored title.
		String SecondTitle = driver.getTitle();

		if (MyTitle.equals(SecondTitle)) {
			System.out.println("Title Matach, PASS");
		} else {
			System.out.println("Title does not Matach, FAIL");
		}
		// Quit driver.
		driver.close();

	}

}
