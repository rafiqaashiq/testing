package in.amazon.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		// 1) open the browser
		driver = new ChromeDriver();
		
		// 2) maximize it
		driver.manage().window().maximize();
		
		// 3) navigate to "https://www.amazon.in/"
		driver.get("https://www.amazon.in/");
	}
	
	@AfterTest
	public void closeBrowser() {
		// 9) close the browser
		driver.quit();
	}
}
