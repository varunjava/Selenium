package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tak1DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.findElement(By.id("capitals"));
		WebElement madrid = driver.findElement(By.id("box7"));
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement stockholm = driver.findElement(By.id("box2"));
		WebElement rome = driver.findElement(By.id("box6"));

		WebElement italy = driver.findElement(By.id("box106"));
		WebElement spain = driver.findElement(By.id("box107"));
		WebElement sweden = driver.findElement(By.id("box102"));
		WebElement usa = driver.findElement(By.id("box103"));

		Actions action = new Actions(driver);
		action.dragAndDrop(madrid, spain).perform();
		Thread.sleep(1000);
		action.dragAndDrop(stockholm, sweden).perform();
		Thread.sleep(1000);
		action.dragAndDrop(rome, italy).perform();
		Thread.sleep(1000);
		action.clickAndHold(washington).release(usa).perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
