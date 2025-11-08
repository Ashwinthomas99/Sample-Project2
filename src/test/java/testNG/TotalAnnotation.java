package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TotalAnnotation {
  @Test
  public void tests() {
	  System.out.println("im test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("im beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("im afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("im beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("im afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("im beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("im afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("im beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("im afterSuite");
  }

}
