package pack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arati_pawar\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.rediff.com//");
		
		//using CSS Regular expression
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("username");
		driver.findElement(By.cssSelector("input#password")).sendKeys("pass");
		
		//using xpath regular expression
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();  
		
	}

}
