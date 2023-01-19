package com.se.global.customerlogintest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.se.global.genericUtility.BaseClass;
import com.se.global.pomrepositylib.Home;
import com.se.global.pomrepositylib.NameAndLogin;
import com.se.global.pomrepositylib.UserHomePage;

public class CustomerLogin extends BaseClass {
	@Test
	public void customerLoginTest() {
		Home homepage = new Home(driver);
		homepage.customerLogin();
		NameAndLogin login = new NameAndLogin(driver);
		login.selectUser();
		UserHomePage userpage = new UserHomePage(driver);
		userpage.transaction();
	    
		Assert.assertEquals("Deposit Successful",userpage.message());
		
	}

}
