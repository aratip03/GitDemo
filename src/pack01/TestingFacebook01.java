package pack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingFacebook01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//System.out.println(driver.getPageSource()); //get Page source
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("thisis email");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("This is pass");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.navigate().back();
		//1.	tagname[@attribute='value'] 
		driver.findElement(By.xpath("//*[@type='email']")).clear();
		driver.findElement(By.xpath("//*[@id='pass']")).clear();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("New Email");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("New");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("AgainEmail");
	}

}
