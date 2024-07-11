package SeleniumMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGassignment {
@BeforeSuite
    public void suit1()
{
	System.out.println("need to ccheck suit");
}
@AfterSuite
    public void Asuit()
{
	System.out.println("neet to check after suit");
}
@BeforeClass
    public void openUrl()
{
	System.out.println("Open the flipkart url");
}
@AfterClass
public void closeUrl()
{
    System.out.println("close the url");
}

@BeforeMethod
public void login()
{ 
	System.out.println("Login with credentials");
}
@AfterMethod
public void logout()
{
	System.out.println("logout");
}

@Test(priority = 0)
public void cloths()
{
	System.out.println("select cloths");
}
@Test(priority = 4)
public void electronic()
{
	System.out.println("select electronics");
	}
@Test(priority = 2)
public void homeneeds()
{
	System.out.println("select homeneeds");
	}
@Test(priority = 3)
    public void Mobiles()
{
	System.out.println("select mobiles");
	}

}

