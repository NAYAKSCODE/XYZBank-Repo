package com.se.global.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NameAndLogin {
	public NameAndLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="userSelect")
	private WebElement userSelect;
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement login;
	
	public WebElement getUserName() {
		return userSelect;
	}
	public WebElement getLogin() {
		return login;	
	}
	public void selectUser() {
		Select se = new Select(userSelect);
		se.selectByVisibleText("Hermoine Granger");
		login.click();
	}

}
