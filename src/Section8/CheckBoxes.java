package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(100);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	
		//Check if checkbox is selected using TestNg Assertions
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Find number of checkboxes on the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		//*******************Open Dynamic dropdown list 1**********************//
		
				driver.findElement(By.id("divpaxinfo")).click();
				
				//Sleep for some time to avoid synchronization failures
				Thread.sleep(1000); 
				
				
				for(int i=0;i<4;i++)
				{
					driver.findElement(By.id("hrefIncAdt")).click();
					
				}
				driver.findElement(By.id("btnclosepaxoption")).click();
				////*[@id="divpaxinfo"]
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		
		
		
	}

}
