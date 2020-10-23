package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement userDisplayName;
	
	@FindBy(xpath="//span[@class='item-text' and text()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[@class='item-text' and text()='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath="//button[text()='New']")
	WebElement newButton;


	//initializing the page objects
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
//	public String verifyHomePageTitle(){
//		return driver.getTitle();
//	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}

	public String verifyHomePageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	public boolean verifyCorrectUsername(){
		return userDisplayName.isDisplayed();
	}
	
	public void clickOnNewDealsLink(){
		newButton.click();
	}

	public void ClickOnNewContactLink(){
		newButton.click();
	}
		
	}


