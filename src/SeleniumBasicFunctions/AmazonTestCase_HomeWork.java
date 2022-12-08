package SeleniumBasicFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCase_HomeWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		AmazonTestCase_HomeWork obj = new AmazonTestCase_HomeWork(); 
		
		obj.VerifyElements();
		
	}
	
	
	public void VerifyElements() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		//go to amazon.com click on signin
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click(); 
		//verify that you are on sign in page (either by sign-in text or email field).
		
		boolean SignIn = driver.findElement(By.cssSelector("#ap_email")).isDisplayed(); 
		Thread.sleep(1000); 
		if(SignIn) {
			
			System.out.println("We are on the Sign In Page");
		}
		else {
			System.out.println("We are NOT on the Sign In page");
		}
		//navigate back, and navigate forward
		driver.navigate().back(); 
		Thread.sleep(1000); 
		driver.navigate().forward(); 
		//verify that you are on sign in page (either by sign-in text or email field).
		Thread.sleep(1000); 
		boolean SignIn2 = driver.findElement(By.cssSelector("#ap_email")).isDisplayed(); 
		if(SignIn2) {
			
			System.out.println("We are on the Sign In Page for the 2nd time");
		}
		else {
			System.out.println("We are NOT on the Sign In page for the 2nd time");
		}
		
		//click on create new account, verify you are on new account create page.
		driver.findElement(By.cssSelector("#createAccountSubmit")).click(); 
		Thread.sleep(1000); 
		boolean CreatePage = driver.findElement(By.cssSelector(".a-spacing-small")).isDisplayed(); 
		
		if(CreatePage) {	
			System.out.println("We are on the Create Account Page");
		}
		else {
			System.out.println("We are NOT on the Create Account Page");
		}
		//navigate back, verify you are on the sign-in page.
		
		driver.navigate().back(); 
		Thread.sleep(1000); 
		boolean SignIn3 = driver.findElement(By.cssSelector("#ap_email")).isDisplayed(); 
		if(SignIn3) {
			
			System.out.println("We are on the Sign In Page for the 3rd time");
		}
		else {
			System.out.println("We are NOT on the Sign In page for the 3rd time");
		}
		//navigate forward, verify you are on the create account page.
		Thread.sleep(1000); 
		driver.navigate().forward(); 
		
		//click on the Continue button without filling the form
		driver.findElement(By.cssSelector("#continue")).click(); 
		
		//verify error messages displayed and get text to verify:
		WebElement NameErrorMsg = driver.findElement(By.xpath("//div[contains(text(),'Enter your name')]"));
		Thread.sleep(2000); 
		if(NameErrorMsg.isDisplayed() && NameErrorMsg.getText().equals("Enter your name")){
			
			System.out.println("The Name Error Message is displayed and correct");
		}
		else {
			System.out.println("The Name error message is not correcet");
		}
		
		WebElement EmailErorMsg = driver.findElement(By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]"));
		Thread.sleep(2000); 
		if(EmailErorMsg.isDisplayed() && EmailErorMsg.getText().equals("Enter your email or mobile phone number")){
			
			System.out.println("The Email Error Message is displayed and correct");
		}
		else {
			System.out.println("The Email error message is not correcet");
		}
		
		WebElement PasswordErrorMsg = driver.findElement(By.xpath("//div[contains(text(),'Minimum 6 characters required')]")); 
		
		Thread.sleep(2000); 
		if(PasswordErrorMsg.isDisplayed() && PasswordErrorMsg.getText().equals("Minimum 6 characters required")){
			
			System.out.println("The Password Error Message is displayed and correct");
		}
		else {
			System.out.println("The Password error message is not correcet");
		}
		
	}

}
