package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExternalElements {

	public static void main(String[] args) throws InterruptedException {
		
		// 1) open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2) maximize it
		driver.manage().window().maximize();
		
		// 3) navigate to application
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		// 4) click on 'continue to login' button
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		
		// 5) click on 'login' button
		driver.findElement(By.id("Button2")).click();
		
		Thread.sleep(3000);
		
		// 6) close the alert box
		driver.switchTo().alert().accept();
	}
}
