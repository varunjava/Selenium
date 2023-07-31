package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	FileInputStream fis = new FileInputStream("./testData/data.properties");
	Properties prop=new Properties();
	prop.load(fis);
	
	String testUrl = (String) prop.get("url");
	driver.get(testUrl);
	driver.findElement(By.id("username")).sendKeys((String) prop.get("username"));
	driver.findElement(By.name("pwd")).sendKeys((String) prop.get("password"));
	
	
	Thread.sleep(3000);
	driver.quit();
	
	
	
}
}
