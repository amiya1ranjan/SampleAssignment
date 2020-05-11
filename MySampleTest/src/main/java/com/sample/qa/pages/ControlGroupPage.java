package com.sample.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample.qa.base.TestBase;

public class ControlGroupPage extends TestBase{
	
	
	
	//Page Factory-OR
	
			@FindBy(xpath="//*[@id='car-type-button']/span[2]")
			WebElement car;
			
			@FindBy(xpath="//*[@id='ui-id-2']")
			WebElement selectcarType;
			
			@FindBy(xpath="//*[@id='content']/div[2]/div/fieldset[1]/div/label[2]")
			WebElement automatic;
			
			@FindBy(xpath="//*[@id='content']/div[2]/div/fieldset[1]/div/label[3]")
			WebElement insurance;
			
			@FindBy(xpath="//span/input[@id='horizontal-spinner']")
			WebElement NumofCars;
			
			
			
			@FindBy(xpath="//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right' and text()='Book Now!']")
			WebElement book;
			
			@FindBy(xpath="//a[@href='https://demoqa.com/controlgroup/']")
			WebElement controlgroup;
			
				
			
			
			
			//initializing the Page objects
			public ControlGroupPage()
			{			PageFactory.initElements(driver, this);
				
			}
			
			public void bookCar()
			{
				car.click();
				selectcarType.click();
				automatic.click();
				insurance.click();
				NumofCars.sendKeys("1");
				book.click();
							
				
			}

			
			public void NavigatetoControlGroup()
			{
				controlgroup.click();
				
			}
}
