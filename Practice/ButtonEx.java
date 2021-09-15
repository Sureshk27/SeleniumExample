package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		WebElement findPosition = driver.findElement(By.id("position"));
		int x = findPosition.getLocation().getX();
		int y = findPosition.getLocation().getY();
		System.out.println("position of x : " +x + "position of y : " +y);
		
		WebElement findColor = driver.findElement(By.id("color"));
		String color = findColor.getCssValue("background-color");
		System.out.println("The color is :" +color);
		
		WebElement findSize = driver.findElement(By.id("size"));
		int height = findSize.getSize().getHeight();
		int width = findSize.getSize().getWidth();
		System.out.println("The height is :" +height + "The width is : " +width);
		
		WebElement gotoHome = driver.findElement(By.id("home"));
		gotoHome.click();
	}

}
