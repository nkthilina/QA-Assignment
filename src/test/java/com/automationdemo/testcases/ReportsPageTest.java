package com.automationdemo.testcases;

import com.automationdemo.pages.HomePage;
import com.automationdemo.pages.LoginPage;
import com.automationdemo.pages.ReportsPage;
import com.automationdemo.utils.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.automationdemo.base.TestBase.*;

public class ReportsPageTest {


    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    ReportsPage reportsPage;

    public ReportsPageTest(){
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        testUtil = new TestUtil();
        reportsPage = new ReportsPage();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        reportsPage = homePage.clickOnReportsLink();

    }



    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

}
