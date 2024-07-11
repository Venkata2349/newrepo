package SeleniumMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGexample {
	@BeforeSuite
	public void checking1()
	{
		System.out.println("wanted to know the before suite funcationality");
	}
	@AfterSuite
	public void checking2()
	{
		System.out.println("wanted to know the after suite funcationality");
	}
	@BeforeClass
	public static void URL() {
		System.out.println("Enter the URL");
	}
	
	@AfterClass
	public static void Close() {
		System.out.println("Close the browser");
	}
	
	@BeforeMethod
	public static void login() {
		System.out.println("Login appliation");
	}
	
	@AfterMethod
	public static void logout() {
		System.out.println("Logout application");
	}
	@Test(priority = 0)
	public static void breakfast() {
		System.out.println("breakfast ordered");
	}
	@Test(priority = 1)
	public static void lunch() {
		System.out.println("Lunch ordered");
	}
	@Test(enabled = false)
	public static void snaks() {
		System.out.println("snaks ordered");
	}
	@Test(priority = 3)
	public static void dinner()
	{
		System.out.println("Dinner ordered");
	}
}
