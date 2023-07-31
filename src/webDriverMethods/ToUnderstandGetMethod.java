package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get(
				"https://www.primevideo.com/offers/nonprimehomepage/ref=dvm_pds_amz_in_as_s_gm_170_mkw_sPL46i7Lo-dc?gclid=EAIaIQobChMI48m264adgAMVi5lmAh39HwfGEAAYASAAEgI6fPD_BwE&mrntrk=pcrid_657901934579_slid__pgrid_84577172328_pgeo_9062072_x__adext__ptid_kwd-61602341");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getWindowHandle());
		// 43581DE3A926AE04F400D65CCCE08CD3 Window id of prime for 1st run
		Thread.sleep(5000);
		driver.quit();

	}
}
