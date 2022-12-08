package SeleniumBasicFunctions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import pages.EtsyHomePage;
import utils.DataReader;
import utils.Driver;

public class singletonTest {

	public static void main(String[] args) throws InterruptedException {
		//go to Etsy.com
		// We need to create an object of the homepage class
		EtsyHomePage etsyPage = new EtsyHomePage(); 
		
		Driver.getDriver().get(DataReader.getData("etsyUrl"));
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Hover Over on Jewelry & Accessories
		Actions action = new Actions(Driver.getDriver());
		
		action.moveToElement(etsyPage.jewelary).perform();
		Thread.sleep(1000);
		//Mouseover on Bags & Purses
		
		action.moveToElement(etsyPage.bagPurse).build().perform();
		Thread.sleep(1000);
		//Mouseover to Shoulder Bags
		//Click on the shoulder bags
		action.moveToElement(etsyPage.ShoulderBags).click().build().perform();
		Thread.sleep(1000);
		//Verify you are on the Shoulder bags page
				
	    if (etsyPage.shoulderbagText.getText().equalsIgnoreCase("shoulder bags")) {
			System.out.println("We are on the shoulder bags page.");
		}else {
			System.out.println("We are Not on the shoulder bags page.");
		}
	    
	    Driver.quitDriver();

	}

}
