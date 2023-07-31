package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.html5.RemoveLocalStorageItem;

public class Task3PolarBear {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://polarbear.co.in/");
	Thread.sleep(1000);
	String winId = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[contains(text(),'Order')]")).click();
	Thread.sleep(1000);
	Set<String> allWindId = driver.getWindowHandles();
	allWindId.remove(winId);
	for(String wid:allWindId)
	{
		driver.switchTo().window(wid);
		String text = driver.findElement(By.xpath("//div[contains(text(),'location to ')]")).getText();
		System.out.println(text);
	}
	
	
	driver.quit();
}
}
