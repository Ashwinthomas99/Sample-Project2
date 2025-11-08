package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPriorityAndSkip {
   /* @Test(priority = 0)
	public void name() {
		System.out.println("Alan");
	}
	@Test(priority = 1)
	public void role() {
		System.out.println("Automation Tester");
	}
	@Test(priority = 2)
	public void company() {
		System.out.println("ZOHO");
	}*/
	
	
	//How to skip the testcase
	@Test(priority = 0)
	public void name() {
		System.out.println("Alan");
	}
	
	@Test(priority = 1,enabled = false) //- skip testcase
	public void role() {
		System.out.println("Automation Tester");
	}
	
	@Test(priority = 2)
	public void company() {
		System.out.println("ZOHO");
	}
	
	
}
