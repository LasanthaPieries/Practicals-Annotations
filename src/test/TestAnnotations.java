package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@Test
	public void test1() {
		System.out.println("Test created");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method created");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method created");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class created");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class created");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test created");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test created");
	}
	
	@BeforeGroups
	public void beforeGroup() {
		System.out.println("Before Groups created");
	}
	
	@AfterGroups
	public void afterGroup() {
		System.out.println("After Groups created");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite created");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite created");
	}
}
