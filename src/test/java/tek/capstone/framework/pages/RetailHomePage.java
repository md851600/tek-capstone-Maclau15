package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{

	public RetailHomePage() {
		

PageFactory.initElements(getDriver(), this);

}
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
		
	@FindBy(xpath= "//a[@id='accountLink']")
	public WebElement accountOption;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement ALLIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath = "//div[@class= 'sidebar_content-item']/span")
	public List<WebElement> sideBarOptionsElements;
	
	
	@FindBy(xpath = "//select[@id='search']") 
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "div.main-container div:nth-child(1) div.bg-gray-100 div.products > div.products__layout")
	public WebElement objectToClick;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	public WebElement addQuantity;
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQuantiyUpdate;
	
	
	
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//span[contains(text(),'Smart Home Lightning')]")
	public WebElement smartHomeLightningBar;
	
	
	@FindBy(xpath = "//pre[contains(text(),'Outdoor Smart Plug')]")
	public WebElement itemKasaOutdoor;
	
	@FindBy (xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement kasaProductImage;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement QTYbar;

    @FindBy(xpath = "//p[contains(text(),'Cart')]")
    public WebElement addToCartBtn;
    
    @FindBy(xpath= "//span[@id='cartQuantity']")
    public WebElement cartQty;
    
    @FindBy(id ="proceedBtn")
    public WebElement checkOutBtn;
    
    @FindBy(xpath = "//button[@id='addAddressBtn']")
  	public WebElement addAddressBtn;
  
  
    @FindBy(xpath = "//button[@id='addPaymentBtn']")
    public WebElement addPaymentBtn;
    
   @FindBy(xpath = "//button[@id='placeOrderBtn']")
   public WebElement placeOrderBtn;
   
   @FindBy(xpath = "//pre[contains(text(),'x Legends - 1,000 Apex Coins')]")
   public WebElement iitemApexLegends;
    
    
}
