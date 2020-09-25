package com.testNgListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report{
	
	private static ExtentSparkReporter reporter;
	private static ExtentReports report;
	private static ExtentTest test;
	
	public static ExtentTest createinstance(String testName,String testDescription) {
		reporter = new ExtentSparkReporter("./Extent-Report/Financial Manager.html");
		report = new ExtentReports();
		report.attachReporter(reporter);
		test = report.createTest(testName,testDescription);
		report.flush();
		return test;
	}
}
