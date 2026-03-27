package MavenTestNg.MavenTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.print("this is my area");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.print("this is my precondation area");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is my postcondation area");
  }  
  @BeforeMethod 
  public void beforeMethod() {
	 System.out.print("i need a valid application url");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.print("close the application of the url");
	  
	  
  }
  }


