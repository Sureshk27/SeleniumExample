import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement findElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[1]/div/div[2]/button/input"));
	findElement .sendKeys("salem" +Keys.ENTER);
		// TODO Auto-generated method stub

	}

}
