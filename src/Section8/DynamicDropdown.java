package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Select Browser and open the website
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

//*******************Open Dynamic dropdown list 1**********************//

		driver.findElement(By.id("divpaxinfo")).click();

		// Sleep for some time to avoid synchronization failures
		Thread.sleep(1000);
		/*
		 * Using a While loop int i=0; while(i<4) {
		 * driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */

		// Or Using A for Loop
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		//// *[@id="divpaxinfo"]
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// $x=("//a[@value='Chennai (MAA)']")

//******************* Dynamic dropdown list 2**********************//	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(1000);

//This is very important. It selects the second instance of the xpath which is shared by two elements.
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

//******************* Dynamic dropdown list using parent child relationship**********************//	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).clear();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GAU']"))
				.click();

	}

}
