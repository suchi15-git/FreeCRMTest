package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase {
	
	@FindBy(xpath="//input[@name='title']")
	WebElement title;
	
	@FindBy(xpath="//div[@class='divider text']")
	WebElement assignTo;
	
	@FindBy(xpath="//div[@name='company']")
	WebElement company;
	
	@FindBy(xpath= "//div[@name='products']")
	WebElement products;
	
	@FindBy(xpath="//div[@name='contacts']")
	WebElement contacts;
	
	@FindBy(xpath="//div[@class='react-datepicker__input-container']")
	WebElement datePicker;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveButton;
	
	
	public DealsPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void fillDealsPpage(String title_value,String company_value,String closedDate_value){
		//clickOnNewDealsLink();
		title.click();
		title.sendKeys(title_value);
		company.sendKeys(company_value);
		datePicker.sendKeys(closedDate_value);
		saveButton.click();
	}
	
}
