package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	driver.get("https://in.puma.com/in/en");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
			
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
