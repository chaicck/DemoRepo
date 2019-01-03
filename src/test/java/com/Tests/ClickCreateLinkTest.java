package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Google.Base.TestBase;
import com.PageObjects.CreateAccountPage;
import com.PageObjects.GoogleHomePage;
import com.PageObjects.VerifyPhonePage;
import com.Util.TestUtil;


public class ClickCreateLinkTest extends TestBase {
	WebDriver driver;
		
	TestUtil testUtil;
	GoogleHomePage homePage;
//	CreateAccountPage createPage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		testUtil = new TestUtil();
		homePage = new GoogleHomePage(driver);
		
	}
	@Test
	public void createGoogleAcc() throws Exception {
		GoogleHomePage ghp = new GoogleHomePage(driver);
		ghp.clickCreateAccLink();		
		
	}

}
