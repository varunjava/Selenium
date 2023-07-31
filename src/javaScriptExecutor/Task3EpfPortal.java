package javaScriptExecutor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3EpfPortal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
	driver.get("https://www.epfindia.gov.in/");
	String winId = driver.getWindowHandle();
	driver.findElement(By.xpath("(//a[contains(text(),'Pensioners')])[2]")).click();
	Set<String> allWinId = driver.getWindowHandles();
	allWinId.remove(winId);
	for(String id : allWinId)
	{
		driver.switchTo().window(id);
	}
	driver.findElement(By.xpath("//b[text()=' Knows your PPO No.']")).click();
	driver.findElement(By.id("bankbtn")).click();
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(3000);
	driver.quit();
	
}
}
