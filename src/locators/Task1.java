package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("Varun");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("M");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("varunm@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);

		driver.quit();
	}
}