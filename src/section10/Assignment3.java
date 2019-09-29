package section10;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// WebElement for Explicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);
				
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		// Expected array of products to be added;
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		// We need Explicit wait here.
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		var ResultVal = driver.findElement(By.id("results")).getText();
		System.out.println(ResultVal);
	}
}
	
