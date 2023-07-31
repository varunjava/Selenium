package webElementMethods;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3DanielKlein {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://danielklein.in/");
	for(;;)
	{
		try
		{
			driver.findElement(By.xpath("//button[@class='popup__dismiss-icon']")).click();
			break;
		}
		catch(Exception e) {
			Thread.sleep(3000);
		}
	}
	
    List<WebElement> navBarEle = driver.findElements(By.xpath("//ul[@class='header__links-list fs-navigation-base']/./li"));
	for(WebElement ele : navBarEle)
	{
 	System.out.println(ele.getText());
	}
	
	driver.findElement(By.xpath("//ul[@class='header__links-list fs-navigation-base']/./li[4]")).click();
	Thread.sleep(6000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement product = driver.findElement(By.xpath("//a[contains(text(),'Daniel Klein Exclusive Men Grey')]"));
	js.executeScript("arguments[0].click()", product);

	
	Thread.sleep(3000);
	driver.quit();
}
}
