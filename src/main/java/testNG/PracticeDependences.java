package testNG;

import org.testng.annotations.Test;

public class PracticeDependences {
	@Test(enabled = true)
	public void StartAcar() {
		System.out.println("push the start button");
	}
	
	@Test(dependsOnMethods = "StartAcar")
	public void putfirstGear() {
		System.out.println("first gear");
	}
	
	@Test(dependsOnMethods = "putfirstGear")
	public void putsecondGear() {
		System.out.println("Second Gear");
	}
	
	
	@Test(dependsOnMethods = "putsecondGear")
	public void putthirdGear() {
		System.out.println("Third Gear");
}
}
