package section12;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//1. Click second Checkbox
		 driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		 String TextToVerify =driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		 System.out.println(TextToVerify);
      
        
		//2. Select the option in the static drop down
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(TextToVerify);
										
		//3. Enter name in text box
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys(TextToVerify);
		driver.findElement(By.id("alertbtn")).click();
		if(driver.switchTo().alert().getText().contains(TextToVerify))
		{
			System.out.println("Test Passed");
		
		}
		else
		{
			System.out.println("Failed");
			}
	}

	
}
