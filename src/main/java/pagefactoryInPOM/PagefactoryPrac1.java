package pagefactoryInPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectTestCases.PFTestcase2;

public class PagefactoryPrac1 {

	@Test
	public void practice() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		PageFactory.initElements(driver, PFTestcase2.class);
		PFTestcase2.fName.sendKeys("alan");
		PFTestcase2.lName.sendKeys("adam");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
