package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropbox1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropbox1);
		select.selectByIndex(0);
		select.selectByVisibleText("Appium");
		select.selectByValue("4");
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		dropbox1.sendKeys("Loadrunner");
		
	 WebElement selectYourProgram = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[1]"));
		Select selectprogram = new Select(selectYourProgram);
		selectprogram.selectByIndex(0);
		selectprogram.selectByIndex(2);
		
		
		
		
		
	}

}
