package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame("login_page");
	driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	driver.switchTo().alert().dismiss();
	
	Thread.sleep(4000);
	driver.quit();
	
}
}
