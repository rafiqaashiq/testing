package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioButton {

	public static void main(String[] args) {
		
		// 1) open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2) maximize it
		driver.manage().window().maximize();
		
		// 3) navigate to application
		driver.get("https://letcode.in/radio");
		
		// 4) select 'yes' radio button from 'select any one' option
		driver.findElement(By.id("yes")).click();
		
		// 5) check the last check box
		driver.findElement(By.xpath("(//input[contains(@type, 'checkbox')])[2]")).click();
	}
}
