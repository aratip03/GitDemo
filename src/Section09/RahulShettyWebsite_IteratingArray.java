package Section09;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyWebsite_IteratingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		// Expected array of products to be added;
		String[] ItemsNeeded = { "Cucumber", "Tomato", "Mushroom", "Carrot","Pumpkin" };

		// Used 'FindElements' since we want all the products on page to be listed
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int j=0;
		
		for (int i = 0; i < products.size(); i++) {
			String Name = products.get(i).getText();
			// Format the name to remove the space and '-1kg' from the name
			String NameSplit[] = Name.split("-");

			// Format to remove space
			String FormattedName= NameSplit[0].trim();

			// Check if the name extracted is present in the array list to be clicked
			// Convert Array into Array list for easy search

			List ItemsNeededList = Arrays.asList(ItemsNeeded);
			
			if (ItemsNeededList.contains(FormattedName)) 
			{
				j++;
				
				// this fails as previous click changes Add to Cart to Added and the array index thus changes
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();				

				//To stop loop after all elements in the array to be searched are met.
				if(j==ItemsNeeded.length)
				{
					break;
				}
			}
		}
	}
}
