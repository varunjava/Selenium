package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Gift Cards")).click();
	driver.findElement(By.xpath("//a[contains(text(),'$100 Physical Gift Card')]/../..//input[contains(@value,'Add to cart')]")).click();
	Thread.sleep(2000);
	String text=driver.findElement(By.xpath("//h1[contains(text(),' $100 Physical Gift Card')]")).getText();
	System.out.println(text);
	
	
	driver.quit();
}
}
