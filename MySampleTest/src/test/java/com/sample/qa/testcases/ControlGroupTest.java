package com.sample.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sample.qa.base.TestBase;
import com.sample.qa.pages.ControlGroupPage;


public class ControlGroupTest extends TestBase{
	
	ControlGroupPage controlGroupPage;
	ControlGroupTest()
	{
		super();
	}
	
@BeforeMethod
public void setup()
{
	initialization();
	
	controlGroupPage=new ControlGroupPage();
}
@Test
public void carBooking() {
	
	controlGroupPage.NavigatetoControlGroup();
	controlGroupPage.bookCar();
	
	
}

}
