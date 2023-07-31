package PopUp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions settings=new ChromeOptions();
	settings.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(settings);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	driver.get("https://in.via.com/");
	driver.findElement(By.id("departure")).click();
	LocalDateTime date=LocalDateTime.now().plusMonths(2).plusDays(0);
	String month = date.getMonth().toString();
	int year = date.getYear();
	int day = date.getDayOfMonth();
	month=month.charAt(0)+month.substring(1, 3).toLowerCase();
	
	for(;;) {
		try {
			driver.findElement(By.xpath("//span[contains(text(),'"+month+"')]/../..//span[text()=' "+year+"']/../..//div[text()='"+day+"'and @class='vc-cell ']")).click();
		
			break;
		}
		catch (Exception e) {
			driver.findElement(By.xpath("//span[contains(@class,'js-next-month')]")).click();
		}
	}
	
	
	Thread.sleep(7000);
	driver.quit();
}
}
