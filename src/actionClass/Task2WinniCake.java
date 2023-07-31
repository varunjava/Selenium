package actionClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Task2WinniCake {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://www.winni.in/");
		WebElement cakes = driver.findElement(By.xpath("//a[contains(text(),'CAKES')]"));
		Actions action = new Actions(driver);
		action.moveToElement(cakes).perform();
		/*
		WebElement byFlav = driver.findElement(By.xpath("//div[text()='Cakes By Flavour']"));
		action.moveToElement(byFlav).perform();*/
		 driver.findElement(By.xpath("//a[text()='Chocolate Cakes']")).click();
//		action.moveToElement(chocoCake).click().perform();
		String winId = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@title='Death By Chocolate Cake']")).click();
		Set<String> allWinId = driver.getWindowHandles();
		allWinId.remove(winId);
		for (String id : allWinId) {
			driver.switchTo().window(id);
		}
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Pincode')]")).sendKeys("560078");
		driver.findElement(By.xpath("//a[text()='Check']")).click();

		WebElement delTxt = driver.findElement(By.id("avlMsg"));
		WebElement codTxt = driver.findElement(By.id("avlMsgCod"));

		System.out.println(delTxt.getText());
		System.out.println(codTxt.getText());

		File delTxt1 = new File("./errorShots/deltxt.png");
		File codTxt1 = new File("./errorShots/codtxt.jpeg");
		File delTxtsrc = delTxt.getScreenshotAs(OutputType.FILE);
		File codTxtsrc = codTxt.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(delTxtsrc, delTxt1);
		FileHandler.copy(codTxtsrc, codTxt1);

		Thread.sleep(3000);
		driver.quit();
	}
}
