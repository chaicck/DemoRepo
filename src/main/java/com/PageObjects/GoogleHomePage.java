package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
	
	WebDriver driver;
	
//	@FindBy(linkText="Create a Google Account")
//	WebElement createAccount;
	By createAccount = By.linkText("Create a Google Account");
	
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}	
	
	public void clickCreateAccLink() {
		driver.findElement(createAccount);
	}
}
