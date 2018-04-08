package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class myfirsttest {
	//init browser 

	@Test
	public void testingfirstNmae () {

		System.setProperty("webdriver.gecko.driver", "/Users/muhammedrislam/selenium_jar_files/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.facebook.com");
		// path of the chrome browser 
		

	}
}	













