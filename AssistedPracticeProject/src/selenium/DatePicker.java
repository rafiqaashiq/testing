package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		// 1) open the browser
		ChromeDriver driver = new ChromeDriver(); // (ctrl + shift + o) to import the class
		
		// 2) maximize it
		driver.manage().window().maximize();
		
		// 3) navigate to application
		driver.get("https://www.expedia.co.in/");
		
		Thread.sleep(1000);

		// 4) click on calendar icon
		driver.findElement(By.id("date_form_field-btn")).click();
		
		// 5) select 9th from the next month
		WebElement nextMonth = driver.findElement(By.xpath("(//table[contains(@class,'weeks')])[2]"));
		List<WebElement> rows = nextMonth.findElements(By.tagName("tr"));
		
		for (int i=1; i<rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("button"));
			
			for(WebElement x : columns) {
				if(x.getAttribute("data-day").equals("9")) {
					x.click();
					break; // stop searching rest of the dates by coming out of the for each loop
				}
			}
		}
		
		// 6) click on 'done' to close the calendar
		driver.findElement(By.xpath("(//button[contains(@class, 'uitk-button-large')])[2]")).click();
	}
}
