package pageObject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	private WebDriver driver;
	public Registration(WebDriver driver){
		this.driver = driver;
	}
	public AccountCreationPage registorNewUser()
	{
		driver.findElement(By.name("firstName")).sendKeys("test user");
		driver.findElement(By.name("lastName")).sendKeys("test last name");
        driver.findElement(By.name("phone")).sendKeys("4527857859");
        driver.findElement(By.name("userName")).sendKeys("seleniumuser");
        driver.findElement(By.name("address1")).sendKeys("test user");
        driver.findElement(By.name("address2")).sendKeys("test user");
        driver.findElement(By.name("city")).sendKeys("Sacramento");
	    driver.findElement(By.name("state")).sendKeys("california");
		driver.findElement(By.name("postalCode")).sendKeys("452012");
		driver.findElement(By.name("country")).sendKeys("america");
		driver.findElement(By.name("email")).sendKeys("seleniumuser");
		driver.findElement(By.name("password")).sendKeys("test12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("test12345");
		driver.findElement(By.name("register")).click();
		return new AccountCreationPage(driver);
	}
	public static void main(String[] args){
		List<String>list = Arrays.asList("a","b");
		System.out.println(list.contains("a") || list.contains("b"));
	}
}
