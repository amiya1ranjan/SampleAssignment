package com.sample.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sample.qa.base.TestBase;
import com.sample.qa.pages.SelectPage;

public class SelectPageTest extends TestBase {
	SelectPage selectPage;
	
	public SelectPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		selectPage=new SelectPage();
		}
	
	@Test
	public void SelectItemsTest()
	{
		selectPage.listitems();
		selectPage.clickAndDisplaySelectitems();
		
		// Assert.assertEquals(true, true);
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
