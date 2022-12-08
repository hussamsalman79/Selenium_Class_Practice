package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class EtsyHomePage {

	// Why create constructor? 
	//we created a constructor of a class to implement or force something when the object of the class created 
	public EtsyHomePage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
		@FindBy(xpath="//span[contains(text(), 'Jewelry & Accessories')]")
		public WebElement jewelary; 
		
		@FindBy(xpath="(//span[contains(text(), 'Bags & Purses')])[1]")
		public WebElement bagPurse;  
		
		@FindBy (xpath="(//a[contains(text(), 'Shoulder Bags')])")
		public WebElement ShoulderBags; 
		
		@FindBy(xpath="//span[contains(text(), 'Shoulder Bags')]")
		public WebElement shoulderbagText; 
		
		
}
