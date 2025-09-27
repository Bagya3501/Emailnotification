package Ui;

import org.testng.annotations.Test;


@Test(groups="all")
public class GroupingTestcase {
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
	}
	@Test(groups="Regression")
	public void testcaseFive() {
		System.out.println("Test5");
	}
}
