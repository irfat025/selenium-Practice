package UI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitletest {
@Test
	public void titleTest() 
	{
		String title ="KIWA";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://qa-glass.kiwasystem.com/");
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, title);
		driver.close();
	}
}
