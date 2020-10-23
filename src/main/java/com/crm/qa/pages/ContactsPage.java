package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//div[contains(text(),'Contacts')]")
	WebElement contactsText;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement last_name;
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement middle_name;
	
	@FindBy(xpath="//div[@name='company']")
	WebElement company_name;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveButton;
	
	public ContactsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCorrectContactsPage(){
		return contactsText.isDisplayed();
	}
	
	public void selectContacts(){
		driver.findElement(By.xpath("//div[@class='ui fitted read-only checkbox']")).click();
	}
	
	public void createNewContact(String first_N,String last_N,String middle_N){
		first_name.sendKeys(first_N);
		last_name.sendKeys(last_N);
		middle_name.sendKeys(middle_N);
		//company_name.sendKeys(company_N);
		saveButton.click();
	}

}
