package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetCssMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	WebElement errmsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
	Thread.sleep(2000);
	System.out.println(errmsg.getCssValue("color"));
	System.out.println(errmsg.getCssValue("text-align"));
	System.out.println(errmsg.getCssValue("font-family"));
	//other two methods
	System.out.println(errmsg.getLocation());			//getLocation
	System.out.println(errmsg.getSize());				//getSize

	
	Thread.sleep(2000);
	driver.quit();
}
}
