package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchTextBox;
	//By searchTextBox = By.id("twotabsearchtextbox");
	By searchDD = By.id("searchDropdownBox");
	By searchSubmit = By.xpath("//input[@type='submit']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setSearchDD() {
		driver.findElement(searchDD);
	}
	
	public void setSearchText() {
		//driver.findElement(searchTextBox).sendKeys("");
		searchTextBox.sendKeys("");
	}
	
	public void clickSearchSubmit() {
		driver.findElement(searchSubmit).click();
	}
	

}
