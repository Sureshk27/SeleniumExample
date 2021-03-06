import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		select.selectByValue("2");
	select.selectByVisibleText("Appium");
	
	List<WebElement> options = select.getOptions();
	int size = options.size();
	System.out.println("Total list of option is :" +size);  
	
	dropdown.sendKeys("selenium");
	 
	WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/option[1]"));
	Select select1 = new Select(dropdown2);
	select1.selectByIndex(1);
	select1.selectByIndex(2);
	select1.selectByIndex(3);
	
	
		

	}

}
