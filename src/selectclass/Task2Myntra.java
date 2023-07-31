package selectclass;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.asm.Advice.Enter;

public class Task2Myntra {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");
		String winId = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Sunglass", Keys.ENTER);

		driver.findElement(By.xpath("//img[contains(@title,'Voyage Unisex Black')]")).click();
		Set<String> allWinId = driver.getWindowHandles();
		allWinId.remove(winId);
		for (String id : allWinId) {
			driver.switchTo().window(id);
		}
		driver.findElement(By.xpath("//div[contains(@class,'add-to-wishlist')]")).click();
		WebElement ele= driver.findElement(By.xpath("//div[@class='authPage']"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/MyntraWishlist.jpeg");
		FileHandler.copy( src, dest);

		Thread.sleep(2000);
		driver.quit();

	}
}
