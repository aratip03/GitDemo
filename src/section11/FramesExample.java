package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
	//This will not work as frame cannot be identified by findElemtn
		//driver.findElement(By.id("draggable")).isDisplayed();
		
		//Find how many frames are there. Use this before switching to frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	
		
		//Use this for switching to frames
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//Or Switch to frame by index. Since One frame only on the webpage, index is 0
		//driver.switchTo().frame(0);
		driver.findElement(By.id("draggable")).click();
		
		//Define Webelements
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
						
		//Create action class to drag and drop
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
				
		//To switch out of frames
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("#menu-top > li:nth-child(7) > a")).click();
		
	}

}
