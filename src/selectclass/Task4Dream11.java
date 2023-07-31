package selectclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4Dream11 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.dream11.com/");
	driver.switchTo().frame(0);
	driver.findElement(By.id("regEmail")).sendKeys("9916210081");
	
	Thread.sleep(7000);
	driver.quit();
	
}
}
