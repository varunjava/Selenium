package locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5WoodenStreet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		String parentWid = driver.getWindowHandle();
		Thread.sleep(2000);
		for (;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			} catch (Exception e) {
				Thread.sleep(2000);
			}
		}

		driver.findElement(By.xpath("//ul[@class='container flex']/li[4]")).click();
		driver.findElement(By.xpath("//div[@class='top-list']/a[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'load-product-item')][1]/div[4]")).click();
		Set<String> allWinId = driver.getWindowHandles();
		allWinId.remove(parentWid);
		for (String wid : allWinId)
		{
			String price = driver.findElement(By.xpath("//span[@class='offerprice' and not(@class='offprice')]"))
					.getText();
			System.out.println(price);
		}

		driver.quit();

	}
}
