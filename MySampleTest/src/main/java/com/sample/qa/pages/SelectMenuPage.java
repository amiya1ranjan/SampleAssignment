package com.sample.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sample.qa.base.TestBase;

public class SelectMenuPage extends TestBase{
	
	//Page Factory-OR
		
	/*
	 * @FindBy(xpath="//span[@id='speed-button']") WebElement selectSpeed1;
	 * 
	 * @FindBy(xpath="//li/div[@id='ui-id-1']") WebElement selectSpeedvalue1;
	 * 
	 * 
	 * @FindBy(xpath="//span[@id='files-button']") WebElement selectfiles1;
	 * 
	 * @FindBy(xpath="//li/div[@id='ui-id-7']") WebElement selectfilevalue1;
	 * 
	 * 
	 * @FindBy(xpath="//span[@id='number-button']") WebElement selectNumber1;
	 * 
	 * @FindBy(xpath="//li/div[@id='ui-id-3']") WebElement selectNumbervalue1;
	 * 
	 * 
	 * @FindBy(xpath="//span[@id='salutation-button']") WebElement selectTitle1;
	 * 
	 * @FindBy(xpath="//li/div[@id='ui-id-23']") WebElement selectTitlevalue;
	 */
		//initializing the Page objects
		public SelectMenuPage()
		{
			PageFactory.initElements(driver, this);
			
		}
		public void selectMenuItems() {
			//test
			System.out.println("startred");
			//Select sel=new Select(selectSpeed1);
			//sel.selectByVisibleText("Slow");
			//sel.selectByValue("Slow");
			driver.findElement(By.xpath("//select[@id='speed']")).click();
			Select sel=new Select(driver.findElement(By.xpath("//select[@id='speed']")));
			
			System.out.println("before selection");
			//Select sel=new Select(driver.findElement(By.xpath("//span[class='ui-selectmenu-text']")));
			sel.selectByIndex(1);
			
	
			
			//new Select(selectSpeed).selectByVisibleText("Slow");
			//selectSpeedvalue.selectByVisibleText("Slow");
			
			/*
			 * new Select(selectfiles).selectByVisibleText("jQuery.js");
			 * //selectfilevalue.selectByVisibleText("jQuery.js");
			 * 
			 * 
			 * new Select(selectNumber).selectByVisibleText("3");
			 * //selectNumbervalue.selectByVisibleText("3");
			 * 
			 * new Select(selectTitle).selectByVisibleText("Dr.");
			 */
			
			
		}
	
	
	

}
