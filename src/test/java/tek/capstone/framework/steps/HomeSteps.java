package tek.capstone.framework.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;
import tek.capstone.framework.utilities.DataGeneratorUtility;

public class HomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.HomePage().ALLIcon);
		logger.info("user clicked on All section");

	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);

		List<WebElement> actualSideBar = factory.HomePage().sideBarOptionsElements;

		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			logger.info("actualSideBar.get(i).getText() + is equal to " + expectedSideBar.get(0).get(i));
		}
	}

	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> sideBarOptions = factory.HomePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + "is present");
				} catch (StaleElementReferenceException e) {
				}
				break;
			}
		}
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.HomePage().sideBarElements;

		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {

					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + "is present");

				}

			}

		}
	}

	// addItem
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String select) {
		selectByVisibleText(factory.HomePage().allDepartmentDropDown, select);
//		click(factory.HomePage().ALLIcon);
//		click(factory.HomePage().smartHomeSideBar);
		logger.info("User changed the category to" + select);

//	@When("User click on Search icon")
//	public void userClickOnSearchIcon() {
//		click(factory.HomePage().smartHomeLightningBar);
//		click(factory.HomePage().searchButton);
//		logger.info("User clicked on Search icon");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String productValue) {
		sendText(factory.HomePage().searchBar, productValue);
		// click(factory.HomePage().itemKasaOutdoor);
		logger.info("User searched for the item" + productValue);
	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.HomePage().searchButton);
		logger.info("User clicked on Search icon");

	}

	@When("User click on item")
	public void userClickOnItem() {
		 click(factory.HomePage().objectToClick);
		//click(factory.HomePage().kasaProductImage);
		logger.info("User clicked on item");
	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
		selectByValue(factory.HomePage().QTYbar,string);
		logger.info("User selected the quantity");

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.HomePage().addToCartBtn);
		logger.info("User clicked on add to cart button");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
		Assert.assertTrue(isElementDisplayed(factory.HomePage().cartQty));
		logger.info("the cart icon quantity changed");
	}

	// placeAnOrder
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.HomePage().addToCartBtn);
		logger.info("User clicked on add to Cart option");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.HomePage().checkOutBtn);
		logger.info("User clicked on Proceed to Checkout button");
	}

	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.HomePage().addAddressBtn);
		logger.info("User clicked on Add a new address link for shipping address");
	}

	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) throws InterruptedException {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		selectByVisibleText(factory.AccountPage().country, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		sendText(factory.AccountPage().fullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		sendText(factory.AccountPage().phoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		sendText(factory.AccountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		sendText(factory.AccountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		sendText(factory.AccountPage().city, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		selectByVisibleText(factory.AccountPage().stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		sendText(factory.AccountPage().zipCodeField, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
		Thread.sleep(5000);
		logger.info("user filled the new addres form with information provided in data table ");

	}

	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.HomePage().addPaymentBtn);
		logger.info("User clicked on Add a credit card or Debit Card for Payment method");
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.HomePage().placeOrderBtn);
		logger.info("User clicked on Place Your Order");
	}

	// placeAnOrder2
//	@When("User change the category to 'Electronics")
//	public void userChangeTheCategoryToElectronics() {
//
//	}
}
