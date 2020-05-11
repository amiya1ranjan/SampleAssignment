package com.sample.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample.qa.base.TestBase;

public class SelectPage extends TestBase{
	
	
	//Page Factory-OR
	@FindBy(xpath="//*[@id=\"selectable\"]/li")
	List<WebElement> selectitems;
	
	@FindBy(xpath="//*[@id=\"selectable\"]/li[")
	WebElement splitSelectxpath;
	
	@FindBy(xpath="]")
	WebElement splitItemxpath;
	
	
	
	
	//initializing the Page objects
	public SelectPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	// listing out all selectable elements name
	public List<WebElement> listitems() {
	List<WebElement> listitems=selectitems;
	return listitems;
	}
	
	//click & display all slect items
	public void clickAndDisplaySelectitems() {
		listitems();
		int k=listitems().size();
		for(int j=1; j<=k; j++ )
		{
			driver.findElement(By.xpath("//*[@id=\"selectable\"]/li["+j+"]")).click();
			
			String selectItmes=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li["+j+"]")).getText();
			System.out.println(selectItmes);
			
		}
	
	}
	
	
}
