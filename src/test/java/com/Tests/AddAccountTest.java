package com.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Google.Base.TestBase;
import com.PageObjects.CreateAccountPage;
import com.PageObjects.GoogleHomePage;
import com.PageObjects.VerifyPhonePage;
import com.Util.TestUtil;

public class AddAccountTest extends TestBase {
	WebDriver driver;
//	TestUtil testUtil;
//	GoogleHomePage homePage;
//	CreateAccountPage createPage;
//	VerifyPhonePage verifyPage;

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
//		testUtil = new TestUtil();		
	}

	@Test
	public void createGoogleAcc() {
		GoogleHomePage ghp = new GoogleHomePage(driver);
		ghp.clickCreateAccLink();
		
		//Assert.assertTrue(ghp.isp);
		CreateAccountPage cap = new CreateAccountPage(driver);
		cap.setFname("chai");
		cap.setLname("chilu");
		cap.setUname("chaiChilu345");
		cap.setPwd("Chai@911");
		cap.setCPwd("Chai@911");
		cap.clickNext1();
		
		VerifyPhonePage vpp = new VerifyPhonePage(driver);
		vpp.setPhone("9584512623");
		vpp.clickNext2();
	}

	@AfterMethod
	public void close() {
		// driver.close();
	}
}
