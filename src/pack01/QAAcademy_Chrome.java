package pack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAAcademy_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		//Going from Appium tab to Soap UI Tab
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
	}

}
