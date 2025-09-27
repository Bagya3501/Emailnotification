package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilis.Utilitis;

public class Listenerdemo extends Utilitis implements ITestListener{

		
		public void onTestStart(ITestResult result) {
			System.out.println("test is started successfully");
		}
		public void onTestSuccess(ITestResult result) {
			System.out.println("test executed");
		}
		public void onTestFailure (ITestResult result) {
			System.out.println("test is failed");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		public void onTestSkipped (ITestResult result) {
			//System.out.println();
		}
		public void onTestFailedButWithinSuccessPercentage (ITestResult result) {
			//System.out.println();
		}
}
