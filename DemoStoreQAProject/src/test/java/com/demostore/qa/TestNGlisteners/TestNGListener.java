package com.demostore.qa.TestNGlisteners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestNGListener implements ISuiteListener, ITestListener {
	
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Suite execution started:"+suite.getName());
	}
	
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Suite execution finished:"+suite.getName());
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("@Test execution started:"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("@Test execution finished:"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("@Test failed:"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("@Test skipped:"+result.getName());
	}

	

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("TEST STARTED:"+context.getName());
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("TEST finished:"+context.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
}
