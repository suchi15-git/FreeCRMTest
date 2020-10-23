package com.crm.qa.testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	Logger log = Logger.getLogger(LoginPageTest.class);

	public LoginPageTest(){
		super();
	}


	@BeforeMethod
	public void setUp(){
		initialization();
		log.info("Lunched chrome browser");
		loginPage= new LoginPage();
	}


	@Test(priority=1)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));


	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
