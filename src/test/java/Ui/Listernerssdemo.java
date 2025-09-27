package Ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Baseclassforss;

public class Listernerssdemo extends Baseclassforss {
	@Test
	public void open() {
		driver.get("https://www.saucedemo.com/v1/");
		Assert.assertTrue(false);
	}

}
