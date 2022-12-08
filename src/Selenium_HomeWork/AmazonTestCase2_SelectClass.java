package Selenium_HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonTestCase2_SelectClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");

		AmazonTestCase2_SelectClass obj = new AmazonTestCase2_SelectClass();

		obj.DropListTestCase();

	}

	public void DropListTestCase() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// go to amazon.com
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		// verify that you are on the amazon home page. (verify with title).

		//driver.findElement(By.xpath("//title[text()='Amazon.com. Spend less. Smile more.']"));
		String HomePageTitle = driver.getTitle();
		System.out.println(HomePageTitle);

		Thread.sleep(1000);
		if (HomePageTitle.equals("Amazon.com. Spend less. Smile more.")) {

			System.out.println("We are on the Home Page");
		} else {
			System.out.println("We are not on the Home Page");
		}
		// verify Drop down value is by default “All Department”

		WebElement DropList = driver.findElement(By.cssSelector("#searchDropdownBox"));
		Select DropListSelect = new Select(DropList);
		
		WebElement FirstOption =DropListSelect.getFirstSelectedOption(); 
		Thread.sleep(1000);
		if(FirstOption.getText().equals("All Departments")) {
			System.out.println("Default is match");
		}
		else {
			System.out.println("Default is NOT match");
		}
		//Select department Home & Kitchen and search coffee mug
		Thread.sleep(1000);
		DropListSelect.selectByVisibleText("Home & Kitchen");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Coffee Mug", Keys.ENTER);

		// verify you are on coffee mug search results page (use title).
		Thread.sleep(1000);
		String CoffeMugPage = driver.getTitle();
		if (CoffeMugPage.equals("Amazon.com : Coffee Mug")) {

			System.out.println("We are on the Coffee Mug  Page");
		} else {
			System.out.println("We are NOT on the Coffe Mug Page");
		}
		Thread.sleep(1000);
		
		// verify you are in Home & Kitchen department.
		String HomeKitchenPage = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[36]")).getText(); 
	
		Thread.sleep(1000);
		if (HomeKitchenPage.equals("Home & Kitchen")) {
			System.out.println("We are at Home AND Kitchen department Page ");
		}
		else {
			System.out.println("We are NOT at Home AND Kitchen department Page ");
		}
		Thread.sleep(1000);
		driver.close(); 
	}

}
