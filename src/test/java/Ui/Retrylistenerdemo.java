package Ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.Retrydemo;

public class Retrylistenerdemo extends Retrydemo{
	@Test//(retryAnalyzer = common.Retrydemo.class)
	public void open() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		Assert.assertTrue(false);
	}
}
