package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task4Puma {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions settings=new ChromeOptions();
	settings.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(settings);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	driver.get("https://in.puma.com/in/en");
	driver.findElement(By.xpath("//span[contains(text(),'New & Trending')]")).click();
	String txt = driver.findElement(By.xpath("//h3[text()='Clyde OG Unisex Sneakers']/span[text()='PUMA Black-Yellow Sizzle']/../..//span[@data-test-id='price']")).getText();
	System.err.println(txt);
	
	Thread.sleep(3000);
	driver.quit();
}
}
