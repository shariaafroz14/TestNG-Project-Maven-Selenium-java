package RerunAutomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
		
  @Test(retryAnalyzer = Rerunautomationscript.class)
  public void Testmethod() {
	  
	  String title = driver.getTitle();
	  assertEquals(title,"google");
  }
}
