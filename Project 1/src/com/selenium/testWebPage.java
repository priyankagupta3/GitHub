package com.selenium;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObject.Registration;
@Test
public class testWebPage extends SelTestCase  {

	public void testRegistration() {
		
		Registration registration = new Registration(driver);
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		registration.registorNewUser();
	}
}
