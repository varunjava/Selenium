package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandClearMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement username=driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("Varun");
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("123@123");
	
	Thread.sleep(2000);
	driver.quit();
}
}
