package pageobjectTestCases;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTestcase {
	
	@Test
	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")) ;
		
		
	}
	
	@Test
    public static WebElement lastname(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@placeholder=\"Last Name\"]"));	
	}
	
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@type=\"email\"]"));
		
	}
	
	
	
	
	
	
}
