package com.sample.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample.qa.base.TestBase;

public class DropPage extends TestBase{
	
	
	//Page Factory-OR
	
			@FindBy(xpath="//div[@id='draggable']")
			WebElement draggableElement;
			
			@FindBy(xpath="//div[@id='droppable']")
			WebElement droppablefield;
			
			
				
			
			
			
			//initializing the Page objects
			public DropPage()
			{			PageFactory.initElements(driver, this);
				
			}
			
			public void DragAndDrop()
			{
				Actions act=new Actions(driver);
				act.dragAndDrop(draggableElement, droppablefield).build().perform();
				
				String text=droppablefield.getText();
				System.out.println(text);
			}

}
