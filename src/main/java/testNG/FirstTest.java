package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTest {
  WebDriver driver;
  
   @BeforeSuite
    public void google() {
    	System.setProperty("webdriver.chrome.driver", "D:\\Selenium ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
    
    @Test(priority = 0)
	public void myntra() {
		driver.navigate().to("https://www.myntra.com/");
	}
    
    
    @Test(priority = 2)
    public void amazon() {
    	driver.navigate().to("https://www.amazon.in");
	}
    
    @Test(priority = 1)
    public void flipcart() {
    	driver.navigate().to("https://www.flipkart.com/");
	}
	
    
	  @AfterSuite
	  public void done() { 
		  driver.close(); 
	}
	
	@Test
	public static void test1() {
        System.out.println("Hello, this is my first TestNG test!");
    }

    @Test
    public static void test2() {
        System.out.println("This is my second test!");
    }
    
	@Test(groups = {"Apple"})
	public void apple() {
		System.out.println("iphone 12");
	}
	
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("iphone 12");
	}
    
	@Test(groups = {"IQOO"})
	public void iqoo5() {
		System.out.println("iqoo");
	}
    
	@Test(groups = {"IQOO"})
	public void iqoo6() {
		System.out.println("iqoo");
	}
    
	@Test(groups = {"VIVO"})
	public void vivo() {
		System.out.println("vivo");
	}
    
	@Test(groups = {"VIVO"})
	public void vivo1() {
		System.out.println("vivo");
	}
    
    
    
    
    
    
    
	
	
	
}
