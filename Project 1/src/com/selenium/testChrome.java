package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class testChrome {
	
	public static void main(String[] args){
	System.setProperty("webdriver.ie.driver","C:\\iedriver\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();	
	driver.get("http://gmail.com");
}
}