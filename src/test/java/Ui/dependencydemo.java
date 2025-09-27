package Ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencydemo {
	@Test
	public void userlogin() {
		System.out.println("Logged in successfully");
	}
	@Test
	public void usersearch() {
		System.out.println("searched  successfully");
		Assert.assertTrue(false);
		
	}
	@Test(dependsOnMethods="usersearch",alwaysRun=true)
	public void eecuted() {
		System.out.println("executed successfully");
		
	}

}
