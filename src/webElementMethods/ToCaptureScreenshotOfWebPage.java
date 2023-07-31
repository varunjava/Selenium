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

public class ToCaptureScreenshotOfWebPage {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://wildcraft.com/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	File dest=new File("./errorShots/img1.png");
	File src = ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, dest );
	
	// to capture screenshot of web element 
	WebElement wildcraft = driver.findElement(By.xpath("//img[contains(@title,'Wildcraft')]"));
	File dest1=new File("./errorShots/img3.png");
	File src1=wildcraft.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, dest1);
	
	Thread.sleep(2000);
	driver.quit();
	
}
}
