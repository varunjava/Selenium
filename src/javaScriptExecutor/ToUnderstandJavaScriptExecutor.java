package javaScriptExecutor;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandJavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		for (;;) {
//			try {
//				driver.findElement(By.xpath("//a[text()='Celebrating Justine Siegemund']")).click();
//				break;
//			} catch (Exception e) {
//				js.executeScript("window.scrollBy(0,250)");
//			}
//		}

//		for(;;) {
//			try {
//			driver.findElement(By.xpath("//a[text()='Celebrating Asma Hamza']")).click();
//			break;
//			}
//			catch (Exception e) {
//				js.executeScript("window.scrollto(0,300)");
//			}
//		}
		
		for(;;) {
			try {
			driver.findElement(By.xpath("//a[text()='Sanda Bunsidth's 104th Birthday']")).click();
			break;
			}
			catch (Exception e) {
				js.executeScript("window.scrollTo(0,30000)");      //drawback    where it will directly go to co-ordinates
			}
	}
		Thread.sleep(4000);
		driver.quit();
}
}