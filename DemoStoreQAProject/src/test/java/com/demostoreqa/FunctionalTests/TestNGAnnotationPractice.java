package com.demostoreqa.FunctionalTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotationPractice {

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("This is before suite");
	}

	@BeforeTest
	public void beforeTest() {
	
	
		System.out.println("This is before Test");
	}

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("This is before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("This is before Method");
		
	}

	@Test
	public void Test1() {
		
		System.out.println("This is Test");
	}
	
	@Test
	public void Test2() {
		
		System.out.println("This is Test");
	}
	
	@Test
	public void Test3() {
		
		System.out.println("This is Test");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("This is After Method");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("This is After class");
	}

	@AfterTest
	public void afterTest() {
		
		System.out.println("This is After Test");
		
	}

	@AfterSuite
	public void afterSuite() {
		
		System.out.println("This is After Suite");
	}

}
