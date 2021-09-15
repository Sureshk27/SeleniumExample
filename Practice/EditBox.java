package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ELCOT.VAISHNI\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Edit.html");
	
	WebElement emailBox = driver.findElement(By.id("email"));
	emailBox.sendKeys("suresh@gmail.com");
	
WebElement appendText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
appendText.sendKeys("suresh");

WebElement printText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
String print = printText.getAttribute("value");
System.out.println(print);

WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
clearBox.clear();

WebElement disableBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
boolean enabled = disableBox.isEnabled();
System.out.println("is disable :"+enabled);
	}

}
