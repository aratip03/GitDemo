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

public class ExplicitWait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// WebElement for Explicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);
				

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		// Expected array of products to be added;
		String[] ItemsNeeded = { "Cucumber", "Tomato", "Mushroom", "Carrot", "Pumpkin" };
		addItems(driver,ItemsNeeded);
			
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		// We need Explicit wait here.
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		// We need Explicit wait here.
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		var PromoValue = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(PromoValue);
	}
	
	public static void addItems(WebDriver driver, String[] ItemsNeeded)
	{// Used 'FindElements' since we want all the products on page to be listed
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

	int j = 0;

	for (int i = 0; i < products.size(); i++) {
		String Name = products.get(i).getText();
		// Format the name to remove the space and '-1kg' from the name
		String NameSplit[] = Name.split("-");

		// Format to remove space
		String FormattedName = NameSplit[0].trim();

		// Check if the name extracted is present in the array list to be clicked
		// Convert Array into Array list for easy search
		List ItemsNeededList = Arrays.asList(ItemsNeeded);

		if (ItemsNeededList.contains(FormattedName)) {
			j++;
			// driver.findElements(By.xpath("//button[text()='ADD TO
			// CART']")).get(i).click();
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			// To stop loop after all elements in the array to be searched are met.
			if (j == ItemsNeeded.length) {
				break;
			}
		}
	}
	}
}
	
