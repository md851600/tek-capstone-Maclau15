package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {


	public RetailSignInPage() {
		

PageFactory.initElements(getDriver(), this);

}
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id= "signinLink")
	public WebElement signInButton;
	
	@FindBy(id= "email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(xpath= "//button[@id='loginBtn']")
	public WebElement loginPageButton;
	
	@FindBy(xpath= "//a[@id='newAccountBtn']")
	public WebElement createNewAccountButton;
	
	@FindBy(id="nameInput")
	public WebElement signUpNameField;
	
	@FindBy(xpath= "//input[@id='emailInput']")
	public WebElement signUpEmailField;
	
	@FindBy(id= "passwordInput")
	public WebElement signUpPasswordField;
	
	@FindBy(xpath= "//input[@id='confirmPasswordInput']")
	public WebElement signUpConfirmPassField;
	
	@FindBy(xpath= "//button[@id='signupBtn']")
	public WebElement signUpFormButton;
	
	
}