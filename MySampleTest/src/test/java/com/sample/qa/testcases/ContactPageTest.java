package com.sample.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sample.qa.base.TestBase;
import com.sample.qa.pages.ContactPage;
import com.sample.qa.pages.SelectPage;

public class ContactPageTest extends TestBase{
	
	ContactPage contactPage;
	public ContactPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setup()
	{
		initialization();
		contactPage=new ContactPage();
		}
	
	@Test
	public void SelectItemsTest()
	{
		
		contactPage.NavigatetoContact();
		contactPage.submitform();
		
		//Assert with successful  or Thank You Message
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

	

}
