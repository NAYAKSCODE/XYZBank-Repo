package com.se.global.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg']")
	private WebElement customerLogin;
	public WebElement getCustomerLogin() {
		return customerLogin;
	}
	public void customerLogin() {
		customerLogin.click();
		
	}

}
