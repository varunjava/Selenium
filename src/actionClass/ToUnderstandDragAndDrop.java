package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandDragAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	
	WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement img2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement trgt = driver.findElement(By.id("trash"));
	Actions action=new Actions(driver);
	action.dragAndDrop(img1, trgt).perform();
	action.clickAndHold(img2).release(trgt).perform();
	
	Thread.sleep(3000);
	driver.quit();
}
}
