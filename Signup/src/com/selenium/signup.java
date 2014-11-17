package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class signup {

	public static void main(String[] args){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://ahtest.herokuapp.com");
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul[1]/li[2]/a")).click();
    driver.findElement(By.xpath(" /html/body/div[3]/div/section/div[2]/div/div[1]/form/div[2]/div/table/tbody/tr[1]/td/input")).sendKeys("tanmayarora00@gmail.com");
    driver.findElement(By.xpath("/html/body/div[3]/div/section/div[2]/div/div[1]/form/div[2]/div/table/tbody/tr[2]/td/input")).sendKeys("tanmay arora");    
    driver.findElement(By.xpath("/html/body/div[3]/div/section/div[2]/div/div[1]/form/div[2]/div/table/tbody/tr[3]/td/input")).sendKeys("94110");   
    driver.findElement(By.xpath(" /html/body/div[3]/div/section/div[2]/div/div[1]/form/div[2]/div/table/tbody/tr[4]/td/input")).sendKeys("blessing");
    driver.findElement(By.xpath(" /html/body/div[3]/div/section/div[2]/div/div[1]/form/div[2]/div/table/tbody/tr[6]/td/input")).click();
}
}