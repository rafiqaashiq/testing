package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploads {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		// 1) open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2) maximize it
		driver.manage().window().maximize();
		
		// 3) navigate to application
		driver.get("https://www.remove.bg/");
		
		// 4) click "select files to upload" button
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[3]")).click();
		
		Thread.sleep(3000);
		
		// 5) handover the control to autoit to select a file from the loacal machine, click on 'open' button
		Runtime.getRuntime().exec("resources//Fileupload.exe");
	}
}
