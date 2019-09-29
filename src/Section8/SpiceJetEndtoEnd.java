package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		// Select Roundtrip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		// Select Cities
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

		// Select Date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(1000);

		// Select Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);

		int i = 0;
		while (i < 4) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		// Select Currency
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");

		// Click on Search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
