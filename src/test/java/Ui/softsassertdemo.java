package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class softsassertdemo {
	@Test
	public void testtitleandtest() {
		SoftAssert softassrt = new SoftAssert();
		String expectedtitle = "Electronics, hhCars, Fashion, Collectibles & More | eBay";
		String expectedtext ="Search";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("browser opened");
		softassrt.assertEquals(actualtitle, expectedtitle, "title error");
		System.out.println("Expected title is executed");
	String ActualText = driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]")).getAttribute("value");
	softassrt.assertEquals(ActualText, expectedtext);
	System.out.println("Expected text is executed");
	softassrt.assertAll();
	}

}
