package Listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class listener {
  @Test
  public void Test_Sucess() {
	  
	  System.out.println("this is my success scenario test");
  }
  @Test
  
  public void Test_failure() {
	  System.out.println("this is my failure scenario test case");
	 
  }

  @Test
  
  public void Test_skiped() throws Exception {
	  throw new Exception("this test is skiped");
  }
	  
} 