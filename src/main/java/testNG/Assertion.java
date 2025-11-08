package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

//It means to check the value
public class Assertion {

	@Test
	public  void namecheck() {
		String name="Alan";
		
		//assertion
		//to check value is equal
		Assert.assertEquals(name, "Alan");
		//to check value is not equal
		Assert.assertNotEquals(name, "Alan");
	}
	
		@Test
		public void numCheck() {
			int num=25;
		Assert.assertEquals(num, 25);	
	}
		
		
	
}








