package section11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


				
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
				//Data structure gives all the browser Ids which are opened by selenium.
				Set<String>ids = driver.getWindowHandles();
				
				//Create Iterator object(it) to iterate to the correct browser based on id
				Iterator<String>it= ids.iterator();
				
				//CLicking next goes to first ID (Parent) ; Another next goes to the first child window;
				String ParentId= it.next();
				String ChildId= it.next();
				
				//to switch to different window/tab
				
				driver.switchTo().window(ChildId);
							
				System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
				driver.switchTo().window(ParentId);
				System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());
				
	}
}
	
