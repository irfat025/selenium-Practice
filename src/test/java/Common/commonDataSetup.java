package Common;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class commonDataSetup {
	@BeforeSuite
	public void datasetup()
	{
		System.out.println("common data setup");
	}
	@AfterSuite
	public void dataTeardown()
	{
		System.out.println("common data cleanup");
	}
	

}
