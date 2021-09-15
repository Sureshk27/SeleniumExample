import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmail {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(" http://gmail.com/");
		// TODO Auto-generated method stub

	}

}
