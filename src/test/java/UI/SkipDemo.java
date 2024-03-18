package UI;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemo {
@Test(enabled=false) 
	public void skipTest1()
	{
		System.out.print("skipped test1");
	}
@Test
public void skipTest2()
{
	System.out.print("skipped test");
	throw new SkipException("Skipping second 2  hahaha");

}
boolean detasetup=false; 
@Test

public void skipTest3()
{
	System.out.print("skipped test 3");
	if(detasetup==true)
	{
		System.out.println("Executing the test");
	}
	else
	{
		System.out.println("do not execute");
	throw new SkipException("Skipped test 03");
	}
	
}
}
