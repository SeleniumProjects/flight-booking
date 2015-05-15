package com.flightbooking.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	// To test the chagnes from git hub servers ite

// These are conflicting changes
	public static WebElement txtUserName(WebDriver driver) {
		
		WebElement txtUsername= driver.findElement(By.name("userName"));		
		return txtUsername;	
		
	}
public static WebElement txtPassword(WebDriver driver) {
		
		WebElement txtPassword= driver.findElement(By.name("password"));		
		return txtPassword;	
		
	}
public static WebElement btnLogin(WebDriver driver) {
	
	WebElement btnLogin= driver.findElement(By.name("login"));		
	return btnLogin;	
	
}

}
