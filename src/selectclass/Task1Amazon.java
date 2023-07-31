package selectclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Task1Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(dropDown);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		select.selectByValue("search-alias=electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("airpods", Keys.ENTER);
		String windId = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[contains(@alt,'Sponsored Ad - Apple AirPods')]")).click();
		Set<String> allWindId = driver.getWindowHandles();
		allWindId.remove(windId);
		for (String id : allWindId) {
			driver.switchTo().window(id);
		}

		driver.findElement(By.xpath("//span[text()=' Free Delivery ']")).click();
		WebElement popMsg = driver.findElement(By.xpath("//div[@class='a-popover-inner']"));
		File src = popMsg.getScreenshotAs(OutputType.FILE);
		File dst = new File("./errorShots/airpods1.png");
		FileHandler.copy(src, dst);

		Thread.sleep(3000);
		driver.quit();

	}
}
