import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		WebElement eMail = driver.findElement(By.id("email"));
		eMail.sendKeys("suresh123@gmail.com");
		
		WebElement appendText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendText.sendKeys("suresh");
		
	    WebElement defaultText = driver.findElement(By.name("username"));	 
	    String val = defaultText.getAttribute("value");
	    System.out.println(val);
	    
	    WebElement clearTxt = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	    clearTxt.clear(); 
	    
	    WebElement disableBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
        boolean disable = disableBox.isEnabled();
        System.out.println(disable);
        
	}

}
