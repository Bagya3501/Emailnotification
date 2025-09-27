package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commondatasetup {
@BeforeSuite
	public void Beforesuitetest() {
		System.out.println("Before Suite is executed");
	}
@AfterSuite
public void aftersuitetest() {
	System.out.println("After suite is executed");
}
}
