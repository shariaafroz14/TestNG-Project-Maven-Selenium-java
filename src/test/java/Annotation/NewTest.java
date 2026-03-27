package Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void newtest1() {
	  System.out.println("this is my first test case:1");
  }
  @Test
  public void newtest2() {
	  System.out.println("this is my second testcase:2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is my before method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is my after method ");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is my before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.print("this my after class");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.print("this is my before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.print("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is my before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is my after suite");
  }

}
