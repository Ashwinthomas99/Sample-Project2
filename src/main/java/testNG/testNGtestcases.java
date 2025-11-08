package testNG;

import org.testng.annotations.Test;

public class testNGtestcases {

	//testcases for Drive a car
	
	@Test(priority = 3,enabled = false)
	public void StartAcar() {
		System.out.println("push the start button");
	}
	@Test(priority = 0)
	public void putfirstGear() {
		System.out.println("first gear");
	}
	@Test(priority = 1)
	public void putsecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority = 2)
	public void putthirdGear() {
		System.out.println("Third Gear");
	}
	
	
}




