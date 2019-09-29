package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().fullscreen();
		
	//Move to specific element
		Actions a= new Actions(driver);
		WebElement move= driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']"));
		
		a.moveToElement(move).build().perform();
		
		//To enter text in CAPS --> press SHIFT + characters
		//KeyDown is available only for action class 
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("toys").build().perform();
		
		//Doubleclick after entering text selects the text
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
			
		//Right click on an element after mouseover using contectClick()
		a.moveToElement(move).contextClick().build().perform();
	}

}
