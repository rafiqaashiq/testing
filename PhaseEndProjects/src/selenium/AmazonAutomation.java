package selenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAutomation {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Electronics");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement mobile = driver.findElement(By.linkText("Mobiles & Accessories"));
		Actions action = new Actions(driver);
		action.moveToElement(mobile).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Apple")));
		
		driver.findElement(By.linkText("Apple")).click();
		
		driver.findElement(By.xpath("(//a[contains(@class,'link-normal s-no')])[1]")).click();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		driver.findElement(By.id("mbb-offeringID-1")).click();
		driver.findElement(By.id("gift-wrap")).click();
		driver.findElement(By.xpath("(//input[contains(@id,'buy')])[4]")).click();
		
		String expectedTitle = "Amazon Sign In";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");
		
		driver.quit();
		
	}
}
