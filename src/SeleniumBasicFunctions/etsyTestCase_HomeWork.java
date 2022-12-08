package SeleniumBasicFunctions;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class etsyTestCase_HomeWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		etsyTestCase_HomeWork objetsy = new etsyTestCase_HomeWork();

		objetsy.EstyTest();

	}

	public void EstyTest() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// go to etsy.com
		//Driver.getDriver().get("etsyUrl");
		driver.get("https://www.etsy.com");
		driver.manage().window().maximize();
		// find the search block and enter Coffee Mug 
		driver.findElement(By.name("search_query")).sendKeys("Coffee Mug", Keys.ENTER);

		List<WebElement> itemPrices = driver.findElements(By.xpath("//p[@class='wt-text-title-01 lc-price']"));
		Thread.sleep(1000);

		System.out.println("Numbers of items: " + itemPrices.size());

		// Loop through the list and get the price of each item:
		Thread.sleep(1000);
		for (int i = 0; i <= itemPrices.size(); i++) {

			System.out.println(itemPrices.get(i).getText());

		}

	}

}
