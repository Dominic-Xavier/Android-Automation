package com.testNgListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeer implements ITestListener {
	
	@Override		
    public void onFinish(ITestContext Result){
		System.out.println(Result.getFailedTests());
    }		

    // When Test case get failed, this method is called.		
    @Override		
    public void onTestFailure(ITestResult Result){
    	Report.createinstance("Test Name:"+Result.getTestName(), Result.getTestName()+"is failed...!").fail(Result.getTestName());
    }		

    // When Test case get Skipped, this method is called.		
    @Override		
    public void onTestSkipped(ITestResult Result){
    	Report.createinstance("Test Name:"+Result.getTestName(), Result.getTestName()+"is Skipped...!").skip(Result.getTestName());
    }		

    // When Test case get passed, this method is called.		
    @Override		
    public void onTestSuccess(ITestResult Result){
    	Report.createinstance("Test Name:"+Result.getTestName(), Result.getTestName()+"is Executed successfully...!").pass(Result.getTestName());
    }	

    @Override		
    public void onStart(ITestContext Result)					
    {		
            		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    		
    }				

    // When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" test case started");					
    }
}
