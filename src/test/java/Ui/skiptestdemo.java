package Ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptestdemo {
	
	Boolean data = false;
	@Test(enabled=false)
public void test1() {
	System.out.println("skip this test");	
}
	@Test
	public void test2() {
		System.out.println("Skip by forcefully");
		throw new SkipException("it has exception");
	}
	@Test
	public void test3() {
		System.out.println("Skipping test based on the data setup");
		if(data==true) {
			System.out.println("Exceute this test");
		}
		else
		{
			System.out.println("Don't executed this test");
			throw new SkipException("Exception throwed");
		}
	}
	 
}
