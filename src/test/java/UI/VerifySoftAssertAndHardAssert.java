package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifySoftAssertAndHardAssert {
@Test
	public void titleTest() 
	{
		String title ="Electronics, Carsdff, Fashion, Collectibles & More | eBay";
		String extxt= "Search";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle= driver.getTitle();
		SoftAssert softassert =new SoftAssert();
		softassert.assertEquals(actualTitle, title,"title verification failed");
		
		WebElement actualText = driver.findElement(By.id("gh-btn"));
		String txt= actualText.getAttribute("value");
		softassert.assertEquals(txt, extxt, "text verification failed");
		softassert.assertAll();
		driver.close();
	}
}
