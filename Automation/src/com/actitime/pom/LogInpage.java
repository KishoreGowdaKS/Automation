package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practice1.webelements;

public class LogInpage {
	@FindBy(id="username")
	private WebElement untext;
	@FindBy(name="pwd")
	private WebElement pwdtext;
	@FindBy(partialLinkText="Login")
	private WebElement login;
	
	
	public LogInpage(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
public void action(String un,String pwd) {
	untext.sendKeys(un);
	pwdtext.sendKeys(pwd);
	login.click();
	
	
}
}
