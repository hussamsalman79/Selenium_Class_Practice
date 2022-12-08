package Selenium_HomeWork;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWaitPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		
		driver.get("https://demoqa.com/alerts"); 
		
		driver.findElement(By.id("timerAlertButton")).click(); 
		
		WebDriverWait letsWait = new WebDriverWait(driver,6); 
		letsWait.until(ExpectedConditions.alertIsPresent()); 
		
		Alert handle = driver.switchTo().alert(); 
		System.out.println(handle.getText());
		handle.accept(); 

	}

}
