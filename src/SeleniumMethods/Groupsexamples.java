package SeleniumMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groupsexamples {
	
	@BeforeGroups("Swiggy")
	public void fooditesm() {
		System.out.println("it is belonging to order food items only");
	}
	@BeforeClass
	public void login() {
		System.out.println("Login application");
	}
	@AfterClass
	public void logout() {
		System.out.println("Logout application");
	}
	@BeforeMethod
	public void choose_to_Ordered() {
		System.out.println("Need ot order which we want");
	}
	@AfterMethod
	public void ordered() {
		System.out.println("Orderd completed");
	}
	@Test(groups= {"Swiggy"})
	public void breakfast() {
		System.out.println("breakfast orderd");
	}
	@Test
	public void bluetooth() {
		System.out.println("bluetooth order using amazon");
	}
	@Test(groups= {"Swiggy"})
	public void lunch() {
		System.out.println("Lunch orderd");
	}
	@Test
	public void phone() {
		System.out.println("Phone ordered");
	}

}
