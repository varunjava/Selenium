package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1SkillRaryDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().dismiss();
	
	Thread.sleep(4000);
	driver.quit();
}
}
