package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arati_pawar\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		Thread.sleep(1000);
		System.out.print(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //For positive acceptance
		driver.switchTo().alert().sendKeys("Hello"); //To send text to edit box in the pop up
		
	}

}
