package section12;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderAnyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions/");
		
		//Open calendar
		driver.findElement(By.xpath("//*[@id=\'travel_date\']")).click();
		
		//Check if month and year selected is not January 2020?
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("February 2020"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
			
		}
	
		List<WebElement> dates= driver.findElements(By.className("day"));
		int count= driver.findElements(By.className("day")).size();
		
		for (int i=0; i<count; i++)
		{//For any selected month index 0 will be the first date displayed and it can be last few days of previous month
		
		//This step iterates and gets one day at a time for the selected month
			String dateText= driver.findElements(By.className("day")).get(i).getText();
			if(dateText.equalsIgnoreCase("18"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
			
	}

}
