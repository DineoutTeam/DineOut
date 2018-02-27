package pom;

import org.openqa.selenium.JavascriptExecutor;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.html.DomComment;
import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

import generic.AUL_Lib;
import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;

public class Party_Booking {
	@FindBy(xpath="//input[@id='location']")
	private WebElement Enter_Location;
	
	@FindBy(xpath="//label[@for='birthday']")
	public WebElement Birthday;
	
	@FindBy(xpath="//label[@for='wedding']")
	public WebElement Wedding ;
	
	@FindBy(xpath="//label[@for='team']")
	private WebElement Team_Party ;
	
	@FindBy(xpath="//label[@for='social']")
	private WebElement Social_Gathering ;
	
	@FindBy(xpath="//label[@for='other']")
	private WebElement Others;
	
	@FindBy(name="occasionOther")
	private WebElement occasion_name;
	
	@FindBy(name="partydate")
	private WebElement Calender;
	
	@FindBy(xpath="//label[@for='lunch']")
	private WebElement Lunch_Time;
	
	@FindBy(name="//label[@for='dinner']")
	private WebElement Dinner_Time;
	
	@FindBy(xpath="//label[@for='vegetarian']")
	private WebElement Vegetarian;
	
	@FindBy(xpath="//label[@for='n-vegetarian']")
	private WebElement Non_Vegetarian;
	
	@FindBy(xpath="//label[@for='alcohol']")
	private WebElement Alcohol;
	
	@FindBy(xpath="//select[@id='men']")
	private WebElement Men;
	
	@FindBy(xpath="//select[@id='women']")
	private WebElement  Woman;
	
	
	@FindBy(xpath="//select[@id='kids']")
	private WebElement  Kids;
	
	@FindBy(xpath="//label[@for='filled-in-box2']")
	private WebElement  Rs500toRs700;
	
	
	@FindBy(xpath="//label[@for='filled-in-box4']")
	private WebElement  Rs1500toRs2500;
	
	@FindBy(xpath="//label[@for='filled-in-box6']")
	private WebElement  Rs3500toRs4000;
	
	@FindBy(xpath="//label[@for='filled-in-box3']")
	private WebElement  Rs700toRs1500;
	
	@FindBy(xpath="//label[@for='filled-in-box5']")
	private WebElement  Rs2500toRs3500;
	
	@FindBy(xpath="//label[@for='tc']")
	private WebElement   Terms_Conditions;
	
	@FindBy(xpath="//a[text()='Get Quotations']")
	private WebElement   Get_Quotations;
	
	@FindBy(xpath="//h4[text()='Party Enquiry!']")
	private WebElement   PartyEnquiry;
	
	
	public Party_Booking(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterLocation(String location )
	{
		Enter_Location.sendKeys(location);
	}
	

	public void Birthday_occasion()
	{
		Birthday.click();
	}
	
	public void Wedding_occasion()
	{
		Wedding.click();
	}
	
	public void Team_Party_occasion()
	{
		Team_Party.click();
	}
	
	public void Social_Gathering_occasion()
	{
		Social_Gathering.click();
	}
	
	
	public void others_Occasion(String occasion)
	{
		Others.click();
		if(Others.isSelected())
		{
		occasion_name.sendKeys(occasion);
		
		}

	}
	public void partydate(WebDriver driver)
	{
		JavascriptExecutor j= (JavascriptExecutor)driver;
	String s="document.getElementById('partydate').value='27/02/2018'";
	j.executeScript(s);

	}
	public void Party_Date(WebDriver driver)
	{
		int x=Calender.getLocation().getX();
		System.out.println("Location x"+x);
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+",0);");
		Actions a= new Actions(driver);
		a.moveToElement(Calender);
		//Calender.sendKeys(date);
	}
	
	public void Lunch_Time()
	{
		Lunch_Time.click();
	}
	
	public void Dinner_Time()
	{
		Dinner_Time.click();
	}
	
	public void VegFood()
	{
		Vegetarian.click();
	}
	public void NonVegFood()
	{
		Non_Vegetarian.click();
	}
	public void Alchol()
	{
		Alcohol.click();
	}
	public void MenCount(WebDriver driver,String value)
	{
		Select s= new Select(Men);
		s.selectByValue(value);
	}
	
	public void WomenCount(WebDriver driver,String value)
	{
		Select s= new Select(Woman);
		s.selectByValue(value);
	}
	
	public void KidsCount(WebDriver driver,String value)
	{
		Select s= new Select(Kids);
		s.selectByValue(value);
	}
	
	public void Rs500toRs700()
	{
		Rs1500toRs2500.click();
	}
	
	public void Terms_condition()
	{
		Terms_Conditions.click();
	}
	public void GetQuoted()
	{
		Get_Quotations.click();
	}
	public void PartyEnquire(WebDriver driver)
	{
	WebDriverWait wait= new WebDriverWait(driver, 10);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(PartyEnquiry));
		Reporter.log("Party Booking not done");
	}
	catch(Exception e)
	{
		Reporter.log("Party Booking error");
	}
	}
	
}
