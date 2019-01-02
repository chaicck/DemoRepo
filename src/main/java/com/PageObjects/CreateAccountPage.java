package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	WebDriver driver;

	@FindBy(id="firstName")
	By fname;
	@FindBy(id="lastName")
	By lname;
	@FindBy(id="username")
	By uname;
	@FindBy(id="Passwd")
	By pwd;
	@FindBy(id="ConfirmPasswd")
	By cpwd;
	@FindBy(xpath="//span[@class='RveJvd snByac']")
	By next;
	
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
		driver.findElement(pwd).sendKeys(cpass);
	}	
	public void clickNext1() {
		driver.findElement(next).click();
	}
}
