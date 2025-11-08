package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Test
	@Parameters("UserName")
	public void myName(String name) {
		System.out.println("Name is "+name);
		
	}
	
	@Test
	@Parameters("password")
	public void myPasswors(String pass) {
		System.out.println("Password is :"+pass);
	}
	
	@Test
	@Parameters("cPassword")
	public void rePassword(String cPass) {
		System.out.println("Confirm password :"+cPass);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
