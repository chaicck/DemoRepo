package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	WebDriver driver;
	
	By fname = By.id("firstName");
	By lname = By.id("lastName");
	By uname = By.id("username");
	By pwd = By.name("Passwd");
	By cpwd = By.xpath("//input[@name='ConfirmPasswd']");
	By next = By.xpath("//span[@class='RveJvd snByac']");
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setFname(String first) {
		driver.findElement(fname).sendKeys(first);;
	}
	public void setLname(String last) {
		driver.findElement(lname).sendKeys(last);
	}	
	public void setUname(String user) {
		driver.findElement(uname).sendKeys(user);
	}
	public void setPwd(String pass) {
		driver.findElement(pwd).sendKeys(pass);
	}
	public void setCPwd(String cpass) {
		driver.findElement(cpwd).sendKeys(cpass);
	}	
	public void clickNext1() {
		driver.findElement(next).click();
	}
}
