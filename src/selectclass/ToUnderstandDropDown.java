package selectclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/signup");
		WebElement day = driver.findElement(By.id("day"));

		Select select = new Select(day);
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByValue("10");

		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByValue("9");

		Thread.sleep(3000);
		driver.quit();

	}

}
