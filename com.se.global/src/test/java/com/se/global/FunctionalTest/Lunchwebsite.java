package com.se.global.FunctionalTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunchwebsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.se.com/in/en/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		 

	}

}
