package Ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reportdemo {
@Test
	public void reporttest1() {
		System.out.println("Test1 is executed successfully");
		Reporter.log("result in report for test1");
	}
@Test
	public void reporttest2() {
		System.out.println("Test2 is executed successfully");
	}
@Test
	public void reporttest3() {
		System.out.println("Test3 is executed successfully");
	}
@Test
	public void reporttest4() {
		System.out.println("Test4 is executed successfully");
		Assert.assertTrue(false);
	}
}
