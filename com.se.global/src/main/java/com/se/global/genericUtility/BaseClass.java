package com.se.global.genericUtility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.se.global.pomrepositylib.Home;
import com.se.global.pomrepositylib.NameAndLogin;
import com.se.global.pomrepositylib.UserHomePage;

public class BaseClass {
	public WebDriver driver;
	@BeforeClass
	public void configBC() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
	}
	@BeforeMethod
	public void configBM() {
		Home homepage = new Home(driver);
		NameAndLogin login = new NameAndLogin(driver);
		UserHomePage userhomepage = new UserHomePage(driver);
	}
	@AfterMethod
	public void configAM() {
		
	}
	@AfterClass
	public void configAC() {
		driver.quit();
	}
	
	
	

}
