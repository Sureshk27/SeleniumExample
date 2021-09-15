import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement findElement = driver.findElement(By.id("src"));
		findElement.sendKeys("chennai");
		WebElement findElement2 = driver.findElement(By.id("dest"));
		findElement2.sendKeys("salem");
		WebElement findElement3 = driver.findElement(By.id("search_btn"));
		findElement3.sendKeys(Keys.ENTER);
		
		
		
		
		

	}

}
