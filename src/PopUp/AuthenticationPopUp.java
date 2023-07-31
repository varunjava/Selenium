package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	                //username:password@
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	Thread.sleep(4000);
	driver.quit();
}
}
