package Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReporterinTestNG {
	
	@Test
	
	public void reporters() {
		
		Reporter.log("setting up the browser and managing the exe file",true);
		Reporter.log("lunching the chrome browser\n");
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	   
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.google.com/");
	     driver.manage().window().maximize();
	     String title= driver.getTitle();
	     Reporter.log("current page title is :+title,true");
	     driver.quit();
		
	}

}
