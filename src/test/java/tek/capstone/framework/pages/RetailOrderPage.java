package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		

		PageFactory.initElements(getDriver(), this);
	}
		
	
		@FindBy(xpath = "//a[@id='orderLink']")
		public WebElement orderLink;
				
		@FindBy(xpath="(//p[contains(text(),'Show Details')])[1]")
		public WebElement showDetails;
		
		@FindBy(xpath ="//button[@id='cancelBtn']")
		public WebElement cancelBtn;
		
		@FindBy(xpath = "//select[@id='reasonInput']")
		public WebElement reasonInput;
		
		@FindBy(xpath = "//button[@id='orderSubmitBtn']")
		public WebElement orderCancelBtnReason;
		
		@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
		public WebElement yourOrderHasBeenCancelled;
		
		@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
		public WebElement orderCancelMessage;
		
		@FindBy(xpath = "//button[@id='returnBtn']")
		public WebElement returnBtn;
		
		@FindBy(xpath = "//button[@id='orderSubmitBtn']")
		public WebElement returnOrderSubmit;
		
		@FindBy(xpath = "//select[@id='dropOffInput']")
		public WebElement dropOffInput;
		
		@FindBy(xpath="//p[contains(text(),'Return was successfull')]")
		public WebElement orderReturnSuccessMessage;
		
		@FindBy(xpath = "//button[@id='reviewBtn']")
		public WebElement reviewButton;
		
		@FindBy(xpath = "//input[@id='headlineInput']")
		public WebElement addReviewheadline;
		
		@FindBy(xpath = "//textarea[@id='descriptionInput']")
		public WebElement reviewDescription;
		
		@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
		public WebElement reviewSubmitButton;
		
		@FindBy(xpath = "//div[contains(text(),'Your review was added successfully')]")
		public WebElement reviewAddedSuccess;
		
}
