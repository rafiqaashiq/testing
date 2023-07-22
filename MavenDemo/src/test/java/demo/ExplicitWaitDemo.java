package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {

	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		driver = new ChromeDriver();
		// 2) maximize it
		driver.manage().window().maximize();
		// 3) navigate to application
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
	}
	
	@Test
	public void verifyText() {
		// 4) click on 'start' button
		driver.findElement(By.id("start")).click();
		
		// 5) verify the text 'Hello World!' appears on the web page
		String expectedText = "Hello World!";
		
		// 6) wait for text to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // wait for max time of 60 secs
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
		
		Assert.assertEquals(actualText, expectedText);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
