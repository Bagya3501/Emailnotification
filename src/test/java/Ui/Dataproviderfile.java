package Ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Dataproviderfile {
@DataProvider
	public Object[][] dataset(Method m){
		Object[][] testdata = null;
		 if(m.getName().equals("login")) {
			 testdata = new Object[][]	
					 {
						{"standard_user","secret_sauce"},
						{"locked_out_user","secret_sauce"},
						{"login","pass"}
							};
							
		 }
		 else if(m.getName().equals("login2")) {
			 testdata = new Object[][] 
					 {
				 {"standard_user","secret_sauce","third"},
					{"locked_out_user","secret_sauce","Third1"},
			 };
			
		 }
		 return testdata;
	}
	
}
