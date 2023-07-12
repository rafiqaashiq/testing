package selenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingTabs {

	public static void main(String[] args) {
		
		// 1) open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2) maximize it
		driver.manage().window().maximize();
		
		// 3) navigate to application
		driver.get("https://facebook.com/");
		
		// 4) click on instagram
		driver.findElement(By.linkText("Instagram")).click();
		
		// 5) switch focus on new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		// wait for the next page to load completely
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		// 6) write 'zepher@gmail.com' in the email textbox of instagram page
		driver.findElement(By.name("username")).sendKeys("zepher@gmail.com");
	}
}
