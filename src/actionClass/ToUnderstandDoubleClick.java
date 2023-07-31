package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandDoubleClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	WebElement add = driver.findElement(By.id("add"));
	Actions action=new Actions(driver);
	Thread.sleep(1000);
	action.doubleClick(add).perform();
	Thread.sleep(1000);
	action.doubleClick(add).perform();
	Thread.sleep(1000);
	action.doubleClick(add).perform();
	Thread.sleep(1000);
	WebElement minus = driver.findElement(By.id("minus"));
	action.doubleClick(minus).perform();
	Thread.sleep(1000);
	action.doubleClick(minus).perform();
	Thread.sleep(1000);
	
	Thread.sleep(3000);
	driver.quit();
	
}
}
