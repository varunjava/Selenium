package selectclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandMultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/");
		WebElement dropDown = driver.findElement(By.id("cars"));
		Select select = new Select(dropDown);
		select.selectByValue("99");
		Thread.sleep(1000);
		select.selectByVisibleText("More Than INR 500 ( 55 )");
		Thread.sleep(1000);
		select.selectByIndex(3);
		System.out.println(select.getFirstSelectedOption().getText()); // 99
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		System.out.println("all the selected options");
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}

		List<WebElement> allOptions = select.getOptions();
		System.out.println("all the options");
		for (WebElement options : allOptions) {
			System.out.println(options.getText());

		}

		Thread.sleep(3000);
		driver.quit();
	}
}
