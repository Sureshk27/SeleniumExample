import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");

		String oldWindow = driver.getWindowHandle();

		WebElement homePage = driver.findElement(By.id("home"));
		homePage.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		driver.close();

		driver.switchTo().window(oldWindow);

		WebElement multipleWindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		multipleWindow.click();

		int numberofWindow = driver.getWindowHandles().size();
		System.out.println("number of open window :" +numberofWindow);

		WebElement dontClose = driver.findElement(By.id("color"));
		dontClose.click();

		Set<String> newwindow = driver.getWindowHandles();
		for (String allwindow : newwindow) {
			if(!allwindow.equals(oldWindow)) {
				driver.switchTo().window(allwindow);
				driver.close();

			}
		}
		driver.quit();
	}

}
