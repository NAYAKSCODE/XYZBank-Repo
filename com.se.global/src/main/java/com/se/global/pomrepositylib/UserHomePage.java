package com.se.global.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
	public UserHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@ng-click='transactions()']")
	private WebElement clickTransaction;
	@FindBy(xpath="//button[@ng-click='deposit()']")
	private WebElement clickDeposite;
	@FindBy(xpath="//input[@type='number']")
	private WebElement inputBox;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement depositeBtn;
	@FindBy(xpath="//span[@ng-show='message']")
	private WebElement message;
	
	public WebElement getTransaction() {
		return clickTransaction;
	}
	public WebElement getDeposite() {
		return clickDeposite;
	}
	public WebElement getInputBox() {
		return inputBox;
	}
	public WebElement getDepositeBtn() {
		return depositeBtn;	
	}
	public WebElement getMessage() {
		return message;
		
	}
	public void transaction() {
		clickTransaction.click();
		clickDeposite.click();
		inputBox.sendKeys("1000");
		depositeBtn.click();
	}
	public String message() {
		
		String mestext = message.getText();
		System.out.println(mestext);
		return mestext;
	}

}
