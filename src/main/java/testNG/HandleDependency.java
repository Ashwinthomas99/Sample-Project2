package testNG;

import org.testng.annotations.Test;

public class HandleDependency {

	@Test(enabled=true)
	public void grandF() {
		System.out.println("Grand Father");
	}
	
	@Test(dependsOnMethods = "grandF")
	public void father() {
		System.out.println("Father");
	}
	
	@Test(dependsOnMethods = "father")
	public void child() {
		System.out.println("Child");
	}
	
	
	
	@Test(dependsOnMethods = "child")
	public void son() {
		System.out.println("son");
	}
	
	
	
	
	
}
