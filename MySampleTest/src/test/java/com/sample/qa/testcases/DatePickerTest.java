package com.sample.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sample.qa.base.TestBase;
import com.sample.qa.pages.DatePickerPage;


public class DatePickerTest extends TestBase{
	
	
	
	DatePickerPage datePickerPage;
	
	public DatePickerTest() {
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		datePickerPage=new DatePickerPage();
		}
	
	@Test
	public void SelectItemsTest()
	{
		datePickerPage.selectDatePicker();
		
		// Assert.assertEquals(true, true);
	}

}
