package UI;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import Common.commonDataSetup;

@Test(groups="Registration")
public class Group2forSuite extends commonDataSetup {
	
	@Test(priority=1,groups="Smoke Test" )
public void loginCheck()
{
		System.out.println("hi  hello in smoke test");
}

	@Test(priority=2)
	public void logoutCheck()
	{
			System.out.println("logout  hello");
	}
@BeforeTest

public void loginToApplication()
{
		System.out.println("login should be done");
}
@AfterTest
public void logoutToApplication()
{
		System.out.println("logout should be done");
}




@BeforeMethod

public void Dbconnect()
{
		System.out.println("db connected");
}
@AfterMethod
public void Dbdiscunnect()
{
		System.out.println("db disconnected");
}

@BeforeClass

public void beforeClass()
{
		System.out.println("before class is executed");
}
@AfterClass
public void afterClass()
{
		System.out.println("after class is executed");
}
@BeforeGroups(value="Smoke Test")
public void beforeGropu()
{
		System.out.println("before grpup is executed");
}




}
