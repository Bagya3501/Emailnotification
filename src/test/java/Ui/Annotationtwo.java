package Ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Annotationtwo {

	@BeforeClass
	public void Beforclass() {
		System.out.println("Before class is executed");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After class is executed");
	}
	@BeforeGroups(value="pink")
	public void BeforeGroup() {
		System.out.println("Executed before group");
	}
	@AfterGroups(value="yellow")
	public void Aftergroups() {
		System.out.println("Executed  after group");
	}
	@Test(groups="yellow")
	public void Test1() {
		System.out.println("Executed first test");
	}
	@Test(groups={"orange","Yellow"})
	public void Test2() {
		System.out.println("Executed second test");
	}
	@Test(groups="pink")
	public void Test3() {
		System.out.println("Executed THIRD test");
	}
	
}
