package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class search extends SelTestCase {

	public void testSearch() {
		driver.get("https://ahtest.herokuapp.com");
		WebElement fields = driver.findElement(By.cssSelector("#search_string"));
		fields.sendKeys("science");
		Select age = new Select(driver.findElement(By.id("age")));
		age.selectByVisibleText("10 yrs");
		driver.findElement(By.id("search_start_date")).click();
		WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));  
		List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));  
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));  
	    for (WebElement cell: columns){  
		//Select 13th Date   
		if (cell.getText().equals("13")){  
		cell.findElement(By.linkText("13")).click();  
	    break;  
		   }  
	    }
	    driver.findElement(By.id("search_end_date")).click();
	    driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
		WebElement dateWidget1 = driver.findElement(By.id("ui-datepicker-div"));  
		List<WebElement> rows1 = dateWidget.findElements(By.tagName("tr"));  
		List<WebElement> columns1 = dateWidget.findElements(By.tagName("td"));  
	    for (WebElement cell: columns1){  
		//Select 20th Date   
		if (cell.getText().equals("20")){  
		cell.findElement(By.linkText("20")).click();  
	    break;  
		   }  
	    }
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div[2]/form/div[7]/input")).click();
	}	
}
