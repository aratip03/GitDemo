package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(100);
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.cssSelector(".react-autosuggest__input")).sendKeys("MUM");
		Thread.sleep(500);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();

		// Save repetitive content in a web-element named 'target'
		// WebElement Target=driver.findElement(By.id("toCity"));
		// arget.sendKeys("DE");
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("NEW");
		Thread.sleep(500);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
		}
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);

	}

}
