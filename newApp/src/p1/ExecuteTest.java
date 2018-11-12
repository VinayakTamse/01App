package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExecuteTest {
	
	@Test
	public void Test_01()	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\workspace\\newApp\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

}
