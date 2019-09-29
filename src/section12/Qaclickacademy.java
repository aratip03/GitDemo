package section12;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qaclickacademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//1. Get count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Count of links in Footer
		//Limit scope of driver
		WebElement footerDriver= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		
		//3. Count of first column links in the footer
		//Again make a limited webdriver
		
		WebElement Col1driver= footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Col1driver.findElements(By.tagName("a")).size());
		
		//4. Click on each link and get the title of each window
		int sizeCol1= Col1driver.findElements(By.tagName("a")).size();
		for(int i=1; i< sizeCol1; i++)
		{
			//Create a string to press and open links in diff tabs
			String ClickonLinkTab= Keys.chord(Keys.CONTROL, Keys.ENTER);
					
			// Do not use click since we need to send CTRL+ENTER key
			Col1driver.findElements(By.tagName("a")).get(i).sendKeys(ClickonLinkTab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		//5. Print names of all pages opened
			Set<String>abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
		
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
								
		
	}

	
}
