package com.crm.qa.testcases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class DealsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil = new TestUtil();
	ContactsPage contactsPage = new ContactsPage();
	DealsPage dealsPage= new DealsPage();
	
	public DealsPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		TestUtil testUtil = new TestUtil();
		ContactsPage contactsPage = new ContactsPage();
		DealsPage dealsPage= new DealsPage();
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		dealsPage = homePage.clickOnDealsLink();
		
	}
	
	@Test(priority=1)
	public void addNewDeal(){
		//homePage.clickOnNewDealsLink();
		//homePage.clickOnDealsLink();
		homePage.clickOnNewDealsLink();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		dealsPage.fillDealsPpage("BestOffer", "Sterling", "20/20/2020");
	}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
