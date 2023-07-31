package webDriverMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetWindowsHandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/MultipleWindow.html");
	System.out.println(driver.getTitle());	
	driver.findElement(By.xpath("//input[@value=\"Open Food Sites\"]")).click();
	Thread.sleep(3000);
	Set<String> allWindowId = driver.getWindowHandles();
	for(String windowId : allWindowId)
	{
		System.out.println(windowId);
	}
	
	Thread.sleep(2000);
	driver.quit();
}
}
