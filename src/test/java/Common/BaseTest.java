package Common;

import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import utils.configProperties;

public class BaseTest {
	
	public static String URL=null;
	public static String email;
	public static String password;
	public static String resourceRoot="./src/main/resources/";
	private static configProperties cnf;
	public static WebDriver driver;
	
	public void init() throws IOException
	{
		cnf = new configProperties();
		URL=cnf.config.getProperty("Client_portal");
		
	}
@BeforeSuite
@Parameters(value={"browser"})
public void lunchBrowser(String browser) throws IOException
{
	//System.out.println("init function er age>>>>"+browser);
	init();
	if (browser.equals("chrome"))
	{
		System.out.println(URL);
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
}

}
