package value;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newclass {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver");
WebDriver driver = new FirefoxDriver();
driver.manage().window().fullscreen();
driver.get("http:www.cvs.com");
		
		
		
		
		
		
		
		
		
	}

}
