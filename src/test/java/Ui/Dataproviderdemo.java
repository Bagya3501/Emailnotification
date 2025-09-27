package Ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {
	
	@Test(dataProvider="Dataset")
	public void login(String username , String password) 
	{
		System.out.println(username+password);
	}
	@Test(dataProvider="dataset1")
	public void login2(String username1,String password2) {
		System.out.println(username1+password2);
	}
	@Test(dataProvider="create")
public void login3(String username2,String Password2) {
	System.out.println(username2+Password2);
}
@DataProvider//method1
	public Object[][] Dataset() {
		Object[][] dataset =  new Object[3][2];
		dataset[0][0]="user1";
		dataset[0][1]="pass1";
		
		dataset[1][0]="user2";
		dataset[1][1]="pass2";
		
		dataset[2][0]="user3";
		dataset[2][1]="pass3";
return dataset;
}
@DataProvider//method2
public Object[][] dataset1()
{
	return new Object[][] 
			{
		{"newuser1","newpass1"},
		{"newuser2","newpass2"}
			};
}

@DataProvider( name = "create")
public Object[][] dataset3(){
	return new Object[][]
			{
		{"username3","pass3"}
			};
}

}
