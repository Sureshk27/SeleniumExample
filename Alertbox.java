import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT.VAISHNI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Alert.html");
        
        WebElement alertbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
        alertbox.click();
        
        Alert alert = driver.switchTo().alert();
        Thread.sleep(4000);
        alert.accept();
        
        WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        confirmbox.click();
        
        Alert confirmalert = driver.switchTo().alert();
        Thread.sleep(4000);
        confirmalert.dismiss();
        
        WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
        promptBox.click();
        
        Alert promptalert = driver.switchTo().alert();
        promptalert.sendKeys("suresh");
        Thread.sleep(4000);
        promptalert.accept();
        
        
        
        

	}

}
