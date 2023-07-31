package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//div[contains(text(),'Log in')]/.."));
		System.out.println(login.isEnabled());
		driver.findElement(By.name("username")).sendKeys("Varun");
		driver.findElement(By.name("password")).sendKeys("123@123");
		System.out.println(login.isEnabled());
		
		// tounderstand   getAttributevalue() method 
		WebElement un = driver.findElement(By.name("username"));
		WebElement pwd = driver.findElement(By.name("password"));
		un.sendKeys("varun.m_");
		pwd.sendKeys("123@123");
		System.out.println(un.getAttribute("value"));
		System.out.println(pwd.getAttribute("value"));
		
		Thread.sleep(2000);
		driver.quit();
	}
}
