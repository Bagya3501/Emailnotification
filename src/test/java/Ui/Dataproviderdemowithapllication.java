package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemowithapllication {

	@Test(dataProvider="datasetup")
	public void login(String username,String password) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(200);
	driver.close();
	
	}
	
@DataProvider
	public Object[][] datasetup(){
		return new Object[][]
				{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"login","pass"}
				};
				
	}
}
