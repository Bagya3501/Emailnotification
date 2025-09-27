package Ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.Commondatasetup;

public class assertionstart extends Commondatasetup{
	@Test
 public void titlecheck() {
	 String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.ebay.com/");
	 String actualtitle = driver.getTitle();
	 Assert.assertEquals(actualtitle, expectedtitle);
	 System.out.println("opened successfully");
	 
	 
 }
}
