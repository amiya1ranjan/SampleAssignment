package com.sample.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample.qa.base.TestBase;

public class ContactPage extends TestBase{
	
	
	
	//Page Factory-OR
				
		@FindBy(xpath="//input[@placeholder='Your name..']")
		WebElement firstname;
		
		@FindBy(xpath="//input[@placeholder='Your last name..']")
		WebElement lastname;
		
		@FindBy(xpath="//input[@placeholder='Enter your Country']")
		WebElement country;
		
		@FindBy(xpath="//textarea[@placeholder='Write something..']")
		WebElement commentbox;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement submit;
		
		@FindBy(xpath="//a[@href='https://demoqa.com/html-contact-form/']")
		WebElement contact;
		
		
			
		
		
		
		//initializing the Page objects
		public ContactPage()
		{			PageFactory.initElements(driver, this);
			
		}
		
		public void submitform()
		{
			firstname.clear();
			firstname.sendKeys("fisrtname");
			
			lastname.clear();
			lastname.sendKeys("lastname");
			
			country.clear();
			country.sendKeys("India");
			
			commentbox.clear();
			commentbox.sendKeys("TestComment");
			
			submit.click();
		}
		public void NavigatetoContact()
		{
			contact.click();
			
		}

}
