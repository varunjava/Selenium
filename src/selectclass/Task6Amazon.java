package selectclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6Amazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	driver.get("https://www.amazon.in/dp/B088PZ8DNV/ref=syn_sd_onsite_desktop_0?ie=UTF8&psc=1&pd_rd_plhdr=t");
	WebElement frame1 = driver.findElement(By.xpath("//iframe[contains(@name,'Detail_desktop-detail')]"));
	driver.switchTo().frame(frame1);
	WebElement txt = driver.findElement(By.xpath("//div[contains(@class,'grid-product-title h-full f')]"));
	System.out.println(txt.getText());
	
	
	Thread.sleep(3000);
	driver.quit();
}
}
