package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToUnderstandNotificationPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions settings=new ChromeOptions();
	settings.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(settings);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	driver.get("https://www.kalkifashion.com/");
	
	
	
}
}
