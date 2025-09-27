package Ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Commondatasetup;


@Test(groups="all")
public class GroupingTestcase2 extends Commondatasetup {
	@Test(groups="Regression")
	public void testcaseone() {
		System.out.println("Test1");
	}
	@Test(groups="Smoke")
	public void testcasetwo() {
		System.out.println("Test2");
	}
	@Test(groups={"Regression","Smoke"})
	public void testcasethree() {
		System.out.println("Test3");
	}
	@Test(groups="Sanity")
	public void testcaseFour() {
		System.out.println("Test4");
		Assert.assertTrue(false);
	}
	@Test(groups="Regression")
	public void testcaseFive() {
		System.out.println("Test5");
	}
}
