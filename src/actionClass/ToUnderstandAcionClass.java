package actionClass;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandAcionClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	driver.get("https://www.meesho.com/");
	WebElement homeAndKitchen = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
	Actions action=new Actions(driver);
	action.moveToElement(homeAndKitchen).perform();
	
	driver.findElement(By.xpath("//p[text()='Clocks']")).click();
	
	Thread.sleep(8000);
	driver.quit();
	
}
}
