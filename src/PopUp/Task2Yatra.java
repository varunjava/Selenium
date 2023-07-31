package PopUp;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2Yatra {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions settings=new ChromeOptions();
	settings.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(settings);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	LocalDateTime date = LocalDateTime.now().plusMonths(10).plusDays(2);
	String month = date.getMonth().toString();
	 int Year = date.getYear();
	int day = date.getDayOfMonth();
	month=month.charAt(0)+month.substring(1).toLowerCase();
	String yr = Integer.toString(Year);
	yr=yr.substring(2);
	driver.get("https://www.yatra.com/");
	driver.switchTo().frame("notification-frame-1730621c0");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	driver.findElement(By.id("BE_flight_origin_date")).click();
	for(;;) {
		try {
	driver.findElement(By.xpath("//div[contains(text(),'"+month+"') and contains(text(),'"+yr+"')]/..//td[contains(text(),'"+day+"')] ")).click();
	break;
		}
		catch (Exception e) {
			js.executeScript("window.scrollBy(0,100)");
		}
	}
	
	Thread.sleep(4000);
	driver.quit();
}
}
