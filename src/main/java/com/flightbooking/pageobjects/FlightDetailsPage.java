package com.flightbooking.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightDetailsPage {
	

public static WebElement radioRoundTrip(WebDriver driver) {
	
		WebElement radioRoundTrip= driver.findElement(By.cssSelector("input[value=roundtrip]"));		
		return radioRoundTrip;	
		
	}
public static WebElement radioOneway(WebDriver driver) {
	
	WebElement radioOneway= driver.findElement(By.cssSelector("input[value=oneway]"));		
	return radioOneway;	
	
}
public static Select drpPassCount(WebDriver driver) {
	
	Select drpPassCount=new Select(driver.findElement(By.name("passCount")));	
	return drpPassCount;		
}

public static Select drpDepartfrom(WebDriver driver){
	Select drpDepartfrom=new Select(driver.findElement(By.name("fromPort")));
	return drpDepartfrom;	
}

public static Select drpFomMonth(WebDriver driver) {
	
	Select drpFomMonth=new Select(driver.findElement(By.name("fromMonth")));	
	return drpFomMonth;		
}

public static Select drpFromDay(WebDriver driver){
	Select drpFromDay=new Select(driver.findElement(By.name("fromDay")));
	return drpFromDay;	
}

public static Select drpArrivingIn(WebDriver driver){
	Select drpArrivingIn=new Select(driver.findElement(By.name("toPort")));
	return drpArrivingIn;	
}

public static Select drpReturningMonth(WebDriver driver){
	Select drpReturningMonth=new Select(driver.findElement(By.name("toMonth")));
	return drpReturningMonth;	
}

public static Select drpReturningDay(WebDriver driver){
	Select drpReturningDay=new Select(driver.findElement(By.name("toDay")));
	return drpReturningDay;	
}

public static WebElement radioEcoclass(WebDriver driver){
	WebElement radioEcoclass=driver.findElement(By.cssSelector("input[value=Coach]"));
	return radioEcoclass;	
	
}

public static WebElement radioBusinessClass(WebDriver driver){
	WebElement radioBusinessClass=driver.findElement(By.cssSelector("input[value=Business]"));
	return radioBusinessClass;
}
public static WebElement radioFirstClass(WebDriver driver){
	WebElement radioFirstClass=driver.findElement(By.cssSelector("input[value=First]"));
	return radioFirstClass;	
}


public static Select drpAirline(WebDriver driver){
	Select drpAirline=new Select(driver.findElement(By.name("airline")));
	return drpAirline;	
}
public static WebElement btnContinueInSearchPage(WebDriver driver){
	WebElement btnContinueInSearchPage=driver.findElement(By.name("findFlights"));
	return btnContinueInSearchPage;	
}

public static WebElement btnContinueInFlightDetailsPage(WebDriver driver){
	WebElement btnContinueInFlightDetailsPage=driver.findElement(By.name("reserveFlights"));
	return btnContinueInFlightDetailsPage;	
}





}
