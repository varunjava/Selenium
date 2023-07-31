package webElementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2ShoppersStack {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.shoppersstack.com/products_page/114");
	Thread.sleep(12000);
	String windId=driver.getWindowHandle();
	driver.findElement(By.id("compare")).click();
	Set<String> allWindId = driver.getWindowHandles();
	for(String wid : allWindId)
	{
		
		driver.switchTo().window(wid);
		if(driver.getTitle().contains("ebay"))
		{
			driver.close();
		}
	}	
	
	Thread.sleep(4000);
	//driver.quit();
}
}
