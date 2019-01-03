package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyPhonePage extends CreateAccountPage{
//{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,10);

//	By phoneNum = By.xpath("//input[@id='phoneNumberId']");
	By phoneNum = By.cssSelector("#phoneNumberId");
	//By next = By.xpath("//span[@class='RveJvd snByac']");
	By back = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[5]/div[2]/div[1]");

	public VerifyPhonePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	public void setPhone(String phone) {
		wait.until(ExpectedConditions.elementToBeClickable(phoneNum)).click();
		driver.findElement(phoneNum).sendKeys(phone);
	}
	public void clickNext2() {
		driver.findElement(next).click();
	}
	
	public void clickBack() {
		driver.findElement(back).click();
	}
}
