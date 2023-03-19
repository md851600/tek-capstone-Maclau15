package tek.capstone.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrder extends CommonUtility {

	private POMFactory factory = new POMFactory();

	// cancelOrder
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.OrderPage().orderLink);
		logger.info("User clicked on Order section");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.OrderPage().showDetails);
		logger.info("User clicked on first order in list");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.OrderPage().cancelBtn);
		logger.info("User clicked on Cancel The Order button");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
		selectByVisibleText(factory.OrderPage().reasonInput, string);
		logger.info("User selected the cancelation Reason");
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.OrderPage().orderCancelBtnReason);
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String expectedMessage) {
		if (expectedMessage.contains("Your Order Has Been Cancelled")) {
			isElementDisplayed(factory.OrderPage().orderCancelMessage);
			Assert.assertEquals(expectedMessage, factory.OrderPage().orderCancelMessage.getText());
			logger.info("Cancelation message displayed");

		} else if (expectedMessage.contains("Return was successful")) {
			isElementDisplayed(factory.OrderPage().orderReturnSuccessMessage);
			// Assert.assertEquals(expectedMessage,
			// factory.OrderPage().orderReturnSuccessMessage.getText());
			logger.info("Cancelation message displayed");
		}

		// ReturnOrder
	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.OrderPage().returnBtn);
		logger.info("User clicked on Return Items button");
	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		selectByVisibleText(factory.OrderPage().reasonInput, string);
		logger.info("User selected the Return Reason");
	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.OrderPage().dropOffInput, string);
		logger.info("User selected the drop off service");
	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.OrderPage().returnOrderSubmit);
	}

	// ReviewOrder

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.OrderPage().reviewButton);
		logger.info("User clicked on Review button");
	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) throws InterruptedException {
		sendText(factory.OrderPage().addReviewheadline, string);
		sendText(factory.OrderPage().reviewDescription, string2);
		Thread.sleep(3000);
		logger.info("User write Review headline and Description");
	}

	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() throws InterruptedException {
		click(factory.OrderPage().reviewSubmitButton);
		Thread.sleep(3000);
		logger.info("User clicked Add your Review button");
	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expectedMessage) {
		Assert.assertEquals(expectedMessage, factory.OrderPage().reviewAddedSuccess.getText());
		logger.info("Review message should be displayed");
	}
}