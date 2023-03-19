  package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.SignInPage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);	
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
	click(factory.HomePage().signInButton);
	logger.info("User clicked on Sign in Option");
	}
		
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue){
	sendText(factory.SignInPage().emailField, emailValue);
	sendText(factory.SignInPage().passwordField, passwordValue);
	logger.info("User entered email "+ emailValue+ " and password "+ passwordValue);
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.SignInPage().loginPageButton);
		logger.info("User clicked on login button");
	}
	@Then("User should be logged in into Account")
	public void UserShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.HomePage().accountOption));

	}
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	  click(factory.SignInPage().createNewAccountButton);
	  logger.info("user clicked on Create New Account Button");
	  
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
	  List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
	  sendText(factory.SignInPage().signUpNameField,signUpInformation.get(0).get("name"));
	  sendText(factory.SignInPage().signUpEmailField,signUpInformation.get(0).get("email"));
	  sendText(factory.SignInPage().signUpPasswordField,signUpInformation.get(0).get("password"));
	  sendText(factory.SignInPage().signUpConfirmPassField,signUpInformation.get(0).get("confirmPassword"));
	  logger.info("user filled the SignUp information form");
	  
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	click(factory.SignInPage().signUpFormButton);
	 logger.info("user clicked on SignUpForm button");
				
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
	Assert.assertTrue(isElementDisplayed(factory.AccountPage().profileImage));
	
	logger.info("user is login into account page");
	
	}
}



