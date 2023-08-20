package com.automationdemo.testcases;

import com.automationdemo.pages.ReportsPage;
import com.automationdemo.utils.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationdemo.base.TestBase;
import com.automationdemo.pages.HomePage;
import com.automationdemo.pages.LoginPage;



public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	public HomePageTest() {
		super();
		
	}
	
	//test cases must be independent with each other
	//before --> launch the browser and login
	//@test --> execute test cases
	//after --> close the browser

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		
		
	}
	
	
	@Test(priority = 1)
	public void homePageLogoTest() {
		
	boolean flag= homePage.validateActiTimeLogo();
	Assert.assertTrue(flag,"Cannot find the Logo");
		
	}
	
	
	@Test(priority = 2)
	public void homePageTaskLinkTest() {
		testUtil.switchToFrame();
		homePage.clickOnTaskLink();

	} 

	@Test(priority = 3)
	public void verifyReportsLinkTest() {
		testUtil.swithToFrame();
		ReportsPage reportsPage = homePage.clickOnReportsLink();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
