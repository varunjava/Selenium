package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyChildWindows {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/MultipleWindow.html");
	System.out.println(driver.getTitle());	
	driver.findElement(By.xpath("//input[@value=\"Open Food Sites\"]")).click();
	Thread.sleep(3000);
	Set<String> allWindowsId=driver.getWindowHandles();
	for(String windowId : allWindowsId)
	{
		driver.switchTo().window(windowId);
//		driver.close();
//		Thread.sleep(1000);
		if(driver.getTitle().contains("Olive") || driver.getTitle().contains("barbeque")||driver.getTitle().contains("Italian"))
		{
			driver.close();
		}
}
}
}
