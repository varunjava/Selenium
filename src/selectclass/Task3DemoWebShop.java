package selectclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3DemoWebShop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	WebElement position = driver.findElement(By.id("products-orderby"));
	Select select = new Select(position);
	select.selectByIndex(0);
	List<WebElement> selectOptions = select.getAllSelectedOptions();
	for(WebElement option:selectOptions)
	{
		System.out.println(option.getText());
	}
	
	
	
	Thread.sleep(3000);
	driver.quit();
}
}
