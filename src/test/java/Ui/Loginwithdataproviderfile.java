package Ui;

import org.testng.annotations.Test;

public class Loginwithdataproviderfile {

	@Test(dataProvider="dataset",dataProviderClass=Dataproviderfile.class)
	public void login(String username , String password) 
	{
		System.out.println(username+password);
	}
	@Test(dataProvider="dataset",dataProviderClass=Dataproviderfile.class)
	public void login2(String username1,String password2,String Pass3) {
		System.out.println(username1+password2+Pass3);
	}
}