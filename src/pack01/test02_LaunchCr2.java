package pack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test02_LaunchCr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create driver object for Chrome browser
			/*	Class name=X
						X driver = new X(); */
			//Invoke .exe file to invoke selenium it is like API
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arati_pawar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); //get current URL
		//System.out.println(driver.getPageSource()); //get Page source
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("This is my email");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.linkText("Forgot account?")).click();
		
		driver.navigate().back();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).click();
		driver.findElement(By.className("inputtext")).sendKeys("hello Fool!");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Passwrd");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.close();//closes current browser
		//driver.quit(); //Closes all browsers opened by selenium
		
	}

}
