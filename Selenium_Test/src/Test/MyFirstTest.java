package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C://0Java_Projects//Selenium_Test//0Lib//drivers//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.quit();
			
	}

}
