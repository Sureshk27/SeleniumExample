package Practice;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		TakesScreenshot tsh = (TakesScreenshot) driver;
		File s = tsh.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\ELCOT.VAISHNI\\Pictures\\Saved Pictures");
		FileUtils.copyFile(s, d);
		
	}

}
