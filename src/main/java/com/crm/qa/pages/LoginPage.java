package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Page Factory - Object Repository
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginButton;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle(){
		return driver.getCurrentUrl();
		
	}
	
	public HomePage login(String un, String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		loginButton.click();
		
		return new HomePage();
		
	}
}
