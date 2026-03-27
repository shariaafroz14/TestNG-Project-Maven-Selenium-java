package Reporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Repoterscript {
  @Test
  public void reporters() {
	  
	  Reporter.log("Setting up the browser and managing the exe file",true);
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  Reporter.log("launching the chrome browser \n");
	  driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  Reporter.log("current page title is :"+ title ,true);
	  driver.quit();
	  
  }
}
