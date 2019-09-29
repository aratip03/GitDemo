package Section09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/");
		driver.findElement(By.xpath("//*[@id=\"search-form-col\"]/wl-search-form-block/form/div[1]/div/wl-location-typeahead/div/input")).click();
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/ui-view/section/div/div/wl-search-form-block/form/div[1]/div/wl-location-typeahead/div/input")).sendKeys("NYC");
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/ui-view/section/div/div/wl-search-form-block/form/div[1]/div/wl-location-typeahead/div/input")).sendKeys(Keys.TAB);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/ui-view/section/div/div/wl-search-form-block/form/div[4]/div/button")).click();

	}
}
