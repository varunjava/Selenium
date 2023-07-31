package webElementMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Sleeper;

public class ToCaptureScreenshotOfWebElement {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://wildcraft.com/");
	TakesScreenshot ts=(TakesScreenshot) driver;    // no use here
	

	WebElement wildcraft = driver.findElement(By.xpath("//img[contains(@title,'Wildcraft')]"));
	File dest=new File("./errorShots/img2.png");
	File src=wildcraft.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, dest);
	
	Thread.sleep(2000);
	driver.quit();
}
}
