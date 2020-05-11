package com.sample.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sample.qa.base.TestBase;
import com.sample.qa.pages.DropPage;


public class DropPageTest extends TestBase{
	
	DropPage dropPage;
	public DropPageTest() {
		super();
	}
 
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		dropPage=new DropPage();
		}
	
	
	@Test
	public void DragAndDropTest()
	{
		dropPage.NavigatetoDragndrop();
		dropPage.DragAndDrop();
		
		
	}
}
