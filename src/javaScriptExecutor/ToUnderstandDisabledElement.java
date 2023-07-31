package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandDisabledElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
	driver.get("https://demoapp.skillrary.com/");
	WebElement ele = driver.findElement(By.xpath("//input[@class='form-control']"));
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].value='hi'", ele );
	
	
	Thread.sleep(3000);
	driver.quit();
	
	
	
}
}
