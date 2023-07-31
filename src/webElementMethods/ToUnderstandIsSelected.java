package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandIsSelected {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	WebElement radioButton = driver.findElement(By.id("pollanswers-1"));
	System.out.println(radioButton.isDisplayed());
	System.out.println(radioButton.isSelected());
	radioButton.click();
	System.out.println(radioButton.isSelected());
	
	Thread.sleep(2000);
	driver.quit();
	
}
}
