package Annotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotation2 {
	
	@BeforeSuite
	
	public void startedSuite()
	{
		System.out.println("Started suite");
		
	}
    @AfterSuite
    public void endedSuite()
    {
    	System.out.println("ended suite");
    }
    @BeforeTest
    public void facebookLogin()
    {
    	System.out.println("facebook login successfully");
    }
}
