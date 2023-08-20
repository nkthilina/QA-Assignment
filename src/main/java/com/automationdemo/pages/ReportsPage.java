package com.automationdemo.pages;

import com.automationdemo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage extends TestBase  {

	public ReportsPage() {
		super();
	}
	
	// Web Element Xpath 
	@FindBy(xpath = "//div[@class='label']//parent::a[@class='content selected reports']")
    WebElement reportsLabel;
	
	// Call init
	public ReportsPage() {
		PageFactory.initElements(driver,this);
	}


	// Mathod
	public boolean verifyReportsLabel() {
		return reportsLabel.isDisplayed();
	}


	public void selectReportsByName(String name) {
		driver.findElement(By.xpath("//div[contains(text(),'Monthly Company')]")).click();
	}
}
