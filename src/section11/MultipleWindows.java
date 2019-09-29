package section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\arati_pawar\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		//driver.get("https://policies.google.com/privacy?gl=US&hl=en");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[2]/a")).click();
		
		//sSystem.out.println(driver.getTitle());
				
		//Data structure gives all the browser Ids which are opened by selenium.
		Set<String>ids = driver.getWindowHandles();
		
		//Create Iterator object(it) to iterate to the correct browser based on id
		Iterator<String> it= ids.iterator();
		
		//CLicking next goes to first ID (Parent) ; Another next goes to the first child window;
		
		String ParentId= it.next();
		String ChildId= it.next();
		
		//to switch to different window/tab and get the title of each window
		
		driver.switchTo().window(ChildId);
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(ParentId);
		
		System.out.println(driver.getTitle());
	}

}
