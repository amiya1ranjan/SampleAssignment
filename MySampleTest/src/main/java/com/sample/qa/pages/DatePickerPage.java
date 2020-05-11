package com.sample.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample.qa.base.TestBase;

public class DatePickerPage extends TestBase{
	
	
	//Page Factory-OR
	
	@FindBy(xpath="//input[@type='text']")
	WebElement date;
	
	@FindBy(xpath="//a[@href='https://demoqa.com/datepicker/']")
	WebElement Datepicker;
	
	
		
	
	
	
	//initializing the Page objects
	public DatePickerPage()
	{			PageFactory.initElements(driver, this);
		
	}
	
	public void selectDatePicker()
	{
		
		date.sendKeys("01/07/1987");
	}

	public void NavigatetoDatePicker()
	{
		Datepicker.click();
		
	}

}
