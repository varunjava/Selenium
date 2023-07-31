package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandContextClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions action=new Actions(driver);
	action.contextClick(rightClick).perform();
	
	Thread.sleep(4000);
	driver.quit();
}
}
