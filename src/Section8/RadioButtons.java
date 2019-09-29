package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		//1. Radio button by unique ID in the html
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
				
		
		//2. By Index of the group of options available
		driver.findElements(By.xpath("//input[@name='group2']")).get(1).click();
		Thread.sleep(500);
		
		//3. Based on text seen in UI and assuming there is no value attribute.
		int count= driver.findElements(By.xpath("//input[@name='group2']")).size();
		for(int i=0; i <count; i++)
		{
			String val= driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");
			System.out.println(val);
			if(val.equals("Beer"))
			{
				driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
			}
			
			
		}
		
		
	}

}
