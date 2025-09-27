package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multibroserlogib {

	public static WebDriver Driver;
	@Parameters({"browser"})
	@Test
	public  void main(String browser) {
		// TODO Auto-generated method stub
if(browser.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	Driver = new ChromeDriver();
}
else if(browser.equals("edge")) {
	Driver=new EdgeDriver();
}
Driver.get("https://www.meesho.com/auth");
Driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div[2]/input")).sendKeys("9047246630");
Driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/button/div")).click();
//Driver.close();
	}

}
