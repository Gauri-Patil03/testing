package mindtree.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fetch {

	@Test

	public static void Test1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.urbanladder.com/");
	     

	}

}
