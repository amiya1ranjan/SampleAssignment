package com.sample.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sample.qa.base.TestBase;
import com.sample.qa.pages.SelectMenuPage;

public class SelectMenuTest extends TestBase{
	
	SelectMenuPage selectMenuPage;
	SelectMenuTest()
	{
		super();
	}
	
@BeforeMethod
public void setup()
{
	initialization();
	
	selectMenuPage=new SelectMenuPage();
}
@Test
public void SelectMenuOPtions() {
	
	selectMenuPage.selectMenuItems();
	
}

	
}
