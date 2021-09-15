import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		WebElement getPostion = driver.findElement(By.id("position"));
		Point xy = getPostion.getLocation();
		int x = xy.getX();
		int y = xy.getY();
		System.out.println("x value is :" +x + "y value is :" +y); 
		
		WebElement buttonColor = driver.findElement(By.id("color"));
		String color = buttonColor.getCssValue("background-color");
		System.out.println("Button color is :" +color);
		
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("The height is :" +height + " The width is :" +width);
		
		WebElement homePage = driver.findElement(By.id("home"));
		homePage.click();
		
		
		

	}

}
