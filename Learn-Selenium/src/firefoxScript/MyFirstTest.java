package firefoxScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\0Java_Projects\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://hipchat.com");
		  String i = driver.getCurrentUrl();
		  System.out.println(i);
		  String j = driver.getTitle();
		  System.out.println("Your page title Is : "+j);
		  //Assert.assertEquals("Only Testing",j);
		  //Assert.assertEquals("Only Testing",driver.getTitle());
		driver.close();
		
	}

}
