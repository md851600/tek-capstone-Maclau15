package tek.capstone.framework.pages;

import tek.capstone.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private RetailHomePage homePage;
	private RetailSignInPage SignInPage;
	private RetailOrderPage OrderPage;
	private RetailAccountPage AccountPage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.SignInPage = new RetailSignInPage();
		this.OrderPage = new RetailOrderPage();
		this.AccountPage = new RetailAccountPage();

	}

	public RetailHomePage HomePage() {
		return homePage;
	}

	public RetailSignInPage SignInPage() {
		return SignInPage;
	}

	public RetailOrderPage OrderPage() {
		return OrderPage;
	}

	public RetailAccountPage AccountPage() {
		return AccountPage;
	}

}
