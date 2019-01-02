package com.PageObjects;

import org.openqa.selenium.WebDriver;

public class LoginPage extends HomePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	
	public void setSearchTe() {
		//driver.findElement(searchTextBox).sendKeys("");
		searchTextBox.sendKeys("");
	}

}
