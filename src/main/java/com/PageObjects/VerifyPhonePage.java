package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPhonePage {

	WebDriver driver;
	@FindBy(id = "phoneNumberId")
	By phoneNum;
	@FindBy(xpath = "//span[@class='RveJvd snByac']")
	By next;

	public VerifyPhonePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setPhone(String phone) {
		driver.findElement(phoneNum).sendKeys(phone);
	}
	public void clickNext2() {
		driver.findElement(next).click();
	}
}
