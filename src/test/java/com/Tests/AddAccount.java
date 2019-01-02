package com.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PageObjects.CreateAccountPage;
import com.PageObjects.GoogleHomePage;
import com.PageObjects.VerifyPhonePage;

public class AddAccount 
{
	WebDriver driver;
	@BeforeTest
	@Parameters({"browser"})
	public void setup(String browser) throws Exception {
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver", "D:\\Sel Drivers\\chromedriver.exe");	
			// create chrome instance
			driver = new ChromeDriver();
		}
		// Check if parameter passed as 'Edge'
		else if (browser.equalsIgnoreCase("Edge")) {
			// set path to Edge.exe
			System.setProperty("webdriver.edge.driver", ".\\MicrosoftWebDriver.exe");
			// create Edge instance
			driver = new EdgeDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	
	 @AfterTest
	    public void close(){
	          driver.close();
	       }
}
