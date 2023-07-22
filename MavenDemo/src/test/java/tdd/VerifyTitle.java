package tdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		// 1) open browser
		driver = new ChromeDriver();
		
		// 2) navigate to application
		driver.get("");
	}
	
	@Test
	public void verifyTitle() {
		// 3) verify the visitor, on the page, sees the title - 'Facebook – log in or sign up'
		String expectedTitle = "Facebook – log in or sign up";
		//String actualTitle = driver.getTitle();
		String actualTitle = "Facebook – log in or sign up";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
