package SeleniumBasicFunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		FindElementsPractice obj1 = new FindElementsPractice(); 	

		obj1.ListOfElements();
	}
	
	public void ListOfElements() throws InterruptedException {

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.findElement(By.cssSelector("input[id =twotabsearchtextbox]")).sendKeys("Coffe Mug", Keys.ENTER); 
		Thread.sleep(1000); 
		List <WebElement> CupsList = driver.findElements(By.cssSelector(".a-section.a-spacing-base")); 
		Thread.sleep(1000); 
		System.out.println(CupsList.size());
		
		if (CupsList.size() == 65) {
			
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.close(); 
	}

}
