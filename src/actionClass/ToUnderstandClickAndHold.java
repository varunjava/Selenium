package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandClickAndHold {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	driver.findElement(By.id("userName")).sendKeys("Varun");
	driver.findElement(By.id("password")).sendKeys("123sbi");
	Actions action=new Actions(driver);
	action.moveByOffset(1296,316).clickAndHold().perform();
	
	Thread.sleep(7000);
	
	driver.quit();
	
}
}
