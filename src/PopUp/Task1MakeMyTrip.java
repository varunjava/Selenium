package PopUp;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1MakeMyTrip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	driver.get("https://www.ixigo.com/");
	LocalDateTime date=LocalDateTime.now().plusMonths(3).plusDays(10);
	String month = date.getMonth().toString();
	month=month.charAt(0)+month.substring(1).toLowerCase();
	int year = date.getYear();
	int day = date.getDayOfMonth();
	System.out.println(month+"  "+year+"  "+day);
	
	driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
	
	for(;;) {
		try {
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/..//div[text()='"+day+"']")).click();
		break;
	}
	catch (Exception e) {
		driver.findElement(By.xpath("//button[contains(@class,'rd-next')]")).click();

	}
	}
	Thread.sleep(4000);
	driver.quit();
}
}
