package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ReportListeners implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.setProperty("org.uncommons.reportng.title", "bagya");//to change the title of the report
		System.out.println("test is started successfully");
		Reporter.log("print method of test" + result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("test executed");
	}
	public void onTestFailure (ITestResult result) {
		System.out.println("test is failed");
	}
	public void onTestSkipped (ITestResult result) {
		//System.out.println();
	}
	public void onTestFailedButWithinSuccessPercentage (ITestResult result) {
		//System.out.println();
	}

	
}
