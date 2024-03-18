package UI;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class loginTest {

	@Test(priority=1 )
public void loginCheck()
{
		System.out.println("hi  hello");
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













}
