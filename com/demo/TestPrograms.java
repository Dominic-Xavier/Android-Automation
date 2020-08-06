package com.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPrograms {
	
	@BeforeClass
	public void show() {
		System.err.println("Before Class executed");
	}
	
	@BeforeMethod
	public void sample1() {
		System.err.println("BeforeMethod executed");
	}
	
	@AfterMethod
	public void sample2() {
		System.err.println("AfterMethod executed");
	}
	
	@BeforeTest
	public void test() {
		System.err.println("BeforeTest executed");
	}
	
	@AfterTest
	public void test1() {
		System.err.println("AfterTest executed");
	}
	
	@Test
	public void google() {
		System.out.println("Google executed");
	}
	
	@Test
	public void facebook() {
		System.out.println("facebook executed");
	}
	
	@Test
	public void watsapp() {
		System.out.println("watsapp executed");
	}
	
	@Test
	public void Whatsapp() {
		System.out.println("Whatsapp executed");
	}
	
	@Test
	public void twitter() {
		System.out.println("twitter executed");
	}
	
	@AfterClass
	public void aftershow() {
		System.err.println("After class is Executed");
	}
	
	@BeforeSuite
	public void beforeallmethod() {
		System.out.println("BeforeSuite Executed...!");
	}
	
	@AfterSuite
	public void afterallmethod() {
		System.out.println("AfterSuite method executed...!");
	}
}
