package com.crm.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil = new TestUtil();
	ContactsPage contactsPage = new ContactsPage();
	
	public ContactsPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage = homePage.clickOnContactsLink();
		
	}
	
//	@Test(priority=1)
//	public void verifyContactsPageLanded(){
//		Assert.assertTrue(contactsPage.verifyCorrectContactsPage());
//		
//	}
	
	@Test(priority=1)
	public void checkExistingContact(){
		contactsPage.selectContacts();
	}
	
	@DataProvider
	public Object[][] getTestData(){
		Object data [][]= TestUtil.getTestData("Sheet1");
		return data;
	}
	@Test(dataProvider ="getTestData" )
	public void fillNewContactInfor(String firs_N,String last_N,String middle_N){
		homePage.ClickOnNewContactLink();
		contactsPage.createNewContact(firs_N,last_N,middle_N);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
