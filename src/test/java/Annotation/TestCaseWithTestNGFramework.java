package Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseWithTestNGFramework {
		
		WebDriver driver;
		@Test
		
		public void Testcase1() {	
			
		}
		@BeforeClass
		public void beforeClass() {
			
			 WebDriverManager.chromedriver().setup();
		     ChromeOptions option = new ChromeOptions();
		   
		     WebDriver driver = new ChromeDriver();
		     
		     driver.get("https://www.selenium.dev/downloads");
		     driver.manage().window().maximize();
		     driver.manage().deleteAllCookies();
		     driver.manage().timeouts().getImplicitWaitTimeout();
		     
		}
		@AfterClass
		public void afterClass() {
			driver.quit();
		}
		
		     

			
		
	}


