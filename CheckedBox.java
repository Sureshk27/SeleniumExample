import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckedBox {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement java= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]"));
		java.click();
		
		WebElement selenium = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div"));
		boolean select = selenium.isSelected();
		System.out.println(select);
		
		WebElement deselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]"));
		if (deselect.isSelected()) {
			deselect.click();
			
		}
			
		WebElement deselect1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]"));
		if (deselect1.isSelected()) {
			deselect1.click();
		}
		
	}
}
