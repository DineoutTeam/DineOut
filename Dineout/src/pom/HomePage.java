package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.AUL_Lib;

public class HomePage {
	
	@FindBy(xpath="//span[.='Bangalore']")
	private WebElement city;
	
	@FindBy(css="do do-angle-down arrow")                   //declaration
	private WebElement SearchArrow;
	@FindBy(xpath=" Search")
	private WebElement SearchButton;
	@FindBy(xpath="//input[@id='searchID']")
	private WebElement SearchBox;
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement Login;
	@FindBy(id="input")
	private WebElement MobEmailTB;
	
	@FindBy(xpath="//button[@id='userNameBtn']")
	private WebElement Continue;
	@FindBy(id="phonepassword")
	private WebElement passwordTB;
	@FindBy(id="loginBtn")
	private WebElement loginBTN;
	@FindBy(xpath="//a[contains(@data-city,'Delhi')]")
	private WebElement DelhiLocation;
	@FindBy(xpath="//a[contains(@data-city,'Mumbai')]")
	private WebElement MumbaiLocation;
	@FindBy(xpath="//a[contains(@data-city,'Bangalore')]")
	private WebElement BangaloreLocation;
	@FindBy(xpath="//a[contains(@data-city,'Chennai')]")
	private WebElement ChennaiLocation;
	@FindBy(xpath="//a[contains(@data-city,'Hyderabad')]")
	private WebElement HyderabadLocation;
	@FindBy(xpath="//a[contains(@data-city,'Pune')]")
	private WebElement PuneLocation;
	@FindBy(xpath="//a[contains(@data-city,'Kolkata')]")
	private WebElement KolkataLocation;
	@FindBy(xpath="//a[contains(@data-city,'Ahmedabad')]")
	private WebElement AhmedabadLocation;
	@FindBy(xpath="//a[contains(@href,'discount-on-food') and@class='link-overlay']")
	private WebElement OffFood;
	@FindBy(xpath="//a[contains(@href,'discount-on-drinks') and@class='link-overlay']")
	private WebElement OffAlcohol;
	@FindBy(xpath="//a[contains(@href,'buffet-deals') and@class='link-overlay']")
	private WebElement OffBuffet;
	@FindBy(xpath="//a[contains(@href,'5 Star') and@class='link-overlay']")
	private WebElement Star5;
	
	@FindBy(xpath="//a[text()='Party Booking']")
	private WebElement PartyBooking;
	
	public HomePage(WebDriver driver){                      //initialization
		PageFactory.initElements(driver, this);
	}
	public void clickOnSearchArrow(){
		SearchArrow.click();
	}
	public void clickOnSearchButton(){
		SearchButton.click();
	}
	public void clickOnSearchBox(){
		SearchBox.click();
	}
	public void clickCity()
	{
		city.click();
	}
	public void clickOnLogin(){
		Login.click();
	}
	public void setMobOrEmail(String un){
		MobEmailTB.sendKeys(un);
	}
	public void setPassword(String pw){
		passwordTB.sendKeys(pw);
	}
	
	public void ClickOnContinue(){
		Continue.click();
	}
	public void clickOnLoginBTN(){
		loginBTN.click();
	}
	public void ClickPartyBooking()
	{
		PartyBooking.click();
	}
	public void clickOnDelhiLocation(WebDriver driver){
		AUL_Lib.clickElement(driver, DelhiLocation);
	}
	public void clickOnMumbaiLocation(WebDriver driver){
		AUL_Lib.clickElement(driver, MumbaiLocation);
	}
	public void clickOnBAngaloreLocation(WebDriver driver){
		AUL_Lib.clickElement(driver, BangaloreLocation);
	}
	public void clickOnChennaiLocation(WebDriver driver){
		AUL_Lib.clickElement(driver, ChennaiLocation);
	};
	public void clickOnHyderabadLocation(WebDriver driver){
		AUL_Lib.clickElement(driver, HyderabadLocation);
	}
	public void clickOnPuneLocation(WebDriver driver){
		AUL_Lib.clickElement(driver, PuneLocation);
	}
	public void clickOnKolkataLocation(WebDriver driver){
		AUL_Lib.clickElement(driver, KolkataLocation);
	}
	public void clickOnAhmedabadLocation(WebDriver driver){
		AUL_Lib.clickElement(driver, AhmedabadLocation);
	}
	
}

