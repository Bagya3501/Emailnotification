package Ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest {
	@BeforeTest
	public void logintest() {
		System.out.println("fist Login");
	}
	@AfterTest
	public void last() {
		System.out.println("last login");
	}
	@BeforeMethod
	public void firstmethod() {
		System.out.println("DB is connected");
	}
	@AfterMethod
	public void lastmethod() {
		System.out.println("Db is disconnected");
	}
	@Test(priority=1,description="login test")
	public void BLogin() {
		System.out.println("Loggedin successfully");
	}
	@Test(priority=2)
public void ALogout() {
	System.out.println("Loggedout successfully");
}
}
