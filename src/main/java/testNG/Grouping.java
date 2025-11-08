package testNG;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = {"vivo"})
	public void vivo1() {
		System.out.println("VIVO testing");
	}
	@Test(groups = {"vivo"})
	public void vivo2() {
		System.out.println("VIVO testing");	
	}
	@Test(groups = {"moto"})
	public void moto1() {
		System.out.println("moto testing");	
	}
	@Test(groups = {"moto"})
	public void moto2() {
		System.out.println("moto testing");	
	}
	@Test(groups = {"oppo"})
	public void oppo1() {
		System.out.println("oppo testing");	
	}
	@Test(groups = {"oppo"})
	public void oppo2() {
		System.out.println("oppo testing");	
	}
	@Test(groups = {"apple"})
	public void Apple1() {
		System.out.println("APPLE testing");	
	}
	@Test(groups = {"apple"})
	public void Apple2() {
		System.out.println("APPLE testing");	
	}
	
	@Test(groups = {"Oneplus"})
	public void oneplus() {
		System.out.println("Oneplus testing");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
