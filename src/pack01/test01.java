package pack01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create driver object for Chrome browser
			/*	Class name=X
						X driver = new X(); */
			//Invoke .exe file to invoke selenium it is like API
		System.setProperty("webdriver.ie.driver", "C:\\Users\\arati_pawar\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver(); 
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
