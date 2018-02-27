package script;

import org.testng.annotations.Test;

import generic.AUL_Lib;
import generic.BaseTest;
import pom.HomePage;
import pom.Party_Booking;

public class TestPartyBooking extends BaseTest {

	@Test
	public void test_Party_Booking() throws InterruptedException
	{
	
		HomePage h= new HomePage(driver);
		h.clickCity();
		h.clickOnLogin();
		h.setMobOrEmail("9538708662");
		h.ClickOnContinue();
		h.setPassword("ShwethaPriya1");
		Thread.sleep(2000);
		h.clickOnLoginBTN();
		Thread.sleep(10000);
		h.ClickPartyBooking();
		Party_Booking p=new Party_Booking(driver);
		//enter Location
		p.EnterLocation("Bangalore Mangalore Highway, UB City");
		//select occasion
		p.Birthday_occasion();
		//select date
		//p.Party_Date("27/02/2018");
		Thread.sleep(1000);
		//p.partydate(driver);
		//selecttime
		p.Lunch_Time();
		//food options
		p.VegFood();
		//guest count
		p.MenCount(driver, "10");
		p.WomenCount(driver, "5");
		p.KidsCount(driver, "15");
		//cost per head
		p.Rs500toRs700();
		//accept terms & condition
		p.Terms_condition();
		//Quotation
		p.GetQuoted();
		Thread.sleep(3000);
		p.PartyEnquire(driver);
		
	}
}