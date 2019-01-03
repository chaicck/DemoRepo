package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage{
	
	WebDriver driver;	

	By createAccount = By.linkText("Create a Google Account");
	
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void clickCreateAccLink() {
		driver.findElement(createAccount).click();
	}
}
