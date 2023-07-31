package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://restaurants.kfc.co.in/location/karnataka/bangalore");
	Thread.sleep(2000);
	String windowId = driver.getWindowHandle();
	driver.findElement(By.xpath("(//span[text()=' Start My Order '])[2]")).click();
	Set<String> allWindId = driver.getWindowHandles();
	allWindId.remove(windowId);
	for(String wid:allWindId) {
		driver.switchTo().window(wid);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Deals']")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//h2[contains(text(),'Deals & Offers')]")).getText();
		System.out.println(text);
	}
	
	driver.quit();
	
}
}
