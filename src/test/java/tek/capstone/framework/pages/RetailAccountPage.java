package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	
	public RetailAccountPage() {
		

		PageFactory.initElements(getDriver(), this);
}
	
	@FindBy(xpath= "//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(xpath= "//input[@id='nameInput']")
	public WebElement profileNameInputField;
	
	@FindBy(id= "personalPhoneInput")
	public WebElement profilePhoneNumberField;
	
	@FindBy(xpath= "//button[@id='personalUpdateBtn']")
	public WebElement profileUpdatedButton;
	
	@FindBy(xpath="//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement personalInfoUpdatedSuccessMessage;
	
	
	//UpdatePassword
	@FindBy(xpath="//input[@id='previousPasswordInput']")
	public WebElement previousPasswField;
	
	@FindBy(xpath= "//input[@id='newPasswordInput']")
	public WebElement NewPaswordField;
	
	@FindBy(xpath= "//input[@id='confirmPasswordInput']")
	public WebElement confirmPassword;
	
	@FindBy(xpath= "//button[@id='credentialsSubmitBtn']")
	public WebElement changePasswButton;
	
	@FindBy(xpath= "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passwordUpdatedSuccessfully;
		
	
	
	//addPayment
	@FindBy(xpath= "//p[contains(text(),'Add a payment method')]")
	public WebElement addPaymentMethodButton;
	
	@FindBy(xpath= "//input[@id='cardNumberInput']")	
	public WebElement cardNumberInput;
	
	@FindBy(id= "nameOnCardInput")	
	public WebElement nameOnCardInput;
	
	@FindBy(xpath= "//select[@id='expirationMonthInput']")
	public WebElement expirationMonthDropDown;
	
	@FindBy(xpath= "//select[@id='expirationYearInput']")
	public WebElement expirationYearDropDown;
	
	@FindBy(xpath= "//input[@id='securityCodeInput']")
	public WebElement securityCodeInput;
	
	@FindBy(xpath= "//button[@id='paymentSubmitBtn']")
	public WebElement addYourCardButton;
	
	@FindBy(xpath= "//div[contains(text()'Payment Method added sucessfully')]")
	public WebElement paymentMethodAddedSuccesfully;
	
	
	//EditDebitCard
	@FindBy(xpath= "//p[@class='account__payment-sub-title']")
	public WebElement accountPaymentEdit;
	
	@FindBy(xpath="(//button[@class='text-blue-800 cursor-pointer hover:underline'])[1]")
	public WebElement editCardOptionButton;
	
	@FindBy(xpath= "//button[@id='paymentSubmitBtn']")
	public WebElement updateYourCardButton;
	
	@FindBy(xpath= "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdatedSuccessfully;
	
		
	//@RemoveDebitCard
	@FindBy(xpath= "//button[contains(text(),'remove')]")
	public WebElement removeOptionButton;
	
	@FindBy(xpath="//div[@class= 'false account__payment-item']")
	public WebElement cardImagenlogo;
	
	//addAddres
	@FindBy(xpath= "//p[contains(text(),'Add Address')]")
	public WebElement addAddressOption;
	
	@FindBy(xpath= "//select[@id='countryDropdown']")
	public WebElement country;
	
	@FindBy(xpath= "//input[@id='fullNameInput']")
	public WebElement fullNameField;
	
	@FindBy(xpath= "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberField;
	
	@FindBy(xpath= "//input[@id='streetInput']")
	public WebElement streetAddressField;
	
	@FindBy(xpath= "//input[@id='apartmentInput']")
	public WebElement apartmentNumber;
	
	@FindBy(xpath= "//input[@id='cityInput']")
	public WebElement city;
	
	@FindBy(xpath= "(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateDropDown;
	
	@FindBy(xpath= "//input[@id='zipCodeInput']")
	public WebElement zipCodeField;
	
	@FindBy(id= "addressBtn")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath= "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addressAddedSuccessfully;

	
	//@EditAddress
	@FindBy(xpath= "//button[contains(text(),'Edit')]")
	public WebElement editAddressOption;
	
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement updateYourAddressButton;
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfully;
	
	//@RemoveAddress
	@FindBy(xpath= "//button[contains(text(),'Remove')]")
	public WebElement removeAddressButton;
	
	@FindBy(xpath= "//p[contains(text(),'Add Address')]")
	public WebElement addAddressLogo;
	
}