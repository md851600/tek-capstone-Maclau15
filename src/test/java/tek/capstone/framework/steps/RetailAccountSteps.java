package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;
import tek.capstone.framework.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	// updated information
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.HomePage().accountOption);
		logger.info("user clicked on Account option");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameNameValueAndPhonePhoneValue(String name, String phone) {
		clearTextUsingSendKeys(factory.AccountPage().profileNameInputField);
		sendText(factory.AccountPage().profileNameInputField, DataGeneratorUtility.data(name));
		clearTextUsingSendKeys(factory.AccountPage().profilePhoneNumberField);
		sendText(factory.AccountPage().profilePhoneNumberField, DataGeneratorUtility.data(phone));
		logger.info("user updated Name and phone values");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.AccountPage().profileUpdatedButton);
		logger.info("user clicked on Update button");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.AccountPage().personalInfoUpdatedSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().personalInfoUpdatedSuccessMessage));
		logger.info("user profile information Update");

	// updated password
	}

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> changePasswInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.AccountPage().previousPasswField, DataGeneratorUtility.credentials(changePasswInformation.get(0).get("previousPassword")));
		sendText(factory.AccountPage().NewPaswordField, DataGeneratorUtility.credentials(changePasswInformation.get(0).get("newPassword")));
		sendText(factory.AccountPage().confirmPassword, DataGeneratorUtility.credentials(changePasswInformation.get(0).get("confirmPassword")));
		logger.info("user filled the new Password information form");
	}
	
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.AccountPage().changePasswButton);
		logger.info("user clicked on change password Button");

	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().passwordUpdatedSuccessfully));
		logger.info("user is login into account page");
	}

	// add payment
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.AccountPage().addPaymentMethodButton);
		logger.info("User clicked on payment method link");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> creditCardInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.AccountPage().cardNumberInput, creditCardInfo.get(0).get("cardNumber"));
		sendText(factory.AccountPage().nameOnCardInput, creditCardInfo.get(0).get("nameOnCard"));
		selectByValue(factory.AccountPage().expirationMonthDropDown, creditCardInfo.get(0).get("expirationMonth"));
		selectByValue(factory.AccountPage().expirationYearDropDown, creditCardInfo.get(0).get("expirationYear"));
		sendText(factory.AccountPage().securityCodeInput, creditCardInfo.get(0).get("securityCode"));
		logger.info("User fill Debit or credit card information");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.AccountPage().addYourCardButton);
		logger.info("user click on Add your card button");
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().paymentMethodAddedSuccesfully));
		logger.info("user is login into account page");
	}

	// EditDebitCard
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() throws InterruptedException {
		click(factory.AccountPage().accountPaymentEdit);
		click(factory.AccountPage().editCardOptionButton);
		Thread.sleep(4000);
		logger.info("user clicked on Edit option of card section");

	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> creditCardInfo = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.AccountPage().cardNumberInput);
		sendText(factory.AccountPage().cardNumberInput, creditCardInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.AccountPage().nameOnCardInput);
		sendText(factory.AccountPage().nameOnCardInput, creditCardInfo.get(0).get("nameOnCard"));
		clearTextUsingSendKeys(factory.AccountPage().expirationMonthDropDown);
		selectByValue(factory.AccountPage().expirationMonthDropDown, creditCardInfo.get(0).get("expirationMonth"));
		clearTextUsingSendKeys(factory.AccountPage().expirationYearDropDown);
		selectByValue(factory.AccountPage().expirationYearDropDown, creditCardInfo.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.AccountPage().securityCodeInput);
		sendText(factory.AccountPage().securityCodeInput, creditCardInfo.get(0).get("securityCode"));
		logger.info("user edit information with below data");
		Thread.sleep(2000);

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.AccountPage().updateYourCardButton);
		logger.info("user click on Update Your Card button");
	}

	
	// @RemoveDebitCard
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.AccountPage().accountPaymentEdit);
		click(factory.AccountPage().removeOptionButton);
		logger.info("User click on remove option of card section");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().cardImagenlogo));
		logger.info("payment details removed");

	}

	// add address
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.AccountPage().addAddressOption);
		logger.info("user clicked on Add address option");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) throws InterruptedException {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		selectByVisibleText(factory.AccountPage().country, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		clearTextUsingSendKeys(factory.AccountPage().fullNameField);
		sendText(factory.AccountPage().fullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		clearTextUsingSendKeys(factory.AccountPage().phoneNumberField);
		sendText(factory.AccountPage().phoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		clearTextUsingSendKeys(factory.AccountPage().streetAddressField);
		sendText(factory.AccountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		clearTextUsingSendKeys(factory.AccountPage().apartmentNumber);
		sendText(factory.AccountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		clearTextUsingSendKeys(factory.AccountPage().city);
		sendText(factory.AccountPage().city, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		clearTextUsingSendKeys(factory.AccountPage().stateDropDown);
		selectByVisibleText(factory.AccountPage().stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		clearTextUsingSendKeys(factory.AccountPage().zipCodeField);
		sendText(factory.AccountPage().zipCodeField, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
		Thread.sleep(5000);
		logger.info("user filled the new addres form with information provided in data table ");

	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() throws InterruptedException {
		click(factory.AccountPage().addYourAddressButton);
		Thread.sleep(5000);
		logger.info("user clicked on Add your Address button");

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		if (expectedMessage.contains("Address Updated")) {
			waitTillPresence(factory.AccountPage().addressUpdatedSuccessfully);
			Assert.assertEquals(expectedMessage, factory.AccountPage().addressUpdatedSuccessfully.getText());
			
		} else if (expectedMessage.contains("Payment Method updated Successfully")){
			waitTillPresence(factory.AccountPage().paymentMethodUpdatedSuccessfully);
			Assert.assertEquals(expectedMessage, factory.AccountPage().paymentMethodUpdatedSuccessfully.getText());
		}
		
	}

	// @EditAddres
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.AccountPage().editAddressOption);
		logger.info("User click on edit address option");
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.AccountPage().addYourAddressButton);
		logger.info("User clicked update Your Address button");
	}
	
	// @RemoveAddress
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() throws InterruptedException {
		click(factory.AccountPage().removeAddressButton);
		Thread.sleep(2000);
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().addAddressLogo));
		logger.info("Address details has been removed");
		

	}

}
