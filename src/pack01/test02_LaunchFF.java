package pack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test02_LaunchFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create driver object for Chrome browser
			/*	Class name=X
						X driver = new X(); */
			//Invoke .exe file to invoke selenium it is like API
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arati_pawar\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("haha");
		//driver.findElement(By.className("button r4 wide primary")).click(); This will throw error
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		System.out.println(driver.getTitle());

	}

}
